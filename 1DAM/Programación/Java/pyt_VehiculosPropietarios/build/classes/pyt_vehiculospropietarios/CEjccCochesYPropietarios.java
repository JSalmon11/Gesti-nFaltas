/* Sea la base de datos llamada DatosCoches y dos tablas relacionadas Propietarios y Coches,
donde Propietarios es la tabla principal de la relación con DNI como clave principal y
Coches es la tabla relacionada con Matrícula como clave principal:

CREATE TABLE PROPIETARIOS (DNI VARCHAR(10) Primary Key, Nombre VARCHAR(40), Edad INTEGER);
CREATE TABLE COCHES (Matricula VARCHAR(10) Primary Key, Marca VARCHAR(20), Precio INTEGER, DNI VARCHAR (10),
	FOREIGN KEY (DNI) References P ropietarios(DNI));	

INSERT INTO Propietarios values('1A','Pepe',30);
INSERT INTO Propietarios values('1B','Ana',40);
INSERT INTO Propietarios values('1C','Maria',50);
INSERT INTO Coches values('MA1111','Opel',1000,'1A');
INSERT INTO Coches values('MA 2222','Renault',2000,'1A');
INSERT INTO Coches values('BA3333', 'Seat', 3000,'1B');

Realizar lo siguiente:
a) Dar de alta propietarios y sus respectivos coches.
b) Dado el dni del propietario, listar sus datos y los coches que posee.
c) Insertar coches para verificando que el dni del propietario ya existe en la tabla
propietarios, si no existe, no permitirá la inserción del nuevo coche.
d) Borrar de la BD a un propietario (borrando también los coches de este propietario). */

package pyt_vehiculospropietarios;
import java.sql.*;
import java.util.Scanner;
public class CEjccCochesYPropietarios {
    static Connection  poConexion;    
    static Statement   poInstruccion;  
    static ResultSet   poTabla; 
    
