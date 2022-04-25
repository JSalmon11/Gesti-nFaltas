using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Examen2ªEVAL
{
    [Serializable]
    class Alumno
    {
        private String nombre;
        private String DNI;
        private String direccion;
        private String familia;
        private String tlf;
        private String email;
        private String pass;
        private bool activo;

        public Alumno(string nombre, string dNI, string direccion, string familia, string tlf, string email, string pas, bool activo)
        {
            this.nombre = nombre;
            DNI = dNI;
            this.direccion = direccion;
            this.familia = familia;
            this.tlf = tlf;
            this.email = email;
            this.pass = pas;
            this.activo = activo;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Direccion { get => direccion; set => direccion = value; }
        public string Dni { get => DNI; set => DNI = value; }
        public string Email { get => email; set => email = value; }
        public string Familia { get => familia; set => familia = value; }
        public string Tlf { get => tlf; set => tlf = value; }
        public string Pass { get => pass; set => pass = value; }
        public bool Activo { get => activo; set => activo = value; }

    }
}
