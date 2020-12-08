package modelosolicitudes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Leand
 */
public class SecretarioPersonalInfo extends javax.swing.JFrame {

    /**
     * Creates new form panel_control
     */
    public SecretarioPersonalInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBRegresar = new javax.swing.JButton();
        jBInformacionBasica = new javax.swing.JButton();
        jBSolicitudes = new javax.swing.JButton();
        jBUpdateNombre = new javax.swing.JButton();
        jSPInformacion = new javax.swing.JScrollPane();
        jTInformacion = new javax.swing.JTable();
        jTFUpdateApellidos = new javax.swing.JTextField();
        jTFUpdateNombre = new javax.swing.JTextField();
        jTFUpdateTelefono = new javax.swing.JTextField();
        jTFUpdateDocumento = new javax.swing.JTextField();
        jBUpdateApellidos = new javax.swing.JButton();
        jBUpdateDocumento = new javax.swing.JButton();
        jBUpdateTelefono = new javax.swing.JButton();
        jBUpdateContraseña = new javax.swing.JButton();
        jTFUpdateContraseña = new javax.swing.JTextField();
        jBUpdateCorreo = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Secretario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setName(""); // NOI18N

        jBRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRegresar.setText("Inicio");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jBInformacionBasica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBInformacionBasica.setText("Información Basica");
        jBInformacionBasica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBInformacionBasica.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBInformacionBasica.setSelected(true);
        jBInformacionBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInformacionBasicaActionPerformed(evt);
            }
        });

        jBSolicitudes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSolicitudes.setText("Solicitudes");
        jBSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBSolicitudes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSolicitudesActionPerformed(evt);
            }
        });

        jBUpdateNombre.setText("Actualizar nombre");
        jBUpdateNombre.setAutoscrolls(true);
        jBUpdateNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBUpdateNombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBUpdateNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateNombreActionPerformed(evt);
            }
        });

        jTInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Documento", "Teléfono", "Contraseña", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTInformacion.setFocusable(false);
        jSPInformacion.setViewportView(jTInformacion);

        jBUpdateApellidos.setText("Actualizar Apellidos");
        jBUpdateApellidos.setAutoscrolls(true);
        jBUpdateApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBUpdateApellidos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBUpdateApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateApellidosActionPerformed(evt);
            }
        });

        jBUpdateDocumento.setText("Actualizar Documento");
        jBUpdateDocumento.setAutoscrolls(true);
        jBUpdateDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBUpdateDocumento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBUpdateDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateDocumentoActionPerformed(evt);
            }
        });

        jBUpdateTelefono.setText("Actualizar teléfono");
        jBUpdateTelefono.setAutoscrolls(true);
        jBUpdateTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBUpdateTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBUpdateTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateTelefonoActionPerformed(evt);
            }
        });

        jBUpdateContraseña.setText("Actualizar contraseña");
        jBUpdateContraseña.setAutoscrolls(true);
        jBUpdateContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBUpdateContraseña.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBUpdateContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateContraseñaActionPerformed(evt);
            }
        });

        jBUpdateCorreo.setText("Actualizar correo");
        jBUpdateCorreo.setAutoscrolls(true);
        jBUpdateCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBUpdateCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBUpdateCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateCorreoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBInformacionBasica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBUpdateDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(jBUpdateApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBUpdateNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFUpdateNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jTFUpdateApellidos)
                                    .addComponent(jTFUpdateDocumento))
                                .addGap(135, 135, 135)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBUpdateCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBUpdateContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBUpdateTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFUpdateContraseña)
                                    .addComponent(jTextField6)
                                    .addComponent(jTFUpdateTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSPInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBRegresar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSPInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBUpdateNombre)
                            .addComponent(jTFUpdateNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUpdateTelefono)
                            .addComponent(jTFUpdateTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUpdateApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUpdateApellidos)
                            .addComponent(jBUpdateContraseña)
                            .addComponent(jTFUpdateContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBUpdateDocumento)
                            .addComponent(jTFUpdateDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUpdateCorreo)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBInformacionBasica)
                        .addGap(81, 81, 81)
                        .addComponent(jBSolicitudes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jBRegresar)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        Login sec_log = new Login(); 
        sec_log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBUpdateNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUpdateNombreActionPerformed

    private void jBInformacionBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInformacionBasicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInformacionBasicaActionPerformed

    private void jBUpdateApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUpdateApellidosActionPerformed

    private void jBUpdateDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUpdateDocumentoActionPerformed

    private void jBUpdateTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUpdateTelefonoActionPerformed

    private void jBUpdateContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUpdateContraseñaActionPerformed

    private void jBUpdateCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUpdateCorreoActionPerformed

    private void jBSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSolicitudesActionPerformed
        SecretarioSol sec_sol = new SecretarioSol(); 
        sec_sol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBSolicitudesActionPerformed

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
            java.util.logging.Logger.getLogger(SecretarioPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretarioPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretarioPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretarioPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretarioPersonalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInformacionBasica;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBSolicitudes;
    private javax.swing.JButton jBUpdateApellidos;
    private javax.swing.JButton jBUpdateContraseña;
    private javax.swing.JButton jBUpdateCorreo;
    private javax.swing.JButton jBUpdateDocumento;
    private javax.swing.JButton jBUpdateNombre;
    private javax.swing.JButton jBUpdateTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPInformacion;
    private javax.swing.JTextField jTFUpdateApellidos;
    private javax.swing.JTextField jTFUpdateContraseña;
    private javax.swing.JTextField jTFUpdateDocumento;
    private javax.swing.JTextField jTFUpdateNombre;
    private javax.swing.JTextField jTFUpdateTelefono;
    private javax.swing.JTable jTInformacion;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
