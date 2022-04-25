using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Validaciones
{
    public static class validar
    {
        public static bool DNI(String dni)
        {
            if (!string.IsNullOrEmpty(dni))
            {
                const string cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
                int numero;
                char letra, letra2;
                // Recupera letra del dni introducido
                letra = Convert.ToChar(dni.Substring(dni.Length - 1));
                letra = char.ToUpper(letra);
                // Recupera numero y comprueba longitud
                if ((dni.Length != 9) && dni.Length < 9)
                {
                    return false;
                }
                if ((dni.Length != 9) && dni.Length > 9)
                {
                    return false;
                }
                if (!int.TryParse(dni.Substring(0, 8), out numero))
                {
                    return false;
                }
                letra2 = cadena[numero % 23];
                if (letra == letra2)
                {
                    return true;
                }
                else { 
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
    }
}