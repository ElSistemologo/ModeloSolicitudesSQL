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
import static modelosolicitudes.ModeloSolicitudes.password;
import static modelosolicitudes.ModeloSolicitudes.server;
import static modelosolicitudes.ModeloSolicitudes.user;

/**
 *
 * @author Leand
 */
public class EstudianteAsignaturas extends javax.swing.JFrame {

    /**
     * Creates new form panel_control
     */
    public EstudianteAsignaturas() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTabla1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBRegresar = new javax.swing.JButton();
        jBInformacionBasica = new javax.swing.JButton();
        jBSolicitudes = new javax.swing.JButton();
        jBAsignaturas = new javax.swing.JButton();
        jPAsigActuales = new javax.swing.JPanel();
        jSPAsigActuales = new javax.swing.JScrollPane();
        jTAsigActuales = new javax.swing.JTable();
        jPAsigCursadas = new javax.swing.JPanel();
        jSPAsigCursadas = new javax.swing.JScrollPane();
        jTAsigCursadas = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(200, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignaturas Cursadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Asignatura", "Profesor", "Grupo", "Fecha", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTTabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTTabla1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        jBAsignaturas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBAsignaturas.setText("Asignaturas");
        jBAsignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBAsignaturas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBAsignaturas.setSelected(true);
        jBAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsignaturasActionPerformed(evt);
            }
        });

        jPAsigActuales.setBackground(new java.awt.Color(200, 240, 240));
        jPAsigActuales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignaturas actuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTAsigActuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asignatura", "Grupo", "Profesor", "Horario", "Salón"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAsigActuales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSPAsigActuales.setViewportView(jTAsigActuales);

        javax.swing.GroupLayout jPAsigActualesLayout = new javax.swing.GroupLayout(jPAsigActuales);
        jPAsigActuales.setLayout(jPAsigActualesLayout);
        jPAsigActualesLayout.setHorizontalGroup(
            jPAsigActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsigActualesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPAsigActuales, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPAsigActualesLayout.setVerticalGroup(
            jPAsigActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsigActualesLayout.createSequentialGroup()
                .addComponent(jSPAsigActuales, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPAsigCursadas.setBackground(new java.awt.Color(200, 240, 240));
        jPAsigCursadas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignaturas cursadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTAsigCursadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asignatura", "Grupo", "Profesor", "Fecha", "Calificación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAsigCursadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSPAsigCursadas.setViewportView(jTAsigCursadas);

        javax.swing.GroupLayout jPAsigCursadasLayout = new javax.swing.GroupLayout(jPAsigCursadas);
        jPAsigCursadas.setLayout(jPAsigCursadasLayout);
        jPAsigCursadasLayout.setHorizontalGroup(
            jPAsigCursadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsigCursadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPAsigCursadas, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPAsigCursadasLayout.setVerticalGroup(
            jPAsigCursadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPAsigCursadas, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBInformacionBasica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jBSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPAsigActuales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPAsigCursadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBRegresar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPAsigCursadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jBInformacionBasica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSolicitudes)
                        .addGap(178, 178, 178)
                        .addComponent(jBAsignaturas))
                    .addComponent(jPAsigActuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
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
    
    
    
    public void limpiarTablaActuales(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) this.jTAsigActuales.getModel();
            int filas=this.jTAsigActuales.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    public void limpiarTablaCursadas(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) this.jTAsigCursadas.getModel();
            int filas=this.jTAsigCursadas.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    
    
    
    // rellenar tabla asignaturas cursadas
    public void rellenar_tabla1(){
    String usuarioID = Login.usuario;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,user,password);
            
            // Statement st =  conexion.createStatement();
            String sql = "CALL proc_est_materias_vistas(?)" ;
            CallableStatement st = conexion.prepareCall(sql);
            st.setString(1, usuarioID);
            st.execute();
            ResultSet rs = st.getResultSet();
            
            
            while (rs.next()) {   
                //Datos se agregaran hasta que finalice
                String asignatura = String.valueOf(rs.getString("Asignatura"));
                String grupo = String.valueOf(rs.getInt("Grupo"));
                String nombre_profesor = String.valueOf(rs.getString("Nombre_Profesor"));
                String ins_AñoSemestre = String.valueOf(rs.getString("ins_AñoSemestre"));
                String calificacion = String.valueOf(rs.getInt("Calificacion"));
                
                //String Array para almacenar los datos en el Jtable
                
                String tbData[] = {asignatura,grupo,nombre_profesor,ins_AñoSemestre,calificacion};
                DefaultTableModel tblModel = (DefaultTableModel)jTAsigCursadas.getModel();
                System.err.println(asignatura);
                //Finalmente se añade el lo contenido en el String Array al jtable
                
                tblModel.addRow(tbData);
                
            }
            
            System.out.println("Datos agregados a la tabla 1 " );
            //conexion.close();
        }catch(Exception e){
            System.out.println(e.getMessage()+ "No se pudo hacer la coneccion");
        }
    }
    
    // rellena tabla de asignaturas acuales
    public void rellenar_tabla2(){
        System.out.println("qwe");
        String usuarioID = Login.usuario;
        System.out.println("qwe");
        this.limpiarTablaActuales();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server,user,password);
            
            // Statement st =  conexion.createStatement();
            String sql = "CALL proc_est_materias_actuales(?)" ;
            CallableStatement st = conexion.prepareCall(sql);
            st.setString(1, usuarioID);
            st.execute();
            ResultSet rs = st.getResultSet();
            System.out.println("jkl");
            
            while (rs.next()) {   
                //Datos se agregaran hasta que finalice
                String asignatura = String.valueOf(rs.getString("Asignatura"));
                String grupo = String.valueOf(rs.getInt("Grupo"));
                String nombre_profesor = String.valueOf(rs.getString("Nombre_Profesor"));
                String horario = String.valueOf(rs.getString("Horario"));
                String salon = String.valueOf(rs.getString("Salon"));
                System.out.println("iop");
                //String Array para almacenar los datos en el Jtable
                
                String tbData[] = {asignatura,grupo,nombre_profesor,horario,salon};
                DefaultTableModel tblModel = (DefaultTableModel)jTAsigActuales.getModel();
                System.err.println(horario);
                //Finalmente se añade el lo contenido en el String Array al jtable
                
                tblModel.addRow(tbData);
                
            }
            
            System.out.println("Datos agregados a la tabla 2 " );
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAsignaturasActionPerformed

    private void jBInformacionBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInformacionBasicaActionPerformed
        EstudiantePersonalInfo est_info = new EstudiantePersonalInfo(); //nueva ventana de información personal
        est_info.setVisible(true);
        est_info.rellenar_tabla1();
        this.dispose();
    }//GEN-LAST:event_jBInformacionBasicaActionPerformed

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
            java.util.logging.Logger.getLogger(EstudianteAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudianteAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudianteAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteAsignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EstudianteAsignaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAsignaturas;
    private javax.swing.JButton jBInformacionBasica;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBSolicitudes;
    private javax.swing.JPanel jPAsigActuales;
    private javax.swing.JPanel jPAsigCursadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSPAsigActuales;
    private javax.swing.JScrollPane jSPAsigCursadas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAsigActuales;
    private javax.swing.JTable jTAsigCursadas;
    private javax.swing.JTable jTTabla1;
    // End of variables declaration//GEN-END:variables
}
