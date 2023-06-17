/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Negocio;

import Capa_Datos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author reyan
 */
public class DataRenta {

    private String fecha;
    private String nombreCliente;
    private String identificacionCliente;
    private String telefonoCliente;
    private String placa;
    private int costo;

    public ArrayList<DataRenta> ListaRenta() {
        ArrayList lista2 = new ArrayList();

        try {
            Conexion objmod = new Conexion();
            ResultSet tabla = objmod.Listar("select * from renta");
            DataRenta objart;
            while (tabla.next()) {
                objart = new DataRenta();
                objart.setFecha(tabla.getString("ren_fecha"));
                objart.setNombreCliente(tabla.getString("ren_nombre"));
                objart.setIdentificacionCliente(tabla.getString("ren_identificacion"));
                objart.setTelefonoCliente(tabla.getString("ren_telefono"));
                objart.setPlaca(tabla.getString("ren_placa"));
                objart.setCosto(tabla.getInt("ren_costo"));
                lista2.add(objart);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista2;
    }

    public String GrabarRenta() {
        Conexion objmod = new Conexion();
        String cad = "insert into renta values('"
                + this.fecha
                + "', '" + this.nombreCliente
                + "', '" + this.identificacionCliente
                + "', '" + this.telefonoCliente
                + "', '" + this.placa
                + "', '" + this.costo
                + "')";
        return objmod.Ejecutar(cad);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCosto() {
        return costo;
    }
}
