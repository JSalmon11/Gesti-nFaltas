using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EditorDeTexto
{
    public partial class Buscador : Form
    {
        private Editor f;
        public Buscador(Editor f)
        {
            InitializeComponent();
            this.f = f;
        }

        public Buscador(Editor f, String text)
        {
            InitializeComponent();
            this.f = f;
            textBuscarPalabra.Text = text;
        }

        private void buttonBuscar_Click(object sender, EventArgs e)
        {
            f.palabraBuscarOReemplazar(0, textBuscarPalabra.Text, "");
        }
        private void buttonBuscarSiguiente_Click(object sender, EventArgs e)
        {
            f.palabraBuscarOReemplazar(1, textBuscarPalabra.Text, "");
        }

        private void buttonReemplazar_Click(object sender, EventArgs e)
        {
            f.palabraBuscarOReemplazar(2, textBuscarPalabra.Text, textAReemplazar.Text);
        }
    }
}
