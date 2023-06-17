/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Datos;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @auth PIPE AND ANDRES
 */
public class Conexion {
    private final String url = "jdbc:mysql://localhost:3306/rentas";
    private final String user = "root";
    private final String pwd = "";
    
    public Conexion() {}
    
    public ResultSet Listar(String Cad) {
        try {
            Connection cn = DriverManager.getConnection(url, user, pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            ResultSet tbl = da.executeQuery();
            return tbl;
        
        } catch(SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public String Ejecutar(String Cad) {
        try {
            Connection cn  = DriverManager.getConnection(url, user, pwd);
            PreparedStatement da = cn.prepareStatement(Cad);
            int r = da.executeUpdate();
            return String.valueOf(r);
        } catch(SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return "Error " + e.getMessage();
        }
    }
}
