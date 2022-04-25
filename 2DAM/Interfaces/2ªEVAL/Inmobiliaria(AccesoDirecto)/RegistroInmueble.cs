using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Inmobiliaria_AccesoDirecto_
{
    public partial class RegistroInmueble : Form
    {
        private FormPrincipal f;
        public RegistroInmueble(FormPrincipal f)
        {
            InitializeComponent();
            this.f = f;
        }

        private void RegistroInmueble_Load(object sender, EventArgs e)
        {
            listTipo.SelectedIndex = 0;
        }

        private void buttonAccept_Click(object sender, EventArgs e)
        {
            String ventalquiler;
            if (radioAlquiler.Checked)
            {
                ventalquiler = radioAlquiler.Text;
            }
            else{
                ventalquiler = radioVenta.Text;
            }
            f.crearRegistro(listTipo.SelectedItem.ToString(), textDireccion.Text, textLocalidad.Text, textPropietario.Text, Int32.Parse(textTlf.Text), textEmail.Text, ventalquiler);
        }
    }
}