using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FormularioAcceso
{
    public partial class Form1 : Form
    {
        int contclick = 1;
        public Form1()
        {
            InitializeComponent();
        }

        
        private void aceptar_Click(object sender, EventArgs e)
        {
            if (contclick == 3)
            {
                aceptar.Enabled = false;
                this.Close();
            }

            if (contclick == 2)
            {
                max3.Visible = true;
            }

            if (contclick > 3)
            {
                aceptar.Enabled = false;
            }

            if (textlogin.Text=="" || textpass.Text == "")
            {
                error.Visible = true;
            }
            else
            {
                literal.Visible = true;
                literal.Text = "Hola " + textlogin.Text + " tu contraseña es: " + textpass.Text;
                error.Visible = false;
            }
            ++contclick;
        }


        private void textlogin_TextChanged(object sender, EventArgs e)
        {

        }

        private void textpass_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
