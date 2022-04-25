using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class Form1 : Form
    {
        private string operando1;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void escribe(object sender, EventArgs e)
        {
          Button b = (Button)sender;
            resultado.Text +=b.Text;
        }

        private void igual_Click(object sender, EventArgs e)
        {
            int solucion=0;
            string res = resultado.Text.Substring(operando1.Length);
            string operador = res.Substring(1,1);
            string operando2 = res.Substring(1);
            if (operador.Contains("+")){
                solucion=int.Parse(operando1) + int.Parse(operando2);
            }
            if (operador.Contains("-"))
            {
                solucion = int.Parse(operando1) - int.Parse(operando2);
            }
            if (operador.Contains("/"))
            {
                solucion = int.Parse(operando1) / int.Parse(operando2);
            }
            if (operador.Contains("*"))
            {
                solucion = int.Parse(operando1) * int.Parse(operando2);
            }

            resultado.Text = solucion + "";
        }

        private void Cborrar1_Click(object sender, EventArgs e)
        {
            resultado.Text = resultado.Text.Remove(resultado.Text.Length - 1);
        }

        private void CEborrar_Click(object sender, EventArgs e)
        {
            resultado.Text = " ";
        }

        private void mas_Click(object sender, EventArgs e)
        {
            escribe(sender, e);
            operando1 = resultado.Text.Substring(1,1);
            operando1 += resultado.Text.Substring(operando1.Length+1, (resultado.Text.Length-3));
        }

        private void menos_Click(object sender, EventArgs e)
        {
            escribe(sender, e);
            operando1 = resultado.Text.Substring(0, resultado.Text.Length - 1);
        }

        private void multiplica_Click(object sender, EventArgs e)
        {
            escribe(sender, e);
            operando1 = resultado.Text.Substring(0, resultado.Text.Length - 1);
        }

        private void divide_Click(object sender, EventArgs e)
        {
            escribe(sender, e);
            operando1 = resultado.Text.Substring(0, resultado.Text.Length - 1);
        }
    }
}
