using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Empleados
{
    public class CEmpleados
    {
        private string nombre;
        private string apellido;
        private string dni;
        private string email;
        private string fechaNac;
        private string fechaIncor;
        private string puesto;

        public CEmpleados(string nombre, string apellido, string dni, string email,
            string fechaNac, string fechaIncor, string puesto)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.email = email;
            this.fechaNac = fechaNac;
            this.fechaIncor = fechaIncor;
            this.puesto = puesto;
        }
        public override string ToString()
        {
            return "Empleado: "+nombre+apellido+". DNI: "+dni+". email: "+email+". Fecha de nacimiento: "+
                fechaNac+". Fecha de incorporación: "+fechaIncor;
        }

        public string getPuesto()
        {
            return puesto;
        }

        public string getDNI()
        {
            return dni;
        }
    }
}
