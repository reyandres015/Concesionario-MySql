/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import Capa_Negocio.DataCarros;
import Capa_Negocio.DataClientes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Capa_Negocio.DataRenta;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pipe
 */
public class UIRenta extends javax.swing.JFrame {

    /**
     * Creates new form formulario
     */
    public UIRenta() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        ListarArticulos();
    }

    public void ListarArticulos() {
        DefaultTableModel tabla = new DefaultTableModel();
        DataRenta objart = new DataRenta();
        ArrayList<DataRenta> lista2 = new ArrayList();
        lista2 = objart.ListaRenta();
        tabla.addColumn("Fecha");
        tabla.addColumn("Nombre");
        tabla.addColumn("Identificación");
        tabla.addColumn("Telefono");
        tabla.addColumn("Placa");
        tabla.addColumn("Costo");
        tabla.setRowCount(lista2.size());
        int i = 0;
        for (DataRenta x : lista2) {
            tabla.setValueAt(x.getFecha(), i, 0);
            tabla.setValueAt(x.getNombreCliente(), i, 1);
            tabla.setValueAt(x.getIdentificacionCliente(), i, 2);
            tabla.setValueAt(x.getTelefonoCliente(), i, 3);
            tabla.setValueAt(x.getPlaca(), i, 4);
            tabla.setValueAt(x.getCosto(), i, 5);
            i++;
        }
        this.jTable2.setModel(tabla);
    }

    public void LimpiarCajasTexto() {
        this.placaField.setText("");
        this.consumoField.setText("");
        this.puestosField.setText("");
        this.colorField.setText("");
        this.marcaField.setText("");
        this.referenciaField.setText("");
        this.costoField.setText("");
        this.nombreField.setText("");
        this.direccionField.setText("");
        this.ciudadField.setText("");
        this.identificacionField.setText("");
        this.licenciaField.setText("");
        this.telefonoField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        marcaField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        consumoField = new javax.swing.JTextField();
        puestosField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        colorField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        placaField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        referenciaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costoField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nombreField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ciudadField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        identificacionField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        licenciaField = new javax.swing.JTextField();
        fechaEntradaField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnRegistro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        clientesMenu = new javax.swing.JMenuItem();
        vehiculosMenu = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(799, 559));
        setPreferredSize(new java.awt.Dimension(799, 599));
        setSize(new java.awt.Dimension(799, 559));

        jLabel1.setFont(new java.awt.Font("Phosphate", 1, 24)); // NOI18N
        jLabel1.setText("Renta de Vehículos");

        jLabel2.setText("Fecha:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Vehiculo"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        marcaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("Marca vehículo:");

        jLabel16.setText("Tipo de consumo:");

        consumoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumoFieldActionPerformed(evt);
            }
        });

        puestosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestosFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Número de plazas:");

        jLabel18.setText("Color:");

        jLabel19.setText("Placa:");

        placaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                placaFieldFocusLost(evt);
            }
        });
        placaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Referencia:");

        referenciaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Costo: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17))
                            .addGap(21, 21, 21)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(puestosField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(consumoField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(jLabel11)
                                .addComponent(jLabel3))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(marcaField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(colorField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(placaField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(referenciaField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(costoField))))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consumoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puestosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referenciaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Cliente"));

        jLabel21.setText("Nombre de cliente:");

        jLabel4.setText("Dirección de residencia:");

        jLabel12.setText("Ciudad:");

        ciudadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Número de identificación:");

        identificacionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                identificacionFieldFocusLost(evt);
            }
        });
        identificacionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionFieldActionPerformed(evt);
            }
        });
        identificacionField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                identificacionFieldPropertyChange(evt);
            }
        });

        jLabel7.setText("Número de licencia de conducción:");

        jLabel8.setText("Número de teléfono:");

        telefonoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licenciaField)
                            .addComponent(telefonoField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel21))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(identificacionField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ciudadField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(identificacionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(licenciaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        fechaEntradaField.setText(new Fecha().obtenerFecha());
        fechaEntradaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaEntradaFieldActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cliente", "Identificación", "Telefono", "Placa", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnRegistro.setText("Crear Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jMenu1.setText("Tablas");

        clientesMenu.setText("Clientes");
        clientesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesMenuActionPerformed(evt);
            }
        });
        jMenu1.add(clientesMenu);

        vehiculosMenu.setText("Vehiculos");
        vehiculosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculosMenuActionPerformed(evt);
            }
        });
        jMenu1.add(vehiculosMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fechaEntradaField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaEntradaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciudadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadFieldActionPerformed

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

    private void puestosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestosFieldActionPerformed

    private void consumoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consumoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consumoFieldActionPerformed

    private void vehiculosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculosMenuActionPerformed
        // TODO add your handling code here:
        UICarros vistaCarros = new UICarros();
        vistaCarros.setVisible(true);
    }//GEN-LAST:event_vehiculosMenuActionPerformed

    private void fechaEntradaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaEntradaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaEntradaFieldActionPerformed

    private void placaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaFieldActionPerformed

    private void marcaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaFieldActionPerformed

    private void referenciaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaFieldActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        DataRenta objart = new DataRenta();
        objart.setFecha(this.fechaEntradaField.getText());
        objart.setNombreCliente(this.nombreField.getText());
        objart.setIdentificacionCliente(this.identificacionField.getText());
        objart.setTelefonoCliente(this.telefonoField.getText());
        objart.setPlaca(this.placaField.getText());
        objart.setCosto(Integer.parseInt(this.costoField.getText()));
        if(!buscarCliente()){
           crearCliente();
        }
        JOptionPane.showMessageDialog(null, "Se agrego " + objart.GrabarRenta() + " articulos.");
        ListarArticulos();
        LimpiarCajasTexto();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void crearCliente() {
        DataClientes objart = new DataClientes();
        objart.setNombre(this.nombreField.getText());
        objart.setDireccion(this.direccionField.getText());
        objart.setCiudad(this.ciudadField.getText());
        objart.setIdentificacion(this.identificacionField.getText());
        objart.setLicencia(this.licenciaField.getText());
        objart.setTelefono(this.telefonoField.getText());
        if (objart.getNombre().isBlank()
                || objart.getDireccion().isBlank()
                || objart.getCiudad().isBlank()
                || objart.getIdentificacion().isBlank()
                || objart.getLicencia().isBlank()
                || objart.getTelefono().isBlank()) {
            JOptionPane.showMessageDialog(null, "Por favor revisa los datos que ingresaste ");
        } else {
            JOptionPane.showMessageDialog(null, "Se agrego " + objart.GrabarCliente() + " cliente.");
        }
    }
    private void clientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesMenuActionPerformed
        // TODO add your handling code here:
        UIClientes vistaClientes = new UIClientes();
        vistaClientes.setVisible(true);
    }//GEN-LAST:event_clientesMenuActionPerformed

    private void identificacionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionFieldActionPerformed

    private void identificacionFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_identificacionFieldPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_identificacionFieldPropertyChange

    private void identificacionFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_identificacionFieldFocusLost
        // TODO add your handling code here:
        buscarCliente();
    }//GEN-LAST:event_identificacionFieldFocusLost

    private boolean buscarCliente(){
        try {
            DataClientes objart = new DataClientes();
            if (objart.buscarCliente(identificacionField.getText())) {
                nombreField.setText(objart.getNombre());
                direccionField.setText(objart.getDireccion());
                ciudadField.setText(objart.getCiudad());
                identificacionField.setText(objart.getIdentificacion());
                licenciaField.setText(objart.getLicencia());
                telefonoField.setText(objart.getTelefono());
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UIRenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private void placaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_placaFieldFocusLost
        // TODO add your handling code here:
        try {
            DataCarros objart = new DataCarros();
            if (objart.buscarCarro(placaField.getText())) {
                consumoField.setText(objart.getConsumo());
                puestosField.setText(objart.getPuestos());
                colorField.setText(objart.getColor());
                marcaField.setText(objart.getMarca());
                referenciaField.setText(objart.getReferencia());
                costoField.setText(objart.getValor());
            }

        } catch (SQLException ex) {
            Logger.getLogger(UIRenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_placaFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIRenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIRenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JMenuItem clientesMenu;
    private javax.swing.JTextField colorField;
    private javax.swing.JTextField consumoField;
    private javax.swing.JTextField costoField;
    private javax.swing.JTextField direccionField;
    public javax.swing.JTextField fechaEntradaField;
    private javax.swing.JTextField identificacionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField licenciaField;
    private javax.swing.JTextField marcaField;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField placaField;
    private javax.swing.JTextField puestosField;
    private javax.swing.JTextField referenciaField;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JMenuItem vehiculosMenu;
    // End of variables declaration//GEN-END:variables
}
