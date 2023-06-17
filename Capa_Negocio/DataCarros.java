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
public class DataCarros {

    private String placa;
    private String consumo;
    private String puestos;
    private String color;
    private String marca;
    private String referencia;
    private String valor;
    private final String tabla = "carros";
    private Conexion objmod = new Conexion();

    public ArrayList<DataCarros> ListaCarros() {
        ArrayList lista2 = new ArrayList();

        try {
            ResultSet tabla = objmod.Listar("select * from " + this.tabla + " ");
            DataCarros objart;
            while (tabla.next()) {
                objart = new DataCarros();
                objart.setPlaca(tabla.getString("car_placa"));
                objart.setConsumo(tabla.getString("car_consumo"));
                objart.setPuestos(tabla.getString("car_puestos"));
                objart.setColor(tabla.getString("car_color"));
                objart.setMarca(tabla.getString("car_marca"));
                objart.setReferencia(tabla.getString("car_referencia"));
                objart.setValor(tabla.getString("car_valor"));
                lista2.add(objart);
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista2;
    }

    public String GrabarCarro() {

        String cad = "insert into " + this.tabla + " values('"
                + this.placa
                + "', '" + this.consumo
                + "', '" + this.puestos
                + "', '" + this.color
                + "', '" + this.marca
                + "', '" + this.referencia
                + "', '" + this.valor
                + "')";
        return objmod.Ejecutar(cad);
    }

    public String EditarCosto(String valor, String placa) {
        String cad = "update " + this.tabla + " set  car_valor='"
                + valor + "' where car_placa = '" + placa + "'";
        return objmod.Ejecutar(cad);
    }

    public boolean buscarCarro(String placa) throws SQLException {
        String cad = "select * from " + this.tabla
                + " where car_placa = '" + placa + "'";
        ResultSet tabla = objmod.Listar(cad);
        while (tabla.next()) {
            this.placa = tabla.getString("car_placa");
            this.consumo = tabla.getString("car_consumo");
            this.puestos = tabla.getString("car_puestos");
            this.color = tabla.getString("car_color");
            this.marca = tabla.getString("car_marca");
            this.referencia = tabla.getString("car_referencia");
            this.valor = tabla.getString("car_valor");
            return true;
        }
        return false;
    }

    public String getPlaca() {
        return placa;
    }

    public String getConsumo() {
        return consumo;
    }

    public String getPuestos() {
        return puestos;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getValor() {
        return valor;
    }

    public String getTabla() {
        return tabla;
    }

    public Conexion getObjmod() {
        return objmod;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setPuestos(String puestos) {
        this.puestos = puestos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setObjmod(Conexion objmod) {
        this.objmod = objmod;
    }
}
