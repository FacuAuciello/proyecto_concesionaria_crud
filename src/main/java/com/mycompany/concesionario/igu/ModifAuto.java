
package com.mycompany.concesionario.igu;

import com.mycompany.concesionario.logica.Automovil;
import com.mycompany.concesionario.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ModifAuto extends javax.swing.JFrame {

    Controladora control = null;
    Automovil auto = new Automovil();
    
    public ModifAuto(int idAuto) {
        control = new Controladora();
        initComponents();
        
        cargarDatosAuto(idAuto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        txtModeloo = new javax.swing.JTextField();
        txtModelo = new javax.swing.JLabel();
        txtMarcaa = new javax.swing.JTextField();
        txtKms = new javax.swing.JLabel();
        txtMotor = new javax.swing.JLabel();
        txtPatente = new javax.swing.JLabel();
        txtColor = new javax.swing.JLabel();
        txtCantPuertas = new javax.swing.JLabel();
        txtCantPuertass = new javax.swing.JTextField();
        txtPatentee = new javax.swing.JTextField();
        txtColorr = new javax.swing.JTextField();
        txtKmss = new javax.swing.JTextField();
        txtMotorr = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("MODIFICACION DE AUTOMOVILES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icontoyota.png"))); // NOI18N

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMarca.setText("Marca:");

        txtModeloo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtModelo.setText("Modelo:");

        txtMarcaa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKms.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtKms.setText("Kms:");

        txtMotor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMotor.setText("Motor:");

        txtPatente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPatente.setText("Patente:");

        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtColor.setText("Color:");

        txtCantPuertas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantPuertas.setText("Cant.Puertas:");

        txtCantPuertass.setColumns(2);
        txtCantPuertass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantPuertass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantPuertassActionPerformed(evt);
            }
        });

        txtPatentee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtColorr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtKmss.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMotorr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCantPuertas)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantPuertass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtKms)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKmss, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtModelo)
                                        .addComponent(txtMarca))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMarcaa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtModeloo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMotor)
                                .addGap(18, 18, 18)
                                .addComponent(txtMotorr, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatente)
                                    .addComponent(txtColor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColorr, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatentee, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca)
                    .addComponent(txtMarcaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo)
                    .addComponent(txtModeloo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKms)
                    .addComponent(txtKmss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotor)
                    .addComponent(txtMotorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatente)
                    .addComponent(txtPatentee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor)
                    .addComponent(txtColorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantPuertass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantPuertas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantPuertassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantPuertassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantPuertassActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
           
        //Traer todos los datos del auto lo guardo en variable aux. Copiar de alta automoviles, lo de agregar
     String marca = txtMarcaa.getText();
     String modelo = txtModeloo.getText();
     int kms = Integer.parseInt(txtKmss.getText());
     String motor = txtMotorr.getText();
     String patente = txtPatentee.getText();
     String color = txtColorr.getText();
     int cantidadPuertas = Integer.parseInt(txtCantPuertass.getText());
     
     //le paso el auto original y luego lo que se cambia
     control.modificarAuto(auto, marca, modelo, kms, motor, patente, color, cantidadPuertas);
     mostrarMensaje("Edicion realizada correctamente", "Info", "Edicion exitosa");
     
     //cerrar esta pantalla y mostrarme la de la consulta
     ConsultaAutomovil consul = new ConsultaAutomovil();
     consul.setVisible(true);
     consul.setLocationRelativeTo(null);
     
     this.dispose();
     
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtMarca.setText("");
        txtModelo.setText("");
        txtKmss.setText("");
        txtMotorr.setText("");
        txtPatentee.setText("");
        txtColorr.setText("");
        txtCantPuertass.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    //metodo de mostrar mensaje 
        public void mostrarMensaje (String mensaje, String tipo, String titulo){
            JOptionPane optionPane = new JOptionPane(mensaje);
            if(tipo.equals("Info")){
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
            else if(tipo.equals("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtCantPuertas;
    private javax.swing.JTextField txtCantPuertass;
    private javax.swing.JLabel txtColor;
    private javax.swing.JTextField txtColorr;
    private javax.swing.JLabel txtKms;
    private javax.swing.JTextField txtKmss;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JTextField txtMarcaa;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JTextField txtModeloo;
    private javax.swing.JLabel txtMotor;
    private javax.swing.JTextField txtMotorr;
    private javax.swing.JLabel txtPatente;
    private javax.swing.JTextField txtPatentee;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosAuto(int idAuto) {
        //Busco el auto en la BD
        auto = control.traerAutos(idAuto);
        
        //seteo los valores de ese auto en mi formulario
        txtMarcaa.setText(auto.getMarca()); //a txt marca seteale el texto que trae el auto que yo acabo de buscar en mi logica
        txtModeloo.setText(auto.getModelo());
        txtKmss.setText(String.valueOf(auto.getKms()));
        txtMotorr.setText(auto.getMotor());
        txtPatentee.setText(auto.getPatente());
        txtColorr.setText(auto.getColor());
        txtCantPuertass.setText(String.valueOf(auto.getCantidadPuertas()));
    }
}
