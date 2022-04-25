using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestionInstituto
{
    public partial class Form1 : Form
    {
        private List<Alumno> alumnos = new List<Alumno>();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                FileStream f = new FileStream("alumnos.bin", FileMode.Open);
                BinaryFormatter bf = new BinaryFormatter();
                alumnos = (List<Alumno>)bf.Deserialize(f);
                f.Close();
            }
            catch (IOException ex) { }
        }

        private void altaAlumnoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form AltaAlumno = new AltaAlumno(this);
            AltaAlumno.Show();
        }

        internal void altaAlumno(Alumno a)
        {
            alumnos.Add(a);
            FileStream f = new FileStream("alumnos.bin", FileMode.Create);
            BinaryFormatter bf = new BinaryFormatter();
            bf.Serialize(f, alumnos);
            f.Close();
        }

        internal Boolean comprobarRepetidos(string DNI)
        {
            bool t = false;
            for (int i = 0; i < alumnos.Count; ++i)
            {
                if (alumnos[i].dni.Equals(DNI))
                {
                    t = true;
                }
            }
            return t;
        }

        private String toStringAlumno(Alumno a)
        {
            String al = "";
            String modulos = "";
            for (int i = 0; i < a.Modulo.Length; ++i)
            {
                modulos += a.Modulo[i].Nombre+", Nota: "+ a.Modulo[i].Nota+". ";
            }
            al += "Alumno: "+a.Nombre + ", " + a.Apellidos + ". DNI: " + a.dni + ". Email: " + a.Email + ", " + a.Curso + ", Módulos: " + modulos;
            return al;
        }

        private object tipoListado;
        private void sacarAlumnos(object sender, EventArgs e)
        {
            tipoListado = sender;
            listado.Visible = true;
            String c = sender.ToString();
            listado.Items.Clear();
            if (c.Equals("Todos"))
            {
                for (int i = 0; i < alumnos.Count; ++i)
                {
                    if (alumnos[i].Estado)
                    {
                        listado.Items.Add(toStringAlumno(alumnos[i]));
                    }
                }
            }
            else
            {
                String curso = c.Split('º')[0] + " " + c.Split('º')[1];
                for (int i = 0; i < alumnos.Count; ++i)
                {
                    if (alumnos[i].Curso.Equals(curso))
                    {
                        if (alumnos[i].Estado)
                        {
                            listado.Items.Add(toStringAlumno(alumnos[i]));
                        }
                    }
                }
            }
        }

        private void bajaAlumnoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (listado.SelectedItem != null)
            {
                if (MessageBox.Show("¿Seguro que quieres dar de baja a este alumno?", "BAJA", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    object a = listado.SelectedItem;
                    String alDNI = a.ToString().Split(':')[2].Split('.')[0];
                    for (int i = 0; i < alumnos.Count; ++i)
                    {
                        if (alumnos[i].dni.Trim().Equals(alDNI.Trim()))
                        {
                            alumnos[i].Estado = false;
                            sacarAlumnos(tipoListado, e);
                        }
                    }
                }
            }
            else
            {
                MessageBox.Show("Para dar de baja a un alumno selecciónalo primero");
            }
        }
    }
}
