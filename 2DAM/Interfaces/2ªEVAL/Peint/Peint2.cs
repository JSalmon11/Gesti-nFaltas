using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Peint
{
    public partial class Peint2 : Form
    {
        public bool pintar = true;
        public bool borrar = false;
        public bool presionado = false;

        public Peint2()
        {
            InitializeComponent();
        }

        private void lienzo_MouseMove(object sender, MouseEventArgs e)
        {
            // Si se presiono el boton Pintar el Esta presionado el click del mouse "Pintamos"
            if (presionado && pintar)
            {
                Graphics grafico = CreateGraphics();
                grafico.FillEllipse(new SolidBrush(Color.Red), e.X, e.Y, 4, 4);
                grafico.Dispose();
            }
            else if (presionado && borrar)
            {
                Graphics grafico = CreateGraphics();
                grafico.FillEllipse(new SolidBrush(Color.White), e.X, e.Y, 20, 20);
                grafico.Dispose();

            }
        }

        private void lienzo_MouseDown(object sender, MouseEventArgs e)
        {
            presionado = true;
        }

        private void lienzo_MouseUp(object sender, MouseEventArgs e)
        {
            presionado = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            borrar = true;
            pintar = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            pintar = true;
            borrar = false;
        }
    }
}