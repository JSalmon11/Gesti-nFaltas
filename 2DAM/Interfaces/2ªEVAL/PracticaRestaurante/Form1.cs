using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PracticaRestaurante
{
    public partial class Form1 : Form
    {
        private int total = 8;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: esta línea de código carga datos en la tabla 'restauranteDataSet1.menus' Puede moverla o quitarla según sea necesario.
            this.menusTableAdapter.Fill(this.restauranteDataSet1.menus);
            //SELECT
            DataTable table = restauranteDataSet1.Tables["menus"];
            //string filtro = "nombre = '" + textNombre.Text + "'";​
            DataRow[] dr = table.Select("Nombre_Plato = 'Macarrones'");

            textBoxNombre.Text = dr[0].ItemArray[0].ToString();
            textBoxPrecio.Text = dr[0].ItemArray[1].ToString();
            textBoxIVA.Text = dr[0].ItemArray[2].ToString();
            if ((bool)dr[0].ItemArray[3])
            {
                checkBoxTemp.Checked = true;
            }
            else
            {
                checkBoxTemp.Checked = false;
            }
            dateDisponible.Value = (DateTime) dr[0].ItemArray[4];
            textPrecioFinal.Text = ((int)dr[0].ItemArray[1] + ((int)dr[0].ItemArray[1] * ((int)dr[0].ItemArray[2] / 100))).ToString() + "€";
            labelActual.Text = "1/" + total;
        }

        private void buttonFirst_Click(object sender, EventArgs e)
        {
            menusBindingSource.MoveFirst();
            labelActual.Text = "1/"+total;
            rellenar();
        }

        private void buttonLast_Click(object sender, EventArgs e)
        {
            menusBindingSource.MoveLast();
            labelActual.Text = total + "/" + total;
            rellenar();
        }

        private void buttonPrev_Click(object sender, EventArgs e)
        {
            menusBindingSource.MovePrevious();
            labelActual.Text = (int.Parse(labelActual.Text.Split('/')[0])-1) + "/" + total;
            rellenar();
        }

        private void buttonNext_Click(object sender, EventArgs e)
        {
            menusBindingSource.MoveNext();
            labelActual.Text = (int.Parse(labelActual.Text.Split('/')[0]) + 1) + "/" + total;
            rellenar();
        }

        private void buttonPrecios_Click(object sender, EventArgs e)
        {
            //SELECT
            DataTable table = restauranteDataSet1.Tables["menus"];

            string sueldo = "Precio_plato < " + int.Parse(textBoxPriceFilter.Text);
            DataRow[] dr = table.Select(sueldo);
            labelMostrar.Text = "Nombre      Precio final\n";
            for (int i = 0; i < dr.Length; ++i)
            {
                labelMostrar.Text += dr[i].ItemArray[0].ToString() + ".      " + ((int)dr[0].ItemArray[1] + ((int)dr[0].ItemArray[1] * ((int)dr[0].ItemArray[2] / 100))).ToString() + "\n";
            }
        }

        private void rellenar()
        {
            textBoxNombre.Text = (((DataRowView)(this.menusBindingSource.Current))[0]).ToString();

            textBoxPrecio.Text = (((DataRowView)(this.menusBindingSource.Current))[1]).ToString();
            textBoxIVA.Text = (((DataRowView)(this.menusBindingSource.Current))[2]).ToString();
            if ((bool)(((DataRowView)(this.menusBindingSource.Current))[3]))
            {
                checkBoxTemp.Checked = true;
            }
            else
            {
                checkBoxTemp.Checked = false;
            }
            dateDisponible.Value = (DateTime)(((DataRowView)(this.menusBindingSource.Current))[4]);
            textPrecioFinal.Text = ((int)(((DataRowView)(this.menusBindingSource.Current))[1]) + ((int)(((DataRowView)(this.menusBindingSource.Current))[1]) * ((int)(((DataRowView)(this.menusBindingSource.Current))[2]) / 100))).ToString() + "€";
        }
    }
}
