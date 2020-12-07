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
public class estudiante extends javax.swing.JFrame {

    /**
     * Creates new form panel_control
     */
    public estudiante() {
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
        jBAsignaturas = new javax.swing.JButton();
        jBSol3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPSolNAprobadas = new javax.swing.JPanel();
        jSPSolNAprobadas = new javax.swing.JScrollPane();
        jTTSolNAprobadas = new javax.swing.JTable();
        jBSolNAprobadas = new javax.swing.JButton();
        jLSolNAprobadas = new javax.swing.JLabel();
        jTSolNAprobadas = new javax.swing.JTextField();
        jPSolAprobadas = new javax.swing.JPanel();
        jSPSolAprobadas = new javax.swing.JScrollPane();
        jTSolAprobadas = new javax.swing.JTable();
        jBSolAprobadas = new javax.swing.JButton();
        jTFSolAprobadas = new javax.swing.JTextField();
        jLSolAprobadas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setName(""); // NOI18N

        jBRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRegresar.setText("Regresar");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jBInformacionBasica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBInformacionBasica.setText("Información Basica");
        jBInformacionBasica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBInformacionBasica.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBInformacionBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInformacionBasicaActionPerformed(evt);
            }
        });

        jBSolicitudes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSolicitudes.setText("Solicitudes");
        jBSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBSolicitudes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBSolicitudes.setSelected(true);

        jBAsignaturas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAsignaturas.setText("Asignaturas");
        jBAsignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBAsignaturas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignaturasActionPerformed(evt);
            }
        });

        jBSol3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSol3.setText("Eliminar Solicitudes");
        jBSol3.setAutoscrolls(true);
        jBSol3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBSol3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Consultar tipos de solicitudes");

        jPSolNAprobadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes sin aprobar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTTSolNAprobadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número", "Nombre del Secretario", "Fecha de recepción", "Tipo de solicitud", "Estado de la solicitud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTTSolNAprobadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSPSolNAprobadas.setViewportView(jTTSolNAprobadas);

        jBSolNAprobadas.setText("Justificación");

        jLSolNAprobadas.setText("Escriba el número de la solicitud en el siguiente recuadro y despues precione \"Justificación\" para observar la descripción de la solicitud.");

        jTSolNAprobadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSolNAprobadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSolNAprobadasLayout = new javax.swing.GroupLayout(jPSolNAprobadas);
        jPSolNAprobadas.setLayout(jPSolNAprobadasLayout);
        jPSolNAprobadasLayout.setHorizontalGroup(
            jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPSolNAprobadas)
                    .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                        .addGroup(jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLSolNAprobadas)
                            .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                                .addComponent(jTSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBSolNAprobadas)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPSolNAprobadasLayout.setVerticalGroup(
            jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLSolNAprobadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSolNAprobadas)
                    .addComponent(jTSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPSolAprobadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes aceptadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTSolAprobadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Número", "Nombre del Secretario", "Fecha de recepción", "Tipo de solicitud", "Estado de la solicitud", "Fecha de aprovación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTSolAprobadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSPSolAprobadas.setViewportView(jTSolAprobadas);

        jBSolAprobadas.setText("Justificación");

        jTFSolAprobadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSolAprobadasActionPerformed(evt);
            }
        });

        jLSolAprobadas.setText("Escriba el número de la solicitud en el siguiente recuadro y despues precione \"Justificación\" para observar la descripción de la solicitud.");

        javax.swing.GroupLayout jPSolAprobadasLayout = new javax.swing.GroupLayout(jPSolAprobadas);
        jPSolAprobadas.setLayout(jPSolAprobadasLayout);
        jPSolAprobadasLayout.setHorizontalGroup(
            jPSolAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSolAprobadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSolAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPSolAprobadas)
                    .addGroup(jPSolAprobadasLayout.createSequentialGroup()
                        .addGroup(jPSolAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLSolAprobadas)
                            .addGroup(jPSolAprobadasLayout.createSequentialGroup()
                                .addComponent(jTFSolAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBSolAprobadas)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPSolAprobadasLayout.setVerticalGroup(
            jPSolAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSolAprobadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPSolAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLSolAprobadas)
                .addGap(18, 18, 18)
                .addGroup(jPSolAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSolAprobadas)
                    .addComponent(jTFSolAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBInformacionBasica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPSolAprobadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPSolNAprobadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(131, 131, 131)
                        .addComponent(jBSol3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRegresar)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jBInformacionBasica)))
                .addGap(22, 22, 22)
                .addComponent(jBSolicitudes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jBAsignaturas)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jBSol3)
                            .addComponent(jBRegresar)))
                    .addComponent(jPSolAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignaturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAsignaturasActionPerformed

    private void jBInformacionBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInformacionBasicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInformacionBasicaActionPerformed

    private void jTSolNAprobadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSolNAprobadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSolNAprobadasActionPerformed

    private void jTFSolAprobadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSolAprobadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSolAprobadasActionPerformed

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
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAsignaturas;
    private javax.swing.JButton jBInformacionBasica;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBSol3;
    private javax.swing.JButton jBSolAprobadas;
    private javax.swing.JButton jBSolNAprobadas;
    private javax.swing.JButton jBSolicitudes;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLSolAprobadas;
    private javax.swing.JLabel jLSolNAprobadas;
    private javax.swing.JPanel jPSolAprobadas;
    private javax.swing.JPanel jPSolNAprobadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPSolAprobadas;
    private javax.swing.JScrollPane jSPSolNAprobadas;
    private javax.swing.JTextField jTFSolAprobadas;
    private javax.swing.JTable jTSolAprobadas;
    private javax.swing.JTextField jTSolNAprobadas;
    private javax.swing.JTable jTTSolNAprobadas;
    // End of variables declaration//GEN-END:variables
}
