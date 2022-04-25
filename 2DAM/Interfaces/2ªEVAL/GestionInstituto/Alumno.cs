using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionInstituto
{
    [Serializable]
    class Alumno 
    {
        private String nombre;
        private String apellidos;
        private String DNI;
        private String email;
        private String curso;
        private bool estado;
        private Modulo[] modulos;

        public Alumno(string nombre, string apellidos, string DNI, string email, string curso, bool estado, Modulo[] modulo)
        {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.DNI = DNI;
            this.email = email;
            this.curso = curso;
            this.estado = estado;
            this.modulos = modulo;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        public string Apellidos { get => apellidos; set => apellidos = value; }
        public string dni { get => DNI; set => DNI = value; }
        public string Email { get => email; set => email = value; }
        public string Curso { get => curso; set => curso = value; }
        public bool Estado { get => estado; set => estado = value; }
        internal Modulo[] Modulo { get => modulos; set => modulos = value; }
    }

    [Serializable]
    class Modulo
    {
        private String curso;
        private String nombre;
        private double nota;

        public Modulo(string curso, string nombre)
        {
            this.Curso = curso;
            this.Nombre = nombre;
            this.Nota = 0;
        }

        public string Curso { get => curso; set => curso = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public double Nota { get => nota; set => nota = value; }
    }
}
