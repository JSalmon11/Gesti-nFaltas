using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExamenGestionAlumnos
{
    class Usuarios
    {
        private string usr;
        private string pass;
        private string nombre;
        private DateTime fechaNacimiento;

        public Usuarios(string usr, string pass, string nombre, DateTime fechaNacimiento)
        {
            this.usr = usr;
            this.pass = pass;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getUser()
        {
            return usr;
        }

        public String getPass()
        {
            return pass;
        }

        public String getNombre() {
            return nombre;
        }
    }
}
