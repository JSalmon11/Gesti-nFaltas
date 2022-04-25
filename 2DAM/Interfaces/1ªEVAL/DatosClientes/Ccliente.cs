using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DatosClientes
{
    class Ccliente
    {
        private object cliente = new object[3];
        private string titular;
        private int cuenta;
        private string saldo;

        public Ccliente(string Ctitular, int Ccuenta, string Csaldo)
        {
            this.titular = Ctitular;
            this.cuenta = Ccuenta;
            this.saldo = Csaldo;
        }
        public override string ToString()
        {
            return "Cliente: " + titular + ". Cuenta: " + cuenta + ". Saldo: " + saldo+"€";
        }
    }

}