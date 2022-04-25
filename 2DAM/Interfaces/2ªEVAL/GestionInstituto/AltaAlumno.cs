using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestionInstituto
{
    public partial class AltaAlumno : Form
    {
        private Form1 f;

        public AltaAlumno()
        {
            InitializeComponent();
        }

        public AltaAlumno(Form1 form1)
        {
            InitializeComponent();
            this.f = form1;
            listCursos.SelectedIndex = 0;
            labelModulos.Visible = true;
            groupSegundo.Visible = false;
            groupPrimero.Visible = true;
        }

        private void listCursos_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (listCursos.SelectedItem.ToString().Split(' ')[0].Equals("1"))
            {
                groupSegundo.Visible = false;
                groupPrimero.Visible = true;
            }else
            {
                groupPrimero.Visible = false;
                groupSegundo.Visible = true;
            }
        }

        private void buttonRegistrar_Click(object sender, EventArgs e)
        {
            String nombre = textBoxNombre.Text;
            String apel = textBoxApellido.Text;
            String DNI = textBoxDNI.Text;
            String email = textBoxEmail.Text;
            String curso = listCursos.SelectedItem.ToString();
            Modulo[] modulos;
            bool alumnoRepetido = f.comprobarRepetidos(DNI);
            if (alumnoRepetido)
            {
                errorAlumnoRepetido.SetError(textBoxDNI, "Alumno existente");
            }
            else
            {
                if (curso.Split(' ')[0].Equals("1"))
                {
                    modulos = addModulos1();
                }
                else
                {
                    modulos = addModulos2();
                }
                Alumno a = new Alumno(nombre, apel, DNI, email, curso, true, modulos);
                f.altaAlumno(a);
                Close();
            }
        }

        private Modulo[] addModulos1()
        {
            Modulo[] m = new Modulo[0];
            if (prog.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("1", "Programación");
            }
            if (bbdd.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("1", "Base de Datos");
            }
            if (marcas.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("1", "Lenguaje de Marcas");
            }
            if (sist.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("1", "Sistemas");
            }
            if (fol.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("1", "FOL");
            }
            if (entornos.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("1", "Entornos");
            }
            return m;
        }

        private Modulo[] addModulos2()
        {
            Modulo[] m = new Modulo[0];
            if (sge.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("2", "SGE");
            }
            if (interfaces.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("2", "Interfaces");
            }
            if (progMultimedia.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("2", "Programación multimedia");
            }
            if (eie.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("2", "EIE");
            }
            if (ingles.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("2", "Inglés");
            }
            if (procesos.Checked)
            {
                Array.Resize(ref m, m.Length + 1);
                m[m.GetUpperBound(0)] = new Modulo("2", "Procesos");
            }
            return m;
        }

        private void textBoxDNI_TextChanged(object sender, EventArgs e)
        {
            errorAlumnoRepetido.Clear();
        }
    }
}
