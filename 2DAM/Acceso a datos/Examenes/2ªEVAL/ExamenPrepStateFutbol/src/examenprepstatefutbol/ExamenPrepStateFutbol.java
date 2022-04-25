package examenprepstatefutbol;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamenPrepStateFutbol {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Futbol";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);

            //parte1(con);
            
            parte2(con);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
    }// main()

    private static void parte1(Connection con) throws SQLException {
        ResultSet rs, rs1;
        String cadena = "select * from partidos where CodLocal=?";
        PreparedStatement ps1 = con.prepareStatement(cadena);

        PreparedStatement codEquipos = con.prepareStatement("select ? from partidos group by ?");

        boolean acabado = false;
        while (!acabado) {
            codEquipos.setString(1, "CodLocal");
            codEquipos.setString(2, "CodLocal");
            rs = codEquipos.executeQuery();
            while (rs.next()) {
                ps1.setInt(1, rs.getInt(1));
                rs1 = ps1.executeQuery();
                while (rs1.next()) {

                }
            }
        }
    }// parte1()

    private static void parte2(Connection con) { 
        Scanner teclado = new Scanner(System.in);
        
        File f = new File("futbol.bin");
        FileInputStream fis;
        try {
            String cadena = "select * from equipos where CodEquipo=?";
            PreparedStatement ps1 = con.prepareStatement(cadena);
            
            cadena = "insert into equipos values(?,?,?)";
            PreparedStatement ps2 = con.prepareStatement(cadena);
            
            cadena = "insert into estadisticas values(?,?,?,?,?,?,?)";
            PreparedStatement ps3 = con.prepareStatement(cadena);   
            
            cadena = "update estadisticas set PGanados=?, PPerdidos=?, "
            + "PEmpatados=?, GolFav=?, GolCont=?, Puntos=? where CodEquipo=?";           
            PreparedStatement ps4 = con.prepareStatement(cadena);
            
            cadena = "delete from equipos where CodEquipo=?";
            PreparedStatement ps5 = con.prepareStatement(cadena); 
            
            cadena = "delete from estadisticas where CodEquipo=?";
            PreparedStatement ps6 = con.prepareStatement(cadena);
            
            cadena = "select * from estadisticas";
            PreparedStatement select = con.prepareStatement(cadena);
            
            ResultSet rs, rs1;
            
            fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            try {
                String operacion, CodEquipo;
                int ganados, perdidos, empatados;
                
                while (true) {
                    operacion = dis.readUTF();
                    CodEquipo = dis.readUTF();
                    ganados = dis.readInt();
                    perdidos = dis.readInt();
                    empatados = dis.readInt();
                    
                    switch(operacion){
                        case "A":
                            ps1.setString(1, CodEquipo);
                            rs = ps1.executeQuery();
                            rs.next();
                            if (rs.first()) {
                                System.out.println("El equipo ya existe");
                            }else{
                                ps2.setString(1, CodEquipo);
                                String nombre = rs.getString(1);
                                String local = rs.getString(2);
                                ps2.setString(2, nombre);
                                ps2.setString(3, local);
                                ps2.execute();
                                
                                System.out.println("Goles a favor");
                                int golesF = teclado.nextInt();
                                System.out.println("Goles en contra");
                                int goleC = teclado.nextInt();
                                int puntos = ganados*3+empatados;
                                
                                ps3.setString(1, CodEquipo);
                                ps3.setInt(2, ganados);
                                ps3.setInt(3, perdidos);
                                ps3.setInt(4, empatados);
                                ps3.setInt(5, golesF);
                                ps3.setInt(6, goleC);
                                ps3.setInt(7, puntos);
                                ps3.execute();
                            }
                            break;
                        case "B":
                            ps1.setString(1, CodEquipo);
                            rs = ps1.executeQuery();
                            rs.next();
                            if (rs.first()) {
                                ps6.setString(1, CodEquipo);
                                ps5.setString(1, CodEquipo);
                                ps6.execute();
                                ps5.execute();
                            }else{
                                System.out.println("El equipo no existe");
                            }
                            break;
                        case "M":
                            ps1.setString(1, CodEquipo);
                            rs = ps1.executeQuery();
                            rs.next();
                            if (rs.first()) {
                                ps4.setInt(1, ganados);
                                ps4.setInt(2, perdidos);
                                ps4.setInt(3, empatados);
                                
                                System.out.println("Goles a favor");
                                int golesF = teclado.nextInt();
                                System.out.println("Goles en contra");
                                int goleC = teclado.nextInt();
                                int puntos = ganados*3+empatados;
                                
                                ps4.setInt(4, golesF);
                                ps4.setInt(5, goleC);
                                ps4.setInt(6, puntos);
                                ps4.setString(7, CodEquipo);
                            }else{
                                System.out.println("El equipo no existe");
                            }
                            break;
                    }
                }
            } catch (EOFException e) {
                System.out.println("\nSe acabó el fichero");
            }
            fis.close();
            dis.close();
            
            rs1 = select.executeQuery();
            rs1.next();
            while (rs1.next()) {                
                System.out.println("Equipo: "+rs1.getString(1)+". Goles a favor: "
                +rs1.getInt(5)+". Goles en contra: "+rs1.getInt(6)+". Puntos: "+rs1.getInt(7));
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(ExamenPrepStateFutbol.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }// parte2()

}// ExamenPrepStateFutbol
