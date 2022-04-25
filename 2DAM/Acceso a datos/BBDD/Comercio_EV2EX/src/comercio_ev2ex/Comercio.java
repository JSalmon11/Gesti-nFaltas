package comercio_ev2ex;

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

public class Comercio {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/comercio";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);
            ResultSet rs;
            ResultSet rs1;
            
            String cadena = "insert into ventas values(?,?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(cadena);
            
            cadena = "update ventas set vendido=vendido+?, ganancia=ganancia+? where codVend=?";
            PreparedStatement ps2 = con.prepareStatement(cadena);
            
            PreparedStatement select = con.prepareStatement("select * from ventas");
            
            PreparedStatement comprobarVend = con.prepareStatement("select * from ventas where codVend=?");
            
            PreparedStatement getGanancias = con.prepareStatement("select * from productos where codprod=?");
            
            rs = select.executeQuery();
            
            System.out.println("SELECT ANTES\nVend   Prod   Vendido   Ganancias");
            while (rs.next()) {                
                System.out.println(rs.getString(1)+".    "+rs.getInt(2)+".    "+rs.getInt(3)+".\t"+rs.getDouble(4));
            }
            
            File f = new File("ventas.dat");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            
            String codVend;
            int codProd, unidades;
            try {
                while (true) {
                    codVend = dis.readUTF();
                    codProd = dis.readInt();
                    unidades = dis.readInt();
                    comprobarVend.setString(1, codVend);
                    rs = comprobarVend.executeQuery();
                    
                    getGanancias.setInt(1, codProd);
                    rs1 = getGanancias.executeQuery();
                    rs1.next();
                    double ganan = rs1.getDouble(2);
                    if (rs.first()) {
                        ps2.setInt(1, unidades);
                        ps2.setDouble(2, unidades*ganan);
                        ps2.setString(3, codVend);
                        ps2.execute();
                    }else{
                        ps1.setString(1, codVend);
                        ps1.setInt(2, codProd);
                        ps1.setInt(3, unidades);
                        ps1.setDouble(4, unidades*rs1.getDouble(2));
                        ps1.execute();
                    }
                }
            } catch (EOFException e) {
                System.out.println("\nSe acabó el fichero");
            }
            fis.close();
            dis.close();
            rs = select.executeQuery();
            System.out.println("\nSELECT DESPUES\nVend   Prod   Vendido   Ganancias");
            while (rs.next()) {                
                System.out.println(rs.getString(1)+".    "+rs.getInt(2)+".    "+rs.getInt(3)+".\t"+rs.getDouble(4));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR: " + ex);
        } catch (IOException ex) {
        }
    }// main()

}// Comercio