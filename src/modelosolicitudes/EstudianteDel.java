package modelosolicitudes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static modelosolicitudes.Login.usuario;
import static modelosolicitudes.ModeloSolicitudes.password;
import static modelosolicitudes.ModeloSolicitudes.server;
import static modelosolicitudes.ModeloSolicitudes.user;

/**
 *
 * @author Leand
 */
public class EstudianteDel extends javax.swing.JFrame {

    /**
     * Creates new form panel_control
     */
    public EstudianteDel() {
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
        jPSolNAprobadas = new javax.swing.JPanel();
        jSPSolNAprobadas = new javax.swing.JScrollPane();
        jTTSolNAprobadas = new javax.swing.JTable();
        jBSolNAprobadas = new javax.swing.JButton();
        jLSolNAprobadas = new javax.swing.JLabel();
        jTSolNAprobadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
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

        jBAsignaturas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAsignaturas.setText("Asignaturas");
        jBAsignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBAsignaturas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignaturasActionPerformed(evt);
            }
        });

        jPSolNAprobadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes disponibles para eliminar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTTSolNAprobadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre del Secretario", "Fecha de recepción", "Tipo de solicitud", "Estado de la solicitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTTSolNAprobadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSPSolNAprobadas.setViewportView(jTTSolNAprobadas);

        jBSolNAprobadas.setText("Eliminar");
        jBSolNAprobadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSolNAprobadasActionPerformed(evt);
            }
        });

        jLSolNAprobadas.setText("Escriba el número de la solicitud en el siguiente recuadro y despues precione \"Eliminar\" si desea eliminar esa solicitud.");

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
                .addComponent(jSPSolNAprobadas, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                        .addComponent(jTSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSolNAprobadas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPSolNAprobadasLayout.setVerticalGroup(
            jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSolNAprobadasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jSPSolNAprobadas, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPSolNAprobadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSolNAprobadas))
                .addGap(34, 34, 34))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPSolNAprobadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRegresar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jBInformacionBasica)
                        .addGap(156, 156, 156)
                        .addComponent(jBSolicitudes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPSolNAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jBAsignaturas)
                .addGap(55, 55, 55)
                .addComponent(jBRegresar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void rellenar_tabla1(){
    String usuarioID = Login.usuario;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,user,password);
            
            // Statement st =  conexion.createStatement();
            String sql = "CALL proc_est_solicitudes_para_borrar(?)" ;
            CallableStatement st = conexion.prepareCall(sql);
            st.setString(1, usuarioID);
            st.execute();
            ResultSet rs = st.getResultSet();
            
            
            while (rs.next()) {   
                //Datos se agregaran hasta que finalice
                String NumeroSolicitud = String.valueOf(rs.getInt("sol_id"));
                String Nombre_Secretario = String.valueOf(rs.getString("Nombre_Secretario"));
                String Fecha_Solicitud = String.valueOf(rs.getDate("Fecha_Recepcion"));
                String Tipo_Solicitud = String.valueOf(rs.getString("TipoSolicitud"));
                String Estado_Solicitud = String.valueOf(rs.getString("Estado"));
                
                //String Array para almacenar los datos en el Jtable
                
                String tbData[] = {NumeroSolicitud,Nombre_Secretario,Fecha_Solicitud,Tipo_Solicitud,Estado_Solicitud};
                DefaultTableModel tblModel = (DefaultTableModel)jTTSolNAprobadas.getModel();
                System.err.println(NumeroSolicitud);
                //Finalmente se añade el lo contenido en el String Array al jtable
                
                tblModel.addRow(tbData);
                
            }
            
            System.out.println("Datos agregados a la tabla 1 " );
            //conexion.close();
        }catch(Exception e){
            System.out.println(e.getMessage()+ "No se pudo hacer la coneccion");
        }
    }
    /*
    public void borrarSolicitud(){
    int id_solicitud = jTSolNAprobadas.getInt();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,user,password);
            
            String sql = "CALL proc_borrar_solicitud(?)" ;
            CallableStatement st = conexion.prepareCall(sql);
            st.setString(1, id_solicitud);
            st.execute();
   
            System.out.println("Datos eliminados");
            this.rellenar_tabla1();
            this.jTSolNAprobadas.setText("");
            
        }catch(Exception e){
            System.out.println(e.getMessage()+ "No se pudo hacer la coneccion");
        }
    }
    */
    private void jTSolNAprobadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSolNAprobadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSolNAprobadasActionPerformed

    private void jBAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignaturasActionPerformed
        EstudianteAsignaturas est_asig = new EstudianteAsignaturas(); //nueva ventana de asignaturas
        est_asig.rellenar_tabla2();
        est_asig.setVisible(true);
        
        est_asig.rellenar_tabla1();
        this.dispose();
    }//GEN-LAST:event_jBAsignaturasActionPerformed

    private void jBInformacionBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInformacionBasicaActionPerformed
        EstudiantePersonalInfo est_info = new EstudiantePersonalInfo(); //nueva ventana de información personal
        est_info.setVisible(true);
        est_info.rellenar_tabla1();
        this.dispose();
    }//GEN-LAST:event_jBInformacionBasicaActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        Login est_log = new Login(); //nueva ventana inicial - volver a iniciar seción
        est_log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBSolNAprobadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSolNAprobadasActionPerformed
        //borrarSolicitud();
    }//GEN-LAST:event_jBSolNAprobadasActionPerformed

    private void jBSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSolicitudesActionPerformed
        EstudianteSol est_sol = new EstudianteSol(); // nueva ventana de solicitudes para estudiante
        est_sol.setVisible(true);
        est_sol.rellenar_tabla1();
        est_sol.rellenar_tabla2();
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
            java.util.logging.Logger.getLogger(EstudianteDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudianteDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudianteDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteDel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAsignaturas;
    private javax.swing.JButton jBInformacionBasica;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBSolNAprobadas;
    private javax.swing.JButton jBSolicitudes;
    private javax.swing.JLabel jLSolNAprobadas;
    private javax.swing.JPanel jPSolNAprobadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPSolNAprobadas;
    private javax.swing.JTextField jTSolNAprobadas;
    private javax.swing.JTable jTTSolNAprobadas;
    // End of variables declaration//GEN-END:variables
}
