using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Donantes_de_Sangre
{
    class Donantes
    {
        private string nombre;
        private string direccion;
        private string tlf;
        private string activo;
        private string grupo;
        private string rH;

        public Donantes(string text1, string text2, string text3, string text4, string grupo, string rH)
        {
            this.nombre = text1;
            this.direccion = text2;
            this.tlf = text3;
            this.activo = text4;
            this.grupo = grupo;
            this.rH = rH;
        }
        public string getTlf()
        {
            return tlf;
        }
        public string getGrupo()
        {
            return grupo;
        }
        public string getRH()
        {
            return rH;
        }
        public override string ToString()
        {
            return "Donante: " + nombre + ". Dirección: " + direccion + ". Teléfono: " + tlf + ". Activo: " +
                activo + ". Sangre: " + grupo+rH;
        }
    }
}