using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace Examen2ªEVAL
{
    public partial class ConsultaAlumno : Form
    {
        private Form1 form1;
        private List<Alumno> alumnos;
        private String fam;

        public ConsultaAlumno()
        {
            InitializeComponent();
        }

        internal ConsultaAlumno(Form1 form1, List<Alumno> alumnos, String fam)
        {
            InitializeComponent();
            this.form1 = form1;
            this.alumnos = alumnos;
            this.fam = fam;
        }

        private void ConsultaAlumno_Load(object sender, EventArgs e)
        {
            for (int i = 0; i < alumnos.Count; ++i)
            {
                if (alumnos[i].Familia.Equals(fam))
                {
                    listAlumnos.Items.Add(alumnos[i].Nombre);
                }
            }
        }

        private void listAlumnos_SelectedIndexChanged(object sender, EventArgs e)
        {
            for (int i = 0; i < alumnos.Count; ++i)
            {
                if (alumnos[i].Nombre.Equals(listAlumnos.SelectedItem.ToString()))
                {
                    textBoxDireccion.Text = alumnos[i].Direccion;
                    textBoxNombre.Text = alumnos[i].Nombre;
                    textBoxEmail.Text = alumnos[i].Email;
                    textBoxDNI.Text = alumnos[i].Dni;
                    textBoxTlf.Text = alumnos[i].Tlf;
                    if (alumnos[i].Activo)
                    {
                        checkBoxActivo.Checked = true;
                    }
                    else
                    {
                        checkBoxActivo.Checked = false;
                    }
                }
            }
        }
    }
}
