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
    public partial class RegistroUsuario : Form
    {
        private pantallaPrincipal principal;
        public RegistroUsuario()
        {
            InitializeComponent();
        }

        public RegistroUsuario(pantallaPrincipal f)
        {
            InitializeComponent();
            this.principal = f;
        }

        private void cierre(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("¿Seguro que quieres salir?", "REGISTRO", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
            }
            else
            {
                e.Cancel=true;
            }
        }

        private void aceptar_Click(object sender, EventArgs e)
        {
            if (validarcampos())
            {
                principal.crearLista(textNombre.Text, textDni.Text, textTlf.Text, textEmail.Text);
                limpiarForm();               
                this.Close();
            }
        }
        
        private bool validarcampos()
        {
            if (!string.IsNullOrEmpty(textNombre.Text))
            {
                if (!string.IsNullOrEmpty(textTlf.Text))
                {
                    if (!textTlf.Text.Any(x => char.IsNumber(x)))
                    {
                        errorProviderTelefonoInvalido.SetError(textTlf, "Teléfono inválido");
                        return false;
                    }
                    if (!string.IsNullOrEmpty(textDni.Text))
                    {
                        String dni = textDni.Text;
                        const string cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
                        int numero;
                        char letra, letra2;
                        // Recupera letra del dni introducido
                        letra = Convert.ToChar(dni.Substring(dni.Length - 1));
                        letra = char.ToUpper(letra);
                        // Recupera numero y comprueba longitud
                        if ((dni.Length != 9) && dni.Length < 9)
                        {
                            errorProviderDNIcorto.SetError(textDni, "DNI demasiado corto");
                            return false;
                        }else { errorProviderDNIcorto.Clear(); }
                        if ((dni.Length != 9) && dni.Length > 9)
                        {
                            errorProviderDNIlargo.SetError(textDni, "DNI demasiado largo");
                            return false;
                        }else { errorProviderDNIlargo.Clear(); }
                        if (!int.TryParse(dni.Substring(0, 8), out numero))
                        {
                            errorProvider8primerosDigitos.SetError(textDni, "Los 8 primeros dígtos deben ser números");
                            return false;
                        }else { errorProvider8primerosDigitos.Clear(); }
                        letra2 = cadena[numero % 23];
                        if (letra != letra2)
                        {
                            errorProviderDNIinexistente.SetError(textDni, "DNI inexistente");
                            return false;
                        }else { errorProviderDNIinexistente.Clear(); }
                    }
                    else
                    {
                        campoVacio(textDni);
                        return false;
                    }

                    string email = textEmail.Text;
                    if (email.Contains("@"))
                    {
                        String[] mail = email.Split('@');
                        if (!string.IsNullOrEmpty(mail[0]) && !string.IsNullOrEmpty(mail[1]))
                        {
                            if (mail[1].Contains("."))
                            {
                                String[] punto = email.Split('.');
                                if (!string.IsNullOrEmpty(punto[0]) && !string.IsNullOrEmpty(punto[1])
                                || !string.IsNullOrEmpty(punto[0]) && !string.IsNullOrEmpty(punto[1])
                                && !string.IsNullOrEmpty(punto[2]))
                                {
                                    errorProviderEmailInvalido.Clear();
                                    return true;
                                }
                                else
                                {
                                    errorProviderEmailInvalido.SetError(textEmail,"Email inválido");
                                    return false;
                                }
                            }
                            else
                            {
                                errorProviderEmailInvalido.SetError(textEmail, "Email inválido");
                                return false;
                            }
                        }
                        else
                        {
                            errorProviderEmailInvalido.SetError(textEmail, "Email inválido");
                            return false;
                        }
                    }
                    else
                    {
                        errorProviderEmailInvalido.SetError(textEmail, "Email inválido");
                        return false;
                    }
                }
                else
                {
                    errorProviderTelefonoInvalido.Clear();
                    campoVacio(textTlf);
                    return false;
                }
            }
            else if(textNombre.Text.Any(x => char.IsNumber(x)))
            {
                errorProviderNombreInvalido.SetError(textNombre, "Nombre inválido");
                return false;
            }else
            {
                errorProviderNombreInvalido.Clear();
                campoVacio(textNombre);
                return false;
            }           
        }

        private void limpiarForm()
        {
            textDni.Text = "";
            textEmail.Text = "";
            textNombre.Text = "";
            textTlf.Text = "";
        }

        private void campoVacio(TextBox vacio)
        {
            if (vacio.Text == "")
            {
                errorProvider1.SetError(vacio, "Campo vacío");
            }
        }

        private void textNombre_TextChanged_1(object sender, EventArgs e)
        {
            if (textNombre.Text == "")
            {
                errorProvider1.SetError(textNombre, "Campo vacío");
            }
            else
            {
                errorProvider1.Clear();
            }
        }

        private void textDni_TextChanged(object sender, EventArgs e)
        {
            if (textDni.Text == "")
            {
                errorProvider1.SetError(textDni, "Campo vacío");
            }
            else
            {
                errorProvider1.Clear();
            }
        }

        private void textTlf_TextChanged(object sender, EventArgs e)
        {
            if (textTlf.Text == "")
            {
                errorProvider1.SetError(textTlf, "Campo vacío");
            }
            else
            {
                errorProvider1.Clear();
            }
        }

        private void textEmail_TextChanged(object sender, EventArgs e)
        {
            if (textEmail.Text == "")
            {
                errorProvider1.SetError(textEmail, "Campo vacío");
            }
            else
            {
                errorProvider1.Clear();
            }
        }

    }
}