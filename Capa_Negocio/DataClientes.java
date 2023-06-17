/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Negocio;

import Capa_Datos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author reyan
 */
public class DataClientes {

    private String nombre;
    private String direccion;
    private String ciudad;
    private String identificacion;
    private String licencia;
    private String telefono;
    private final String tabla = "clientes";
    private final Conexion objmod = new Conexion();

    public ArrayList<DataClientes> ListaClientes() {
        ArrayList lista2 = new ArrayList();

        try {
            ResultSet tabla = objmod.Listar("select * from " + this.tabla + " ");
            DataClientes objart;
            while (tabla.next()) {
                objart = new DataClientes();
                objart.setNombre(tabla.getString("cl_nombre"));
                objart.setDireccion(tabla.getString("cl_direccion"));
                objart.setCiudad(tabla.getString("cl_ciudad"));
                objart.setIdentificacion(tabla.getString("cl_identificacion"));
                objart.setLicencia(tabla.getString("cl_licencia"));
                objart.setTelefono(tabla.getString("cl_telefono"));
                lista2.add(objart);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista2;
    }

    public String GrabarCliente() {

        String cad = "insert into " + this.tabla + " values('"
                + this.nombre
                + "', '" + this.direccion
                + "', '" + this.ciudad
                + "', '" + this.identificacion
                + "', '" + this.licencia
                + "', '" + this.telefono
                + "')";
        return objmod.Ejecutar(cad);
    }

    public String EditarCliente() {
        String cad = "update " + this.tabla + " set  cl_nombre='"
                + this.nombre
                + "', cl_direccion='" + this.direccion
                + "', cl_ciudad='" + this.ciudad
                + "', cl_licencia='" + this.licencia
                + "', cl_telefono='" + this.telefono
                + "' where cl_identificacion = '" + this.identificacion
                + "'";
        if (objmod.Ejecutar(cad).equals(0)) {
            JOptionPane.showMessageDialog(null, "No se puede modificar el numero de identificacion");
            return "0";
        } else {
            return "1";
        }
    }

    public boolean buscarCliente(String identificacion) throws SQLException {
        String cad = "select * from " + this.tabla
                + " where cl_identificacion = '" + identificacion + "'";
        ResultSet tabla = objmod.Listar(cad);
        while (tabla.next()) {
            this.nombre = tabla.getString("cl_nombre");
            this.direccion = tabla.getString("cl_direccion");
            this.ciudad = tabla.getString("cl_ciudad");
            this.identificacion = tabla.getString("cl_identificacion");
            this.licencia = tabla.getString("cl_licencia");
            this.telefono = tabla.getString("cl_telefono");
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
