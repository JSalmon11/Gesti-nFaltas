using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TrabajoConFechas
{
    public partial class Ventana1 : Form
    {
        public Ventana1()
        {
            InitializeComponent();
        }

        private void TextFechaNacim_TextChanged(object sender, EventArgs e)
        {

        }

        private void dateTimePickerCumple_ValueChanged(object sender, EventArgs e)
        {
            DateTime f = dateTimePickerCumple.Value;
            fecha.Text = f.ToLongDateString();
        }

        private void fecha_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {

        }
    }
}