    public static void main(String args[]){
        mvApartado_B();
    }//main()	
    public static void mvConectarConBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String wsProtocolo_Driver_Pc_Bd = "jdbc:mysql://localhost/bd01";
            poConexion = DriverManager.getConnection (wsProtocolo_Driver_Pc_Bd,"root","");
            poInstruccion = poConexion.createStatement();
        }
        catch(ClassNotFoundException	e) {System.out.println("<mvConectarConBD--Class> "+e);}
        catch(SQLException                            e) {System.out.println("<mvConectarConBD-Sql> "+e);}
        catch(Exception                                  e) {System.out.println("<mvConectarConBD-Exception> "+e);}
    }//mvConcectarConBD ()
    public static void mvDesconectarConBD(){
        try {
            if (null != poTabla)        poTabla.close();
            if (null != poInstruccion)  poInstruccion.close();
            if (null != poConexion)     poConexion.close();
        }
        catch(Exception 		e) {System.out.println("<mvDesconectarConBD-Exception> "+e);}
    }//mvDesconectarConBD ()

    public static void main1(){  
        mvConectarConBD();
        try {
            poTabla= poInstruccion.executeQuery("SELECT k, asNb FROM tJava;");
            System.out.println("Codigo\tNombre");
            while(poTabla.next()) 
                System.out.println(poTabla.getInt(1)+"\t"+ poTabla.getString("asNb"));
        }
        catch(SQLException 		e) {System.out.println(". "+e);}
        catch(Exception 		e) {System.out.println(".. "+e);}
        mvDesconectarConBD();
    }//main1 ()
    public static void main2(){        
        try {
            boolean wb;
            int wi;
            wb = poInstruccion.execute("Drop table if exists tJava;");           
            wb = poInstruccion.execute("create table tJava (k int, asNb varchar(33));"); 

            wi = poInstruccion.executeUpdate("insert into tJava values (1, \"aaa\");");
            wi = poInstruccion.executeUpdate("insert into tJava values (2, \"bbb\");");
            wi = poInstruccion.executeUpdate("insert into tJava values (3, \"ccc\");");
            wi = poInstruccion.executeUpdate("update tJava set asNb = \"aaaa-dos\" where k = 1;");
            wi = poInstruccion.executeUpdate("delete from tJava where (k = 2);");

            poTabla= poInstruccion.executeQuery("SELECT k, asNb FROM tJava");
            System.out.println("Codigo\tNombre");
            while(poTabla.next()) 
                System.out.println(poTabla.getInt("k")+"\t"+poTabla.getString(2));
        }
        catch(SQLException 		e) {System.out.println(". "+e);}
        catch(Exception                                  e) {System.out.println(".. "+e);}
    }//main2 ()

    public static void mvApartado_A(){        
        mvConectarConBD();
        try {
            boolean wb;
            int wi;

            wb = poInstruccion.execute("Drop table if exists tCoches;");           
            wb = poInstruccion.execute("Drop table if exists tPropietarios;");           

            wb = poInstruccion.execute("create table tPropietarios "+
                    "(DNI VARCHAR(10) Primary Key, Nombre VARCHAR(40), Edad INTEGER);"); 
            wb = poInstruccion.execute("create table tCoches "+
                    "(Matricula VARCHAR(10) Primary Key, Marca VARCHAR(20), "+
                    " Precio INTEGER, DNI VARCHAR (10),"+
                    " FOREIGN KEY (DNI) References tPropietarios(DNI));");  
            
            wi = poInstruccion.executeUpdate("INSERT INTO tPropietarios values('1A','Pepe',  30);");
            wi = poInstruccion.executeUpdate("INSERT INTO tPropietarios values('1C','Maria', 50);");
            wi = poInstruccion.executeUpdate("INSERT INTO tPropietarios values('1B','Ana',   40);");

            wi = poInstruccion.executeUpdate("INSERT INTO tCoches values('MA1111', 'Opel',   1000,'1A');");
            wi = poInstruccion.executeUpdate("INSERT INTO tCoches values('MA 2222','Renault',2000,'1A');");
            wi = poInstruccion.executeUpdate("INSERT INTO tCoches values('BA3333', 'Seat',   3000,'1B');");
        }
        catch(SQLException 		e) {System.out.println("<mvApartado_A-Sql> "+e);}
        catch(Exception 		e) {System.out.println("<mvApartado_A-Exception> "+e);}               
        mvDesconectarConBD();        
    }//mvApartado_A ()    
    public static void mvApartado_B(){        
        //b) Dado el dni del propietario, listar sus datos y los coches que posee.
        Scanner woTeclado = new Scanner(System.in);
        mvConectarConBD();
        try {
            String ws; 
            System.out.print("Dime el Dni: "); ws = woTeclado.nextLine().trim();
            poTabla= poInstruccion.executeQuery("SELECT * FROM tPropietarios where (dni = '" + ws + "');");

            if (!poTabla.next()) 
                System.out.println("Con ese Dni no hay ningún propietario.");
            else{
                System.out.println("Dni\tNombre\t\tEdad");
                System.out.println("---\t------\t\t----");
                System.out.println(poTabla.getString("Dni")+"\t" + poTabla.getString("Nombre")+"\t\t" + poTabla.getInt("Edad"));
                
                System.out.println("Sus coches son:");
                poTabla= poInstruccion.executeQuery(
                        "SELECT Matricula, Marca, Precio FROM tCoches where (dni = '"+ ws +"');");
                int wi = 0;
                System.out.println("Matricula\tMarca\tPrecio");
                System.out.println("---------\t-----\t------");
                while(poTabla.next()) {
                    System.out.println(     poTabla.getString("Matricula")  +"\t\t"+ 
                            poTabla.getString("Marca")      +"\t"+ 
                            poTabla.getInt   ("Precio")     );                               
                    wi++;
                }
                if (wi==0) System.out.println("--- Este señor/a no tiene ningún coche.");
            }
        }
        catch(SQLException 		e) {System.out.println("<mvApartado_A-Sql> "+e);}
        catch(Exception 		e) {System.out.println("<mvApartado_A-Exception> "+e);}               
        mvDesconectarConBD();        
    }//mvApartado_B ()    
    public static void mvApartado_C(){        
        //c) Insertar coches para verificando que el dni del propietario ya existe en la tabla
        //propietarios, si no existe, no permitirá la inserción del nuevo coche.
        Scanner woTeclado = new Scanner(System.in);
        mvConectarConBD();
        try {
            while(true){
                String wsDni, wsMatricula, wsMarca;      int wiPrecio;

                System.out.print("Dime el Dni: "); wsDni = woTeclado.nextLine().trim();
                poTabla= poInstruccion.executeQuery(
                        "SELECT * FROM tPropietarios where (dni = '" + wsDni + "');");
                if (!poTabla.next()) { System.out.println("Con este Dni ("+wsDni+") no hay ningún propietario."); break;}
                
                System.out.print("Dime la Matricula: ");   wsMatricula = woTeclado.nextLine().trim();
                System.out.print("Dime la Marca: ");       wsMarca     = woTeclado.nextLine().trim();
                System.out.print("Dime el Precio: ");      wiPrecio    = woTeclado.nextInt(); woTeclado.nextLine();
                
                int wi = poInstruccion.executeUpdate(
                        "INSERT INTO tCoches values('" +
                                wsMatricula+ "', '" +wsMarca+ "', " +wiPrecio+ ",'" + wsDni + "');");
            }//while(true)
        }
        catch(SQLException 	e) {System.out.println("<mvApartado_A-Sql> "+e);}
        catch(Exception 		e) {System.out.println("<mvApartado_A-Exception> "+e);}               
        mvDesconectarConBD();        
    }//mvApartado_C () 
    public static void mvApartado_D() {
    //d) Borrar de la BD a un propietario (borrando también los coches de este propietario).
        Scanner woTeclado = new Scanner(System.in);
        mvConectarConBD();
        try {
                String wsDni;
                
                System.out.println("Dime el DNI del propietario que desea borrar: "); wsDni = woTeclado.nextLine().trim();               
                int wi = poInstruccion.executeUpdate(
                        "DELETE FROM tCoches where (dni = '" + wsDni + "');");
                wi = poInstruccion.executeUpdate(
                        "DELETE FROM tPropietarios where (dni = '" + wsDni + "');");
                System.out.println("Usuario con dni " + wsDni + " eliminado");
        }
        catch(SQLException              e) {System.out.println("<mvApartado_A-Sql> "+e);}
        catch(Exception 		e) {System.out.println("<mvApartado_A-Exception> "+e);}               
        mvDesconectarConBD(); 
    }//mvApartado_D ()
}//CEjccCochesYPropietarios