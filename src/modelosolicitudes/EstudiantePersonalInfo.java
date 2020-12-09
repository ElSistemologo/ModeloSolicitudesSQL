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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modelosolicitudes.ModeloSolicitudes.password;
import static modelosolicitudes.ModeloSolicitudes.server;
import static modelosolicitudes.ModeloSolicitudes.user;

/**
 *
 * @author Leand
 */
public class EstudiantePersonalInfo extends javax.swing.JFrame {

    /**
     * Creates new form panel_control
     */
    public EstudiantePersonalInfo() {
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
        jTFUpdateCorreo = new javax.swing.JTextField();

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

        jBInformacionBasica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jBAsignaturas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAsignaturas.setText("Asignaturas");
        jBAsignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBAsignaturas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignaturasActionPerformed(evt);
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

            },
            new String [] {
                "Nombre", "Apellidos", "Documento", "Teléfono", "Contraseña", "Correo", "Carrera", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

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
                            .addComponent(jBAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                    .addComponent(jTFUpdateCorreo)
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
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBUpdateDocumento)
                            .addComponent(jTFUpdateDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUpdateCorreo)
                            .addComponent(jTFUpdateCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAsignaturas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBInformacionBasica)
                        .addGap(81, 81, 81)
                        .addComponent(jBSolicitudes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jBRegresar)
                .addContainerGap())
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
    
    
    
    public void actualizarInfo(
            Object nombreIn,
            Object apellidoIn,
            Object documentoIn,
            Object correoIn,
            Object contraseñaIn,
            Object telefonoIn){
    int usuarioID = Login.idUsuario;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,user,password);
            
            // procedimiento Almacenado de update
            //?: nombre, apellido, documento,correo,contraseña,telefono
            String sql = "CALL proc_update_info_personal(?,?,?,?,?,?,?)" ;
            CallableStatement st = conexion.prepareCall(sql);
            st.setObject(1, nombreIn);
            st.setObject(2, apellidoIn);
            st.setObject(3, documentoIn);
            st.setObject(4, correoIn);
            st.setObject(5, contraseñaIn);
            st.setObject(6, telefonoIn);
            st.setInt(7, usuarioID);
            st.execute();

            System.out.println("Datos agregados a la tabla 2");
            //conexion.close();
            
            this.rellenar_tabla1();
            
        }catch(Exception e){
            System.out.println(e.getMessage()+ "No se pudo hacer la coneccion");
        }
    }
    
    
    public void limpiarTabla(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) this.jTInformacion.getModel();
            int filas=this.jTInformacion.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    
    public void rellenar_tabla1(){
    String usuarioID = Login.usuario;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,user,password);
            
            // Statement st =  conexion.createStatement();
            String sql = "CALL proc_est_info_basica(?)" ;
            CallableStatement st = conexion.prepareCall(sql);
            st.setString(1, usuarioID);
            st.execute();
            ResultSet rs = st.getResultSet();
            this.limpiarTabla();
            
            while (rs.next()) {   
                //Datos se agregaran hasta que finalice
                String nombre = String.valueOf(rs.getString("Nombre"));
                String apellidos = String.valueOf(rs.getString("Apellidos"));
                String documento = String.valueOf(rs.getInt("Documento"));
                String telefono = String.valueOf(rs.getInt("Telefono"));
                String contraseña = String.valueOf(rs.getString("Contraseña"));
                String correo = String.valueOf(rs.getString("Correo"));
                String carrera = String.valueOf(rs.getString("Carrera"));
                String nombre_usuario = String.valueOf(rs.getString("per_username"));
                
                //String Array para almacenar los datos en el Jtable
                
                String tbData[] = {nombre, apellidos, documento, telefono,contraseña, correo, carrera, nombre_usuario};
                DefaultTableModel tblModel = (DefaultTableModel)jTInformacion.getModel();
                System.err.println(nombre_usuario);
                //Finalmente se añade el lo contenido en el String Array al jtable
                
                tblModel.addRow(tbData);
                
            }
            
            System.out.println("Datos agregados a la tabla 1 " );
            //conexion.close();
        }catch(Exception e){
            System.out.println(e.getMessage()+ "No se pudo hacer la coneccion");
        }
    }
    
    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        Login est_log = new Login(); //nueva ventana inicial - volver a iniciar seción
        est_log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsignaturasActionPerformed
        EstudianteAsignaturas est_asig = new EstudianteAsignaturas(); //nueva ventana de asignaturas
        est_asig.rellenar_tabla2();
        est_asig.setVisible(true);
       
        est_asig.rellenar_tabla1();
        this.dispose();
    }//GEN-LAST:event_jBAsignaturasActionPerformed

    private void jBUpdateNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateNombreActionPerformed
        // TODO add your handling code here:
        String nombre = this.jTFUpdateNombre.getText();
        actualizarInfo(nombre,null,null,null,null,null);//nombre, apellido, documento,correo,contraseña,telefono
        this.jTFUpdateNombre.setText("");//se limpia el campo de texto
    }//GEN-LAST:event_jBUpdateNombreActionPerformed

    private void jBInformacionBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInformacionBasicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInformacionBasicaActionPerformed

    private void jBUpdateApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateApellidosActionPerformed
        // TODO add your handling code here:
        String apellido = this.jTFUpdateApellidos.getText();//recolección del campo de texto
        actualizarInfo(null,apellido,null,null,null,null);//nombre, apellido, documento,correo,contraseña,telefono
        this.jTFUpdateApellidos.setText("");//se limpia el campo de texto
    }//GEN-LAST:event_jBUpdateApellidosActionPerformed

    private void jBUpdateDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateDocumentoActionPerformed
        // TODO add your handling code here:
        int documento = Integer.parseInt (this.jTFUpdateDocumento.getText());
        actualizarInfo(null,null,documento,null,null,null);//nombre, apellido, documento,correo,contraseña,telefono
        this.jTFUpdateDocumento.setText("");//se limpia el campo de texto
        
    }//GEN-LAST:event_jBUpdateDocumentoActionPerformed

    private void jBUpdateTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateTelefonoActionPerformed
        // TODO add your handling code here:
        int telefono = Integer.parseInt(this.jTFUpdateTelefono.getText());
        actualizarInfo(null,null,null,null,null,telefono);//nombre, apellido, documento,correo,contraseña,telefono
        this.jTFUpdateTelefono.setText("");//se limpia el campo de texto
    }//GEN-LAST:event_jBUpdateTelefonoActionPerformed

    private void jBUpdateContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateContraseñaActionPerformed
        // TODO add your handling code here:
        String contraseña = this.jTFUpdateContraseña.getText();
        actualizarInfo(null,null,null,null,contraseña,null);//nombre, apellido, documento,correo,contraseña,telefono
        this.jTFUpdateContraseña.setText("");//se limpia el campo de texto
    }//GEN-LAST:event_jBUpdateContraseñaActionPerformed

    private void jBUpdateCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateCorreoActionPerformed
        // TODO add your handling code here:
        String correo = this.jTFUpdateCorreo.getText();
        actualizarInfo(null,null,null,correo,null,null);//nombre, apellido, documento,correo,contraseña,telefono
        this.jTFUpdateCorreo.setText("");//se limpia el campo de texto
    }//GEN-LAST:event_jBUpdateCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(EstudiantePersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudiantePersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudiantePersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudiantePersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EstudiantePersonalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAsignaturas;
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
    private javax.swing.JTextField jTFUpdateCorreo;
    private javax.swing.JTextField jTFUpdateDocumento;
    private javax.swing.JTextField jTFUpdateNombre;
    private javax.swing.JTextField jTFUpdateTelefono;
    private javax.swing.JTable jTInformacion;
    // End of variables declaration//GEN-END:variables
}
