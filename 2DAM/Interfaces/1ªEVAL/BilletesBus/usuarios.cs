using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BilletesBus
{
    class usuarios
    {
        private string nombre;
        private string dni;
        private string tlf;
        private string email;

        public usuarios(string nombre, string dni, string tlf, string email)
        {
            this.nombre = nombre;
            this.dni = dni;
            this.tlf = tlf;
            this.email = email;
        }
        public override string ToString()
        {
            return "Usuario: " + nombre+ ". DNI: " + dni + ". Teléfono: " + tlf+ ". Email: " + email;
        }
    }
}
