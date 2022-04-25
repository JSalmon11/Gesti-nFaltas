using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Donantes_de_Sangre
{
    public partial class GestionDonantes : Form
    {
        static Donantes[] arrayDonantes = new Donantes[0];
        public GestionDonantes()
        {
            InitializeComponent();
        }

        private void nuevoDonanteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            groupBusqueda.Visible = false;
            groupRegistro.Visible = true;
            aceptar.Enabled = true;
            buttonBaja.Visible = false;
            buttonBaja.Enabled = false;
            groupSangre.Visible = true;
            checkBoxActivo.Visible = true;
            textDireccion.Visible = true;
            direccion.Visible = true;
        }

        private void aceptar_Click(object sender, EventArgs e)
        {
            String grupo="";
            if (checkA.Checked)
            {
                if (checkB.Checked)
                {
                    grupo = checkA.Text + checkB.Text;
                }
                else { grupo = checkA.Text; }              
            }else if (checkB.Checked)
            {
                grupo = checkB.Text;
            }else if (check0.Checked)
            {
                grupo = check0.Text;
            }
            String RH="";
            if (radioButtonPositivo.Checked)
            {
                RH = radioButtonPositivo.Text;
            }else if (radioButtonNegativo.Checked)
            {
                RH = radioButtonNegativo.Text;
            }
            String activo = "";
            if (checkBoxActivo.Checked)
            {
                activo = "Activo";
            }
            else
            {
                activo = "Inactivo";
            }
            Array.Resize(ref arrayDonantes, arrayDonantes.Length + 1);
            Donantes u1 = new Donantes(textNombre.Text, textDireccion.Text, textTlf.Text, activo,
                grupo, RH);
            int i = arrayDonantes.GetUpperBound(0);
            arrayDonantes[i] = u1;
            limpiar();
        }

        private void limpiar()
        {
            checkBoxActivo.Checked = false;
            textDireccion.Text = "";
            textNombre.Text = "";
            textTlf.Text = "";
            checkA.Checked = true;
            checkB.Checked = false;
            check0.Checked = false;
            radioButtonPositivo.Checked = true;
            radioButtonNegativo.Checked = false;
        }

        private void buscarDonanteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            groupRegistro.Visible = false;
            aceptar.Enabled = false;
            groupBusqueda.Visible = true;
            mostrarLabel.Text = "";
            foreach (var item in arrayDonantes)
            {
                if (item==null) {
                    mostrarLabel.Text = mostrarLabel.Text;
                }
                else {
                    mostrarLabel.Text += item.ToString() + "\n";
                }               
            }
        }

        private void bajaDonanteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            groupBusqueda.Visible = false;
            groupRegistro.Visible = true;
            groupSangre.Visible = false;
            buttonBaja.Visible = true;
            buttonBaja.Enabled = true;
            checkBoxActivo.Visible = false;
            textDireccion.Visible = false;
            direccion.Visible = false;
        }

        private void buttonBaja_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < arrayDonantes.Length; ++i)
            {
                if (textTlf.Text.Equals(arrayDonantes[i].getTlf()))
                {
                    arrayDonantes.SetValue(null, i);
                }
            }
            limpiar();
        }

        private void tiposDisponiblesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            groupRegistro.Visible = false;
            aceptar.Enabled = false;
            groupBusqueda.Visible = true;
            mostrarLabel.Text = "";
            int nAposi = 0;
            int nAnega = 0;
            int nABposi = 0;
            int nABnega = 0;
            int nBposi = 0;
            int nBnega = 0;
            int n0posi = 0;
            int n0nega = 0;
            for (int i = 0; i < arrayDonantes.Length; ++i)
            {
                if (arrayDonantes[i].getGrupo().Equals("A"))
                {
                    if (arrayDonantes[i].getRH().Equals("+"))
                    {
                        ++nAposi;
                    }else if (arrayDonantes[i].getRH().Equals("-"))
                    {
                        ++nAnega;
                    }
                }

                if (arrayDonantes[i].getGrupo().Equals("B"))
                {
                    if (arrayDonantes[i].getRH().Equals("+"))
                    {
                        ++nBposi;
                    }
                    else if (arrayDonantes[i].getRH().Equals("-"))
                    {
                        ++nBnega;
                    }
                }

                if (arrayDonantes[i].getGrupo().Equals("AB"))
                {
                    if (arrayDonantes[i].getRH().Equals("+"))
                    {
                        ++nABposi;
                    }
                    else if (arrayDonantes[i].getRH().Equals("-"))
                    {
                        ++nABnega;
                    }
                }

                if (arrayDonantes[i].getGrupo().Equals("0"))
                {
                    if (arrayDonantes[i].getRH().Equals("+"))
                    {
                        ++n0posi;
                    }
                    else if (arrayDonantes[i].getRH().Equals("-"))
                    {
                        ++n0nega;
                    }
                }
            }
            if (nAposi != 0)
            {
                mostrarLabel.Text += "A+:   " + nAposi+"\n";
            }
            if (nAnega != 0)
            {
                mostrarLabel.Text += "A-:   " + nAnega + "\n";
            }
            if (nBposi != 0)
            {
                mostrarLabel.Text += "B+:   " + nBposi + "\n";
            }
            if (nBnega != 0)
            {
                mostrarLabel.Text += "B+:   " + nBnega + "\n";
            }
            if (nABposi != 0)
            {
                mostrarLabel.Text += "AB+:   " + nABposi + "\n";
            }
            if (nABnega != 0)
            {
                mostrarLabel.Text += "AB-:   " + nABnega + "\n";
            }
            if (n0posi != 0)
            {
                mostrarLabel.Text += "0+:   " + n0posi + "\n";
            }
            if (n0nega != 0)
            {
                mostrarLabel.Text += "0-:   " + n0nega + "\n";
            }
        }

        private void disponibilidadPorTipoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            groupRegistro.Visible = true;
            groupDatosDonante.Visible = false;
            aceptar.Visible = false;
            groupSangre.Visible = true;
            buttonBuscar.Visible = true;
        }

        private void buttonBuscar_Click(object sender, EventArgs e)
        {
            groupRegistro.Visible = false;
            groupDatosDonante.Visible = true;
            aceptar.Visible = true;
            groupSangre.Visible = false;
            buttonBuscar.Visible = false;
            groupBusqueda.Visible = true;
            mostrarLabel.Text = "";
            int cont = 0;
            String tipoSangre = "";
            for (int i = 0; i < arrayDonantes.Length; ++i)
            {
                if (checkA.Checked)
                {
                    if (checkA.Text == arrayDonantes[i].getGrupo())
                    {
                        if (radioButtonPositivo.Checked)
                        {
                            tipoSangre = "A+";
                            ++cont;
                        }
                        if (radioButtonNegativo.Checked)
                        {
                            tipoSangre = "A-";
                            ++cont;
                        }
                    }
                }

                if (checkA.Checked && checkB.Checked)
                {
                    if (checkA.Text+checkB.Text == arrayDonantes[i].getGrupo())
                    {
                        if (radioButtonPositivo.Checked)
                        {
                            tipoSangre = "AB+";
                            ++cont;
                        }
                        if (radioButtonNegativo.Checked)
                        {
                            tipoSangre = "AB-";
                            ++cont;
                        }
                    }
                }

                if (checkB.Checked)
                {
                    if (checkB.Text == arrayDonantes[i].getGrupo())
                    {
                        if (radioButtonPositivo.Checked)
                        {
                            tipoSangre = "B+";
                            ++cont;
                        }
                        if (radioButtonNegativo.Checked)
                        {
                            tipoSangre = "B-";
                            ++cont;
                        }
                    }
                }

                if (check0.Checked)
                {
                    if (check0.Text == arrayDonantes[i].getGrupo()) {
                        if (radioButtonPositivo.Checked)
                        {
                            tipoSangre = "0+";
                            ++cont;
                        }
                        if (radioButtonNegativo.Checked)
                        {
                            tipoSangre = "0-";
                            ++cont;
                        }
                    }
                }
            }
            mostrarLabel.Text += tipoSangre +":     "+ cont;
        }
    }
}