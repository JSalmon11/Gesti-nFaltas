package preparedstatementteoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementTeoria {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      try{
          Class.forName("com.mysql.jdbc.Driver");
          String url="jdbc:mysql://localhost/Colegio";
          String user="root";
          String password="";
          Connection con=DriverManager.getConnection(url, user, password);
          String cadena="insert into Alumnos values(?,?,?,?)";
          PreparedStatement ps1=con.prepareStatement(cadena);
          cadena="delete from alumnos where id=?";
          PreparedStatement ps2=con.prepareStatement(cadena);
          cadena="update Alumnos set nota=nota+? where id=?";
          PreparedStatement ps3=con.prepareStatement(cadena);
          PreparedStatement ps4=con.prepareStatement("select * from alumnos");
          PreparedStatement ps5=con.prepareStatement("select * from cambios");
          ResultSet rs=ps5.executeQuery();
          
          MostrarAlumnos(ps4);
          while(rs.next()){
             switch(rs.getString(2)){
                 case "BJ":if(DardeBaja(ps2,rs.getInt(3))==0)
                            System.out.println("El alumno no existe");
                           else
                            System.out.println("El alumno se ha dado de baja correctamente");
                           break;
                 case "MD":if(Modificar(ps3,rs.getInt(3),rs.getInt(4))==0){
                              System.out.println("El alumno no existe");
                              System.out.println("Quiere darle de alta");
                              String resp=teclado.next();
                              if(resp.equalsIgnoreCase("si"))
                                if(DardeAlta(ps1,teclado,rs.getInt(3))==0)
                                  System.out.println("Se ha producido un error");
                                else
                                  System.out.println("Se ha dado de alta correctamente");
                           }else
                             System.out.println("La nota se ha modificado correctamente");
                           break;
                 default: System.out.println("Operacion Incorrecta");
                          break;
             } 
          }
        MostrarAlumnos(ps4);
        con.close();
      }catch(ClassNotFoundException | SQLException ex){
          System.out.println(ex);
      }
    }
    
   public static void MostrarAlumnos(PreparedStatement ps) throws SQLException{
       ResultSet rs=ps.executeQuery();
       while(rs.next()){
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "
               +rs.getString(3)+" "+rs.getInt(4));
       }
   } 
   
   public static int DardeBaja(PreparedStatement ps,int mat) throws SQLException{
       ps.setInt(1, mat);
       return ps.executeUpdate();
   }
   public static int Modificar(PreparedStatement ps,int mat,int inc) throws SQLException{
       ps.setInt(1, inc);
       ps.setInt(2, mat);
       return ps.executeUpdate();
   } 
   
   public static int DardeAlta(PreparedStatement ps,Scanner teclado,int mat) throws SQLException{
       teclado.nextLine();
       System.out.println("Introducir nombre");
       String nombre=teclado.nextLine();
       System.out.println("Introducir apellido");
       String ape=teclado.nextLine();
       System.out.println("Introducir nota");
       int nota=teclado.nextInt();
       ps.setInt(1, mat);
       ps.setString(2, nombre);
       ps.setString(3, ape);
       ps.setInt(4, nota);
       return ps.executeUpdate();
   }
}