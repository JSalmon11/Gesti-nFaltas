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
    public partial class AltaAlumno : Form
    {
        private Form1 form1;

        public AltaAlumno()
        {
            InitializeComponent();
        }

        public AltaAlumno(Form1 form1)
        {
            InitializeComponent();
            this.form1 = form1;
        }

        private void buttonAceptar_Click(object sender, EventArgs e)
        {
            String nombre = textBoxNombre.Text;
            String direccion = textBoxDireccion.Text;
            String DNI = textBoxDNI.Text;
            String email = textBoxEmail.Text;
            String tlf = textBoxTlf.Text;
            String familia = listBoxFamilia.SelectedItem.ToString();
            bool alumnoRepetido = form1.comprobarRepetidos(DNI);
            if (alumnoRepetido)
            {
                errorAlumnoRepetido.SetError(textBoxDNI, "Alumno existente");
            }
            else
            {
                if (email.Contains("@"))
                {
                    Alumno a = new Alumno(nombre, DNI, direccion, familia, tlf, email, null, false);
                    form1.altaAlumno(a);
                    Close();
                }
                else
                {
                    errorEmail.SetError(textBoxEmail, "Email inválido");
                }
            }
        }

        private void textBoxDNI_TextChanged(object sender, EventArgs e)
        {
            errorAlumnoRepetido.Clear();
        }

        private void textBoxEmail_TextChanged(object sender, EventArgs e)
        {
            errorEmail.Clear();
        }

        private void buttonCancelar_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
