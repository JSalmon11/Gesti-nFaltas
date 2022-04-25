using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DatosClientes
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void texttitular_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textcuenta_TextChanged(object sender, EventArgs e)
        {

        }

        private void textsaldo_TextChanged(object sender, EventArgs e)
        {

        }


        Ccliente[] arrayClientes = new Ccliente[0];
        private void aceptar_Click(object sender, EventArgs e)
        {
           if (texttitular.Text == "" || textcuenta.Text == "" || textsaldo.Text == "")
            {
                MessageBox.Show("ERROR: campo vacío");
            }
            else
            {
                if (textcuenta.Text.Any(x => !char.IsNumber(x)))
                    MessageBox.Show("ERROR: La cuenta tiene que ser un número");
                else
                {
                    decimal val = 0;

                    if (!Decimal.TryParse(textsaldo.Text, out val))
                    {
                        MessageBox.Show("ERROR: El saldo tiene que ser un número"); ;
                    }
                    else
                    {
                        Array.Resize(ref arrayClientes, arrayClientes.Length + 1);
                        Ccliente p1 = new Ccliente(texttitular.Text, int.Parse(textcuenta.Text),
                                                    textsaldo.Text);
                        int i = arrayClientes.GetUpperBound(0);
                        arrayClientes[i] = p1;
                        limpiar();
                    }                   
                }
            }
        }

        private void mostrar_Click(object sender, EventArgs e)
        {
            mostrarArray.Text = "";
            foreach (var item in arrayClientes)
            {
                mostrarArray.Text += item.ToString()+"\n";
            }
            limpiar();
        }

        private void mostrarArray_Click(object sender, EventArgs e)
        {

        }

        private void cancelar_Click(object sender, EventArgs e)
        {
            limpiar();
        }

        private void enter_aceptar(object sender, KeyEventArgs e)
        {
            if (e.KeyCode==Keys.Enter)
            {
                aceptar.PerformClick();
            }
        }

        private void limpiar()
        {
            texttitular.Text = "";
            textcuenta.Text = "";
            textsaldo.Text = "";
        }
    }
}