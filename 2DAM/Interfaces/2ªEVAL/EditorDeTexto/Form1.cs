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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void nuevoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Visible = true;
            editor.Enabled = true;
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            editor.Visible = false;
            editor.Enabled = false;
        }

        private void fuentesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form fuentes = new Fuentes();
            fuentes.Show();
        }
    }
}
