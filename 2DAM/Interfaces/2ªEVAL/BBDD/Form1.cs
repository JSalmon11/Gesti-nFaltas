using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BBDD
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: esta línea de código carga datos en la tabla 'empresaDataSet1.empleados' Puede moverla o quitarla según sea necesario.
            this.empleadosTableAdapter.Fill(this.empresaDataSet1.empleados);

        }

        private void toolStripButtonSave_Click(object sender, EventArgs e)
        {
            empleadosTableAdapter.Update(empresaDataSet1);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DataTable table = empresaDataSet1.Tables["empleados"];
            //FIND
            int numEmp = int.Parse(textBoxNumEmpleado.Text);
            DataRow drs = table.Rows.Find(numEmp);

            if (drs != null)
            {
                richTextBoxSelect.Text += drs.ItemArray[1].ToString() + ", " + drs.ItemArray[2].ToString();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //SELECT
            DataTable table = empresaDataSet1.Tables["empleados"];
            //string filtro = "nombre = '" + textNombre.Text + "'";​

            string sueldo = "sueldo >= " + int.Parse(textBoxSueldo.Text);
            DataRow[] dr = table.Select(sueldo);
            for (int i = 0; i < dr.Length; ++i)
            {
                richTextBoxSueldo.Text += dr[i].ItemArray[1].ToString() + ", " + dr[i].ItemArray[2].ToString() + "\n";
            }
        }

        private void buttonFirst_Click(object sender, EventArgs e)
        {
            empresaDataSet1BindingSource.MoveFirst();
        }

        private void buttonLast_Click(object sender, EventArgs e)
        {
            empresaDataSet1BindingSource.MoveLast();
        }

        private void buttonNext_Click(object sender, EventArgs e)
        {
            empresaDataSet1BindingSource.MoveNext();
        }

        private void buttonPrev_Click(object sender, EventArgs e)
        {
            empresaDataSet1BindingSource.MovePrevious();
        }
    }
}
