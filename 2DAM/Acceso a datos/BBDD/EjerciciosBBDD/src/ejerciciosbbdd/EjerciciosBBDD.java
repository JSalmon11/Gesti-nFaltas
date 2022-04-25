package ejerciciosbbdd;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjerciciosBBDD {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige:\n1: Instituto\n2: America\n3: Coches\n4: Empresa"
                + "\n5: Empresa prepared statement\n6: Ventas Comercio PS");
        int eleccion= teclado.nextInt();
        switch (eleccion){
            case 1:Instituto(); break;
            case 2:America(); break;
            case 3:Coches.Coches(); break;
            case 4:Empresa.Empresa(); break;
            case 5:EmpresaPreparedStatement.EmpresaPreparedStatement();break;
            case 6:VentasComercio.VentasComercioPS();break;
        }
    }// main()
    
    private static void Instituto() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Instituto";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement db = con.createStatement();
            Statement db1 = con.createStatement();
            ResultSet rs;
            db.execute("use INSTITUTO");
            
            try{
                db.executeQuery("select * from NotasFinales");
            }catch(SQLException ex) {
                db.execute("create table NotasFinales("
                    + "MAT varchar(10),"
                    + "COD int(2),"
                    + "NOTA_MEDIA decimal(4,2),"
                    + "primary key (MAT,COD))");
            }
            try{
                rs=db.executeQuery("select * from NotasFinales");
                rs.next();
                rs.getString(1);
            }catch(SQLException ex) {
                rs=db.executeQuery("select * from Notas");
                double media;
                int codigo;
                String mat;
                
                while (rs.next()) {
                    mat=rs.getString(1);
                    codigo=rs.getInt(2);
                    media=(rs.getInt(3)+rs.getInt(4)+rs.getInt(5))/3.0;
                    db1.executeUpdate("insert into NotasFinales values('"+mat+"',"+codigo+","+media+")");
                }
            }
            
            rs=db.executeQuery("select APEL_NOM, NOMBRE, NOTA1, NOTA2, Nota3, NOTA_MEDIA"
                        + " from notas, alumnos, asignaturas, NotasFinales"
                        + " where notas.mat=alumnos.mat and notas.cod=asignaturas.cod"
                        + " and NotasFinales.mat=notas.mat"
                        + " and NotasFinales.cod=notas.cod");
            for (int i = 0; rs.next(); ++i) {
                System.out.println("----------------------------------------------------\n"
                        + "Alumno: "+rs.getString(1)+".\n  Asignatura: \t"+rs.getString(2)+
                        ".\n  Notas: \t1ªEVAL: "+rs.getDouble(3)+" 2ªEVAL: "+rs.getDouble(4)+
                        " 3ªEVAL: "+rs.getDouble(5)+".\n  Media: \t"+rs.getDouble(6)+".");
            }System.out.println("----------------------------------------------------");
            
            rs.close();
            db1.close();
            db.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
    }// Instituto()

    private static void America() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement db = con.createStatement();
            Statement db1 = con.createStatement();
            ResultSet rs;
            db.execute("use AMERICA");
            
            try{
                db.executeQuery("select * from PersonasPaises");
            }catch(SQLException ex) {
                db.execute("create table PersonasPaises("
                    + "ID int primary key,"
                    + "NOMBRE varchar(20),"
                    + "APELLIDO varchar(20),"
                    + "EDAD int(3),"
                    + "NOMBRE_PAIS varchar(20),"
                    + "TAMANIO varchar(20))");
            }
            try{
                rs=db.executeQuery("select * from personaspaises");
                rs.next();
                rs.getInt(1);
            }catch(SQLException ex) {
                rs=db.executeQuery("select persona.id, persona.nombre, persona.apellido, persona.edad, pais.nombre, pais.tamanio" +
                                " from persona, pais" +
                                " where persona.pais=pais.id;");
                int ID;
                String Nombre;
                String Apellido;
                int Edad;
                String NombrePais;
                String Tamanio;
                while (rs.next()) {
                    ID=rs.getInt(1);
                    Nombre=rs.getString(2);
                    Apellido=rs.getString(3);
                    Edad=rs.getInt(4);
                    NombrePais=rs.getString(5);
                    Tamanio=rs.getString(6);
                    if (NombrePais.toLowerCase().equals("costa rica")) {
                        db1.executeUpdate("insert into PersonasPaises values("+ID+",'"+Nombre+"','"+Apellido+"',"
                            +(Edad+1)+", '"+NombrePais+"', '"+Tamanio+"')");
                    }else{
                        db1.executeUpdate("insert into PersonasPaises values("+ID+",'"+Nombre+"','"+Apellido+"',"
                            +Edad+", '"+NombrePais+"', '"+Tamanio+"')");
                    }
                }
            }
            rs=db.executeQuery("select * from personaspaises");
            while (rs.next()) {                
                System.out.println("ID: "+rs.getInt(1)+". Nombre: "+rs.getString(2)+".\tApellido: "+rs.getString(3)+"."
                        + "\tEdad: "+rs.getInt(4)+". País: "+rs.getString(5)+".    \tTamaño: "+rs.getString(6)+".");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
    }// America()
    
    private static class Coches {
        private static void Coches() {
            Scanner teclado = new Scanner(System.in);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                Statement db = con.createStatement();
                db.execute("use DatosCoches");

                int menu = 0;
                while (menu!=7) {
                    System.out.println("Elige:\n1: Alta propietario\n2: Alta coches\n"
                            + "3: Mis datos y coche\n4: Modificar propirtario\n5: Baja "
                            + "coche\n6: Baja propietario\n7: Salir");
                    menu = teclado.nextInt();
                    switch (menu){
                        case 1:AltaPropietario(db);break;
                        case 2:AltaCoche(db);break;
                        case 3:MisDatos(db);break;
                        case 4:ModificarPropietario(db);break;
                        case 5:BajaCoche(db);break;
                        case 6:BorrarPropietario(db);break;
                    }
                } 
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("ERROR: " + ex);
            }
        }// Coches()

        private static void AltaPropietario(Statement db) throws SQLException {
            Scanner teclado = new Scanner(System.in);
            System.out.println("DNI:");
            String DNI=teclado.nextLine();
            System.out.println("Nombre:");
            String nombre=teclado.nextLine();
            System.out.println("Edad:");
            int edad=teclado.nextInt();
            db.execute("insert into propietarios values('"+DNI+"','"+nombre+"',"+edad+");");
        }// AltaPropietario()

        private static void AltaCoche(Statement db) {
            Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Matricula:");
                String Matricula=teclado.nextLine();
                System.out.println("Marca:");
                String Marca=teclado.nextLine();
                System.out.println("Precio:");
                int Precio=teclado.nextInt();
                System.out.println("Id(DNI propietario):");
                String Id=teclado.nextLine();
                Id=teclado.nextLine();

                db.executeQuery("select * from propietarios where dni='"+Id+"';");
                db.execute("insert into coches values('"+Matricula+"','"+Marca+"',"+Precio+",'"+Id+"');");
            }
            catch (SQLException ex) {
                System.out.println("El propietario no existe");
            }
        }// AltaCoche()

        private static void MisDatos(Statement db) throws SQLException {
            Scanner teclado = new Scanner(System.in);
            System.out.println("DNI:");
            String DNI=teclado.nextLine();
            ResultSet rs = db.executeQuery("select * from propietarios where dni='"+DNI+"';");
            rs.next();
            System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+"años");
            rs = db.executeQuery("select * from coches where id='"+DNI+"';");
            while(rs.next()){
                System.out.println("    "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            teclado.nextLine();
        }// MisDatos()

        private static void ModificarPropietario(Statement db) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Matrícula del coche que cambia de propietario:");
            String matricula = teclado.nextLine();
            try {
                ResultSet rs = db.executeQuery("select * from coches where matricula='"+matricula+"'");
                rs.next();
                String DNI = rs.getString(4);
                System.out.println("Nombre nuevo propietario:");
                String nombre = teclado.nextLine();
                System.out.println("Edad:");
                int edad = teclado.nextInt();
                db.execute("update propietarios set nombre = '"+nombre+"', edad = "+edad+" where dni='"+DNI+"' ");
            } catch (SQLException ex) {
                System.out.println("El propietario no existe");
            }
        }// ModificarPropietario()

        private static void BajaCoche(Statement db) throws SQLException {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Matrícula:");
            String matricula = teclado.nextLine();
            db.execute("delete from coches where matricula = '"+matricula+"'");
        }// BajaCoche()

        private static void BorrarPropietario(Statement db) throws SQLException {
            Scanner teclado = new Scanner(System.in);
            System.out.println("DNI:");
            String DNI = teclado.nextLine();
            db.execute("delete from coches where id = '"+DNI+"'");
            db.execute("delete from propietarios where dni = '"+DNI+"'");
        }// BorrarPropietario()
    }// Coches
    
    private static class Empresa {
        private static void Empresa() {
            Scanner teclado = new Scanner(System.in);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                Statement db = con.createStatement();
                db.execute("use empresa");

                int menu = 0;
                while (menu!=5) {
                    System.out.println("Elige:\n1: Insertar\n2: Actualizar\n"
                            + "3: Borrar\n4: Consultar\n5: Salir ");
                    menu = teclado.nextInt();
                    switch (menu){
                        case 1:Insertar(db);break;
                        case 2:Actualizar(db);break;
                        case 3:Borrar(db);break;
                        case 4:Consultar(db);break;
                    }
                } 
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("ERROR: " + ex);
            }
        }// Empresa()
        
        private static boolean ComprobarUsuario() {
            boolean found = true;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Usuario:");
            int user = teclado.nextInt();
            System.out.println("Contraseña:");
            String pass = teclado.nextLine();
            try {
                File f = new File("password.dat");
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                boolean existUser = false;
                try {
                    while (existUser) {
                        if (dis.readInt() == user) {
                            
                        }
                    }
                    
                    while (true) {
                        if (dis.readInt() == user) {
                            if (dis.readUTF().equals(pass)) {
                                found = true;
                            }
                        }
                    }
                } catch (EOFException e) {
                    
                }
                fis.close();
                dis.close();
            } catch (IOException ex) {
            }
            return found;
        }// ComprobarUsuario()
        
        private static void Insertar(Statement db) {
            ComprobarUsuario();
        }// Insertar()
        
        private static void Actualizar(Statement db) {
            ComprobarUsuario();
        }// Actualizar()
        
        private static void Borrar(Statement db) {
            ComprobarUsuario();
        }// Borrar()
        
        private static void Consultar(Statement db) {
            
        }// Consultar()
    }// Empresa
    
    private static class EmpresaPreparedStatement {
        private static void EmpresaPreparedStatement() {
        Scanner teclado = new Scanner(System.in);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/EmpresaPS";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                Statement db = con.createStatement();
                
                String cadena="insert into departamentos values(?,?,?)";
                PreparedStatement ps1=con.prepareStatement(cadena);
                
                String cadena2="select * from empleados where emp_no=?";
                PreparedStatement ps2=con.prepareStatement(cadena2);
                System.out.println("Elige:\n1: Nuevo departamento\n2: Mostrar datos de empleado"
                        + "");
                int eleccion= teclado.nextInt();
                switch (eleccion){
                    case 1:InsertarDpto(db, ps1, teclado); break;
                    case 2:MostrarDatos(ps2, teclado); break;
                    case 3:Coches.Coches(); break;
                    case 4:Empresa.Empresa(); break;
                    case 5:EmpresaPreparedStatement.EmpresaPreparedStatement();break;
                }
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("ERROR: " + ex);
            }
        }// EmpresaPreparedStatement()
        
        private static void InsertarDpto(Statement db, PreparedStatement ps, Scanner teclado) {
            try {
                ResultSet rs = db.executeQuery("select * from departamentos order by dept_no desc");
                rs.next();
                int dept_no = rs.getInt(1) + 10;
                teclado.nextLine();
                System.out.println("Nombre del departamento:");
                String dnombre = teclado.nextLine();
                System.out.println("Localidad:");
                String loc = teclado.nextLine();
                ps.setInt(1, dept_no);
                ps.setString(2, dnombre);
                ps.setString(3, loc);
                ps.execute();
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
        }// InsertarDpto()
        
        private static void MostrarDatos(PreparedStatement ps, Scanner teclado) {
            System.out.println("Nº Empleado:");
            int numEmpleado = teclado.nextInt();
            try {
                ps.setInt(1, numEmpleado);
                ResultSet rs = ps.executeQuery();
                rs.next();                    
                System.out.println("Empleado: "+rs.getInt(1)+". Apellido: "+rs.getString(2)+
                ". Oficio: "+rs.getString(3)+". Director: "+rs.getInt(4)+". Fecha alta: "+rs.getDate(5)+
                ". Salario: "+rs.getDouble(6)+"€. Comisión: "+rs.getDouble(7)+"€. Departamento: "+rs.getInt(8)+".");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }// MostrarDatos()
    }// EmpresaPreparedStatement

    private static class VentasComercio {
        private static void VentasComercioPS() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/Comercio";
                String user = "root";
                String password = "";
                Connection con = DriverManager.getConnection(url, user, password);
                Statement db = con.createStatement();
                ResultSet rs = db.executeQuery("select * from ventas");
                
                String cadena = "select ? from ? where ?=?";
                PreparedStatement ps = con.prepareStatement(cadena);
                
                cadena = "insert into ventas values(?,?,?,?)";
                PreparedStatement ps1 = con.prepareStatement(cadena);
                
                cadena = "update ventas set vendido=vendido+?, ganancia=ganancia+? where codvend=?";
                PreparedStatement ps2 = con.prepareStatement(cadena);
                
                String vendedor;
                int codProd, unid;
                try {
                    File f = new File("ventas.dat");
                    FileInputStream fis = new FileInputStream(f);
                    DataInputStream dis = new DataInputStream(fis);
                    try {
                        while (true) {
                            boolean vendedorExiste = false;
                            vendedor = dis.readUTF();
                            codProd = dis.readInt();
                            unid = dis.readInt();
                            while (rs.next()) {
                                if (rs.getString(1).equals(vendedor)) {
                                    vendedorExiste = true;
                                }
                            }
                            if (vendedorExiste) {
                                ps2.setInt(1, unid);
                                ResultSet rs1 = db.executeQuery("select precio"
                                + "from productos where codprod="+codProd);
                                rs1.next();
                                ps2.setInt(2, rs.getInt(1));
                                ps2.setString(3, vendedor);
                            }else{
////////////////////////////////
                            }
                        }
                        
                    } catch (EOFException e) {
                    }
                    fis.close();
                    dis.close();
                } catch (IOException ex) {
                }
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("ERROR: " + ex);
            }
        }// VentasComercio()
    }// VentasComercio
    
}// EjerciciosBBDD