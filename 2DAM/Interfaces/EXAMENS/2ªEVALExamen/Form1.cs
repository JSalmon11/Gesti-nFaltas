using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Examen2ªEVAL
{
    public partial class Form1 : Form
    {
        private List<Alumno> alumnos = new List<Alumno>();
        private String file;
        public Form1()
        {
            InitializeComponent();
        }

        private void crearToolStripMenuItem_Click(object sender, EventArgs e)
        {
            SaveFileDialog saveFileDialog = new SaveFileDialog();
            saveFileDialog.DefaultExt = "bin";
            saveFileDialog.Filter = "Text files (*.bin)|*.bin";
            saveFileDialog.ShowDialog();
            file = saveFileDialog.FileName;
            altaAlumnoToolStripMenuItem.Enabled = true;
            consultaAlumnoToolStripMenuItem.Enabled = true;
            nuevaContraseñaToolStripMenuItem.Enabled = true;
        }

        private void abrirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.ShowDialog();
            file = openFileDialog.FileName;
            FileStream f = new FileStream(file, FileMode.Open);
            BinaryFormatter bf = new BinaryFormatter();
            try
            {
                altaAlumnoToolStripMenuItem.Enabled = true;
                consultaAlumnoToolStripMenuItem.Enabled = true;
                nuevaContraseñaToolStripMenuItem.Enabled = true;
                alumnos = (List<Alumno>)bf.Deserialize(f);
            }
            catch(SerializationException ex) {}
            f.Close();
        }

        private void cerrarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            altaAlumnoToolStripMenuItem.Enabled = false;
            consultaAlumnoToolStripMenuItem.Enabled = false;
            nuevaContraseñaToolStripMenuItem.Enabled = false;
            FileStream f = new FileStream(file, FileMode.Create);
            BinaryFormatter bf = new BinaryFormatter();
            bf.Serialize(f, alumnos);
            f.Close();
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void altaAlumnoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AltaAlumno f = new AltaAlumno(this);
            f.ShowDialog();
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
                if (alumnos[i].Dni.Equals(DNI))
                {
                    t = true;
                }
            }
            return t;
        }

        private void administrativoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ConsultaAlumno f = new ConsultaAlumno(this, alumnos, "Administrativo");
            f.ShowDialog();
        }

        private void comercioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ConsultaAlumno f = new ConsultaAlumno(this, alumnos, "Comercio");
            f.ShowDialog();
        }

        private void informáticaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            ConsultaAlumno f = new ConsultaAlumno(this, alumnos, "Informática");
            f.ShowDialog();
        }

        private void nuevaContraseñaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            NuevaPass f = new NuevaPass(this, alumnos);
            f.ShowDialog();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
