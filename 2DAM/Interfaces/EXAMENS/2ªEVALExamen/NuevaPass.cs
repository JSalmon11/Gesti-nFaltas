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
    public partial class NuevaPass : Form
    {
        private Form1 form1;
        private List<Alumno> alumnos;

        public NuevaPass()
        {
            InitializeComponent();
        }

        internal NuevaPass(Form1 form1, List<Alumno> alumnos)
        {
            InitializeComponent();
            this.form1 = form1;
            this.alumnos = alumnos;
        }

        private void textBoxDNI_TextChanged(object sender, EventArgs e)
        {
            for (int i = 0; i < alumnos.Count; ++i)
            {
                if (alumnos[i].Dni.Equals(textBoxDNI.Text))
                {
                    textBoxDireccion.Text = alumnos[i].Direccion;
                    textBoxNombre.Text = alumnos[i].Nombre;
                    textBoxEmail.Text = alumnos[i].Email;
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

        private void buttonAceptar_Click(object sender, EventArgs e)
        {
            if (!textBoxPass.Text.Equals(""))
            {
                if (MessageBox.Show("¿Quieres activar el alumno?", "Activar", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    for (int i = 0; i < alumnos.Count; ++i)
                    {
                        if (alumnos[i].Dni.Equals(textBoxDNI.Text))
                        {
                            alumnos[i].Pass = textBoxPass.Text;
                            alumnos[i].Activo = true;
                        }
                    }
                }
                else
                {
                    for (int i = 0; i < alumnos.Count; ++i)
                    {
                        if (alumnos[i].Dni.Equals(textBoxDNI.Text))
                        {
                            alumnos[i].Pass = textBoxPass.Text;
                        }
                    }
                }
            }
            Close();
        }

        private void buttonCancelar_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void buttonVer_Click(object sender, EventArgs e)
        {
            if (textBoxPass!=null)
            {
                if (textBoxPass.PasswordChar=='*')
                {
                    textBoxPass.PasswordChar = '\0';
                }
                else
                {
                    textBoxPass.PasswordChar = '*';
                }
            }
        }
    }
}
