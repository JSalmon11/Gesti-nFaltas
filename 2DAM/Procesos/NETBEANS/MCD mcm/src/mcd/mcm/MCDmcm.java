package mcd.mcm;
import java.util.Scanner;
public class MCDmcm {
    static Scanner scanner = new Scanner(System.in);  
    public static void main(String[] args) {
        int NumeroNumeros = PedirLimiteNumeros();      
        if (NumeroNumeros <= 0)
            System.out.println("Finalizando programa");       
        else{
            int [] Numeros = new  int[NumeroNumeros];
            Numeros = PedirNumeros(NumeroNumeros);
            int NumeroMaximo = SacarNumeroMaximo(Numeros);
            System.out.println("Minimo Comun Multiplo " + MinimoComunMultiplo(NumeroMaximo, Numeros));
            int NumeroMaximoDivisores = SacarNumeroMaximodeDivisores(Numeros);
            int [][] Divisores = CrearArrayDivisores(NumeroNumeros, NumeroMaximoDivisores, Numeros);
            System.out.println("Maximo Comun Divisor " + MaximoComunDivisor(Divisores));
        }
    }// main
    
    private static int PedirLimiteNumeros(){
        System.out.println("¿Cuantos numeros quieres introducir?");
        return scanner.nextInt();
    }// PedirLimiteNumeros
    
    private static int [] PedirNumeros(int EspacioArray){
        int [] Numeros = new  int[EspacioArray];       
        for(int i = 0; i < Numeros.length; i++){
            System.out.println("Escribe un numero");     
            Numeros[i] = scanner.nextInt();
        }
        return Numeros;
    }// PedirNumeros
    
    private static int SacarNumeroMaximo(int [] Numeros){
        int NumeroMaximo = 0;        
        for(int i = 0; i< Numeros.length; i++)
            if(Numeros[i]>NumeroMaximo)
                NumeroMaximo = Numeros[i];       
        return NumeroMaximo;
    }// SacarNumeroMaximo
    
    private static int SacarNumeroMaximodeDivisores(int[] Numeros){
        int ActualDivisores, MaximosDivisores = 0;                
        for(int i = 0; i < Numeros.length; i++){
            ActualDivisores=0;           
            for(int j = Numeros[i]; j>0; j--){
                if (Numeros[i]%j == 0)                  
                    ActualDivisores++;               
                if (MaximosDivisores < ActualDivisores) 
                    MaximosDivisores = ActualDivisores;                              
            }
        }        
        return MaximosDivisores;
    }// SacarNumeroMaximodeDivisores
    
    private static int [][] CrearArrayDivisores(int LimiteNumeros, int MaxDivisores, int[] Numeros){
        int [][] Divisores= new int [LimiteNumeros][MaxDivisores];
        int ContadorDivisores;        
        for(int i = 0; i < Numeros.length; i++){   
            ContadorDivisores=0;            
            for(int j = Numeros[i]; j > 0 && ContadorDivisores < Divisores[0].length; j--)
                if (Numeros[i]%j == 0){                  
                   Divisores[i][ContadorDivisores] = j;
                   ContadorDivisores++;  
                }
        }
        return Divisores;                    
    }// CrearArrayDivisores
    
    private static int MaximoComunDivisor(int [][] Divisores){
        int MCM = 1, Coincidencias;      
        /*Recorre todos los valores del array bidimensional comparandolos entre ellos en busca de un numero de coincidencias igual al del tamaño del array.
        
           -El primer for obtiene un numero para comparar del primer conjunto de numeros en el array bidimensional y 
            se rompe al encontrar el numero de coincidencias adecuado.
        
           -El Segundo grupo de for anidados compara el resto de conjunto de numeros en el array en busca de coincidencias, para ahorrar tiempo 
            el segundo for del grupo (K) se rompe al encontrar una coincidencia.
        */
        for(int i = 0; i < Divisores[0].length; i++ ){       
            Coincidencias = 0;
            MCM = Divisores[0][i];
            
            for(int j = 0; j < Divisores.length; j++)
                for(int k = 0; k < Divisores[0].length; k++)
                    if(MCM == Divisores[j][k]){
                        Coincidencias++ ; break;
                    }
            if(Coincidencias == Divisores.length )
                break;
        }
            return MCM;
    }// MaximoComunDivisor
    
    private static int MinimoComunMultiplo(int NumeroMaximo, int [] Numeros){
        Boolean MinimoEncontrado = false;
        int contador = 1, MinimoComunMultiplo = 0;       
        while(!MinimoEncontrado){            
            MinimoComunMultiplo = NumeroMaximo * contador;                    
            for(int i = 0; i < Numeros.length; i++)
                if(MinimoComunMultiplo % Numeros[i] != 0){
                    MinimoEncontrado = false;
                    break;
                }
                else{
                    MinimoEncontrado = true;
                }            
            contador++;
        }               
            return MinimoComunMultiplo;
    }// MinimoComunMultiplo
}// MCDmcm