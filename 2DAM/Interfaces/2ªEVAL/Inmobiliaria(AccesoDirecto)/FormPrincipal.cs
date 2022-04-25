using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Inmobiliaria_AccesoDirecto_
{
    public partial class FormPrincipal : Form
    {
        public FormPrincipal()
        {
            InitializeComponent();
        }

        public void crearRegistro(String tipo, String direccion, String localidad, String propietario, int tlf, String email, String ventalquiler)
        {
            FileStream fs = new FileStream("datos", FileMode.Create, FileAccess.Write);
            BinaryWriter bw = new BinaryWriter(fs);
            fs.Seek(0, (SeekOrigin)fs.Length);
            bw.Write(tipo);
            bw.Write(direccion);
            bw.Write(localidad);
            bw.Write(propietario);
            bw.Write(tlf);
            bw.Write(email);
            bw.Write(ventalquiler);
            bw.Close();
            fs.Close();
        }

        private void nuevoToolStripMenuItem_Click_1(object sender, EventArgs e)
        {
            Form register = new RegistroInmueble(this);
            register.Show();
        }

        private void todosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listAll.Visible = true;
            FileStream fs = new FileStream("datos", FileMode.Open, FileAccess.Read);
            BinaryReader br = new BinaryReader(fs);
            fs.Seek(0,0);
            try {
                listAll.Items.Add(br.ReadString() + ", " + br.ReadString());
                br.ReadString();
                br.ReadString();
                br.ReadInt32();
                br.ReadString();
                br.ReadString();
            }catch (EndOfStreamException){ 
            }
        }
    }
}
