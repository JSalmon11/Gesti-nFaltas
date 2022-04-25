using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Empleados
{
    public partial class Form1 : Form
    {
        CEmpleados[] arrayEmpleados = new CEmpleados[0];
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void guardarButton_Click(object sender, EventArgs e)
        {
            if (validarCampos(textNombre.Text, textApellido.Text, textDni.Text, textEmail.Text, textPuesto.Text))
            {
                Array.Resize(ref arrayEmpleados, arrayEmpleados.Length + 1);
                CEmpleados p1 = new CEmpleados(textNombre.Text, textApellido.Text, textDni.Text, textEmail.Text,
                    dateTimeNacimiento.Value.Date.ToString("dd/MM/yyyy"),
                    dateTimeIncorporacion.Value.Date.ToString("dd/MM/yyyy"), textPuesto.Text);
                int i = arrayEmpleados.GetUpperBound(0);
                arrayEmpleados[i] = p1;

                limpiar();
            }
        }

        private bool validarCampos(string nombre, string apellido, string dni, string email, string puesto)
        {
            bool ret = true;

            if (nombre == ""   || nombre.Any(x => char.IsNumber(x))
            || apellido == ""  || apellido.Any(y => char.IsNumber(y))
            || puesto == ""    || puesto == "" || dni == "")
            {
                MessageBox.Show("ERROR: campo vacío o inválido");
                ret = false;
            }

            if (validarDni(dni))
            {
                ret = true;
            }
            else {
                ret = false;
            }

            foreach (var item in arrayEmpleados)
            {
                if (dni == item.getDNI())
                {
                    MessageBox.Show("ERROR: DNI repetido");
                    return false;
                }
            }

            if (!textEmail.Text.Contains("@"))
            {
                MessageBox.Show("ERROR: Formato de email inválido");
                ret = false;
            }

            if (puesto != "o" && puesto != "O" &&
                           puesto != "j" && puesto != "J" &&
                           puesto != "m" && puesto != "M")
            {
                MessageBox.Show("ERROR: Puesto inválido");
                ret = false;
            }

            return ret;
        }

        private Boolean validarDni(string dni)
        {
            if (dni.Length != 9) {
                MessageBox.Show("ERROR: DNI inválido"); return false; }
            
            String dniNum = dni.Substring(0, dni.Length - 1);
            Boolean dniNumV = int.TryParse(dniNum, out int w);
            if (!dniNumV) { MessageBox.Show("ERROR: DNI inválido"); return false; }

            String dniLetra = dni.Substring(dni.Length - 1, 1);
            Boolean dniLetraV = char.TryParse(dniLetra, out char a);
            if (!dniLetraV) { MessageBox.Show("ERROR: DNI inválido"); return false; }
            
            return true;
        }

        private void limpiar()
        {
            textNombre.Text = "";
            textApellido.Text = "";
            textDni.Text = "";
            textEmail.Text = "";
            textPuesto.Text = "";
        }

        private void cancelarButton_Click(object sender, EventArgs e)
        {
            limpiar();
        }
        private void mostrarEmpleado(string puesto)
        {
            mostrarLabel.Text = "";
            foreach (var item in arrayEmpleados)
            {
                if (item.getPuesto()==puesto || item.getPuesto() == puesto.ToUpper())
                {
                    mostrarLabel.Text += item.ToString() + "\n";
                }
            }
            limpiar();
        }

        private void operariosButton_Click(object sender, EventArgs e)
        {
            mostrarEmpleado("o");
        }

        private void jefesButton_Click(object sender, EventArgs e)
        {
            mostrarEmpleado("j");
        }

        private void mantenimientoButton_Click(object sender, EventArgs e)
        {
            mostrarEmpleado("m");
        }
    }
}
