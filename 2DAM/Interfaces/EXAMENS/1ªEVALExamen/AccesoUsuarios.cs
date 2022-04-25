using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ExamenGestionAlumnos
{
    public partial class accesoUsuarios : Form
    {
        static Usuarios[] arrayUsuarios = new Usuarios[0];
        private int numUsuarios=0;

        public void setUsuariosLabel()
        {
            labelUsuariosRegistrado.Text += numUsuarios.ToString();
        }

        private void cierre(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("¿Seguro que quieres salir?", "REGISTRO", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
            }
            else
            {
                e.Cancel = true;
            }
        }

        public void setNumUsuarios()
        {
            ++numUsuarios;
        }

        public accesoUsuarios()
        {
            InitializeComponent();
            setArrayUsuarios("","","",DateTime.Now);
        }

        public void setArrayUsuarios(String usr, String pass, String nombre, DateTime fechaNacimiento)
        {
            Array.Resize(ref arrayUsuarios, arrayUsuarios.Length + 1);
            Usuarios u1 = new Usuarios(usr, pass, nombre, fechaNacimiento);
            int i = arrayUsuarios.GetUpperBound(0);
            arrayUsuarios[i] = u1;
        }

        private void accesoUsuarios_Load(object sender, EventArgs e)
        {
            labelUsuariosRegistrado.Text += numUsuarios.ToString();
        }

        private String nombre;
        private void buttonAcceso_Click(object sender, EventArgs e)
        {
            Form registro = new Registro(this);
            if (validarUser())
            {
                Form quejas = new QuejasYReclamaciones(this, nombre);
                quejas.Show();
            }
            else { registro.Show(); }
        }

        private Boolean validarUser()
        {
            if (textUser.Text != "")
            {
                if (textPass.Text != "")
                {
                    foreach (var item in arrayUsuarios)
                    {
                        if (item.getUser() == textUser.Text)
                        {
                            if (item.getPass() == textPass.Text)
                            {
                                nombre = item.getNombre();
                                errorContraseniaIncorrecta.Clear();
                                return true;
                            }
                            else { errorContraseniaIncorrecta.SetError(textPass, "Contraseña incorrecta"); }
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
            return false;
        }

        private void buttonSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
