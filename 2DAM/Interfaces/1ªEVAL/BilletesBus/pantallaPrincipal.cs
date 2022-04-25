using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BilletesBus
{
    public partial class pantallaPrincipal : Form
    {
        static usuarios[] arrayUsuarios = new usuarios[0];

        public pantallaPrincipal()
        {
            InitializeComponent();
        }

        public void crearLista(string nombre, string dni, string tlf, string email)
        {
            Array.Resize(ref arrayUsuarios, arrayUsuarios.Length + 1);
            usuarios u1 = new usuarios(nombre, dni, tlf, email);
            int i = arrayUsuarios.GetUpperBound(0);
            arrayUsuarios[i] = u1;
        }

        private void regUsu_Click(object sender, EventArgs e)
        {
            Form registroUsu = new RegistroUsuario(this);
            registroUsu.Show();
        }

        private void compro_Click(object sender, EventArgs e)
        {
            labelUsuarios.Text = "";
            foreach (var item in arrayUsuarios)
            {
                labelUsuarios.Text += item.ToString() + "\n";
            }
        }
    }
}