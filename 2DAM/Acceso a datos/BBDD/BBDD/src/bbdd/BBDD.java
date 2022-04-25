package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BBDD {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement db = con.createStatement();
            //crearTabla(db);
            //insertTable(db);
            db.execute("use Prueba");
            
            ResultSet Tabla1=db.executeQuery("select * from Tabla2");
            while (Tabla1.next()) {                
                System.out.println(Tabla1.getInt("id")+" "+Tabla1.getString("nombre"));
            }
            
            db.close();
            con.close();            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
    }// main()
    
    private static void crearTabla(Statement db){
        try {
            db.execute("create database Prueba");
            db.execute("use Prueba");
            db.execute("create table Tabla1("
                    + "id int primary key,"
                    + "nombre varchar(20))");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }// crearTabla()
    
    private static void insertTable(Statement db) {
        try {
            db.executeUpdate("insert into Tabla1 values"
                    + "(1, 'Pepe'),"
                    + "(2,'Skippy')");
        } catch (SQLException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// insertTable()

}//BBDD