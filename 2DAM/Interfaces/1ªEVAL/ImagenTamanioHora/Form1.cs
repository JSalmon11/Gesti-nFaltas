using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ImagenTamanioHora
{
    public partial class Form1 : Form
    {
        int j, k;
        public Form1()
        {
            InitializeComponent();
            hora.Text = DateTime.Now.ToShortTimeString(); //Muestra la hora actual al iniciar vla ventana
        }

        private void moresize_Click(object sender, EventArgs e)
        {
            j = Imagen.Size.Width;
            k = Imagen.Size.Height;
            j = j + 10;
            k = k + 10;
            Imagen.Size = new Size(j, k);
        }

        private void hora_Click(object sender, EventArgs e)
        {
            
        }

        private void lesssize_Click(object sender, EventArgs e)
        {
            j = Imagen.Size.Width;
            k = Imagen.Size.Height;
            j = j - 10;
            k = k - 10;
            Imagen.Size = new Size(j, k);
        }

        private void timer_Tick(object sender, EventArgs e)
        {
            hora.Text = DateTime.Now.ToShortTimeString();
        }
    }
}
