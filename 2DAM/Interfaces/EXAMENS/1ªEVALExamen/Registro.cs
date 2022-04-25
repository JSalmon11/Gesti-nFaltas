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
    public partial class Registro : Form
    {
        private accesoUsuarios f;

        public Registro(accesoUsuarios f)
        {
            InitializeComponent();
            this.f = f;
        }

        private void Registro_Load(object sender, EventArgs e)
        {

        }

        private void textUser_TextChanged(object sender, EventArgs e)
        {
            if (textUser.Text == "")
            {
                errorUserVacio.SetError(textUser, "Campo vacío");
            }
            else
            {
                errorUserVacio.Clear();
                if (textUser.Text.Length > 5)
                {
                    errorUserMax5.SetError(textUser, "Máximo 5 caracteres");
                }
                else { errorUserMax5.Clear(); }
            }
        }

        private void textPass_TextChanged(object sender, EventArgs e)
        {
            if (textPass.Text == "")
            {
                errorPassVacio.SetError(textPass, "Campo vacío");
            }
            else
            {
                errorPassVacio.Clear();
                if (textPass.Text.Length > 8)
                {
                    errorPassMax8.SetError(textPass, "Máximo 8 caracteres");
                }
                else { errorPassMax8.Clear(); }
            }
        }

        private Boolean validarCampos()
        {
            if (textUser.Text!="" && textPass.Text!="" && textPass.Text.Length <= 8 && textUser.Text.Length <= 5)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        private void buttonGuardar_Click(object sender, EventArgs e)
        {
            if (validarCampos())
            {
                f.setNumUsuarios();
                f.setArrayUsuarios(textUser.Text, textPass.Text, textNombre.Text, dateFechaNacimiento.Value);
                f.setUsuariosLabel();
                this.Close();
            }
        }

        private void buttonVolver_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
