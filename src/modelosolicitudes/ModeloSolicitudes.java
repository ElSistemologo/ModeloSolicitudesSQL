/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosolicitudes;
import java.sql.*; 
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modelosolicitudes.Login.pass;
import static modelosolicitudes.Login.usuario;
/**
 *
 * @author Leand
 */
public class ModeloSolicitudes {
    public static Connection conexion;
    public static String bd="modelosolicitudes";
    public static String user="root";
    public static String password="santiago1234";
    public static String host="localhost";
    public static String server="jdbc:mysql://"+host+"/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        /**
     * @param args the command line arguments
     */
     
    //Metodo Conectar
    public static  Connection getConnection(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server,user,password);
            System.out.println("Conexion a base de datos "+server+" ... OK");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion con "+server+" ... FAIL");
        }
        return conexion;
    
    }
    // ----------------------
    
    
     
    //Metodo para hacer cualquier consulta
    
     public static ResultSet getTableSQL(String Consulta){
       
        Statement s;
        ResultSet datos = null;
        try{
            conexion = DriverManager.getConnection(server,user,password);
            s = conexion.createStatement();
            datos = s.executeQuery(Consulta);
            //System.out.println(datos);
            
            while(datos.next()){
            
                /*
            System.out.println(
            "sol_id: " +datos.getInt (1) +
            "\tNombre Persona: " + datos.getString (2)+
            "\t sol_Fecha: " + datos.getString(3) +
            "\ttip_tipo: " + datos.getString("tip_tipo") 

            );
            */    
            return  datos;
            
        }   
            
        }
        catch(SQLException ex){System.out.println("Imposible realizar consulta ... FAIL getTableSQL ");  
        }   
        return  datos;
        
    }
     
     //METODO PARA LLENAR TABLAS BETA :C
        
    
    
    //Metodo test de consulta
    public static void ConsultaTest() {
        //realizar consulta
        try {
            // Preparamos la consulta
            conexion = DriverManager.getConnection(server,user,password);
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery ("select * from persona");
            // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla.
        while (rs.next())
        {
            System.out.println(
            "ID: " +rs.getInt (1) +
            "\tNombre Persona: " + rs.getString (2)+
            "\tApellidos Persona: " + rs.getString(3) +
            "\tEmail: " + rs.getString("per_correo") 

            );
        }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }
    }
            
    /**
     *
     * @param Usuario
     * @param Pass
     * @return
     */
           
    //METODO PARA AUTENTIFICACION DE USUARIOS
    public static int InicioSesion(String Usuario, String Pass  ){
        int resultado = 0;

        try {
            String SQL_call = "{call PA_ComprobacionPersona(?,?,?)}";
            //Statement s = conexion.createStatement();
            conexion = DriverManager.getConnection(server,user,password);
            CallableStatement cstmt = conexion.prepareCall(SQL_call); 
            cstmt.setString(1 ,Usuario );
            cstmt.setString(2, Pass);
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.execute(); 
            resultado = cstmt.getInt(3);

            //ResultSet procObr = s.executeQuery ("CAll PA_obra (300,1000,@CantActualizacion_obras)");
            System.out.println("Ejecutando procedimiento " + cstmt );
            System.out.println("Procedimiento Almacenado ejecutado con éxito  ..... OK");     

            return resultado ;
        } catch (SQLException ex) {
            System.out.println("Imposible realizar procedimento almacenado ... FAIL");

            }


        return resultado ;
    }
    
   // metodo para saber id del usuario
    
     public static int IdUsuario(String Usuario, String Pass ){
        int resultado = 0;

        try {
            String SQL_call = "{call PA_IDusuario(?,?,?)}";
            //Statement s = conexion.createStatement();
            conexion = DriverManager.getConnection(server,user,password);
            CallableStatement cstmt = conexion.prepareCall(SQL_call); 
            cstmt.setString(1 ,Usuario );
            cstmt.setString(2, Pass);
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.execute(); 
            resultado = cstmt.getInt(3);

            //ResultSet procObr = s.executeQuery ("CAll PA_obra (300,1000,@CantActualizacion_obras)");
            System.out.println("Ejecutando procedimiento " + cstmt );
            System.out.println("Procedimiento Almacenado ejecutado con éxito  ..... OK");     

            return resultado ;
        } catch (SQLException ex) {
            System.out.println("Imposible realizar procedimento almacenado ... FAIL");

            }


        return resultado ;
    }
    
    //METODO PARA COMPROBAR CARGO DE USUARIOS    
    public static String CargoUsuario(String Usuario ){
                String cargo = "";
                
                try {
                    String SQL_call = "{call PA_ComprobacionCargo(?,?)}";
                    //Statement s = conexion.createStatement();
                    conexion = DriverManager.getConnection(server,user,password);
                    CallableStatement cstmt = conexion.prepareCall(SQL_call); 
                    cstmt.setString(1 ,Usuario);
                    cstmt.registerOutParameter(2,Types.VARCHAR);
                    cstmt.execute(); 
                    cargo = cstmt.getNString(2);
                    
                    //ResultSet procObr = s.executeQuery ("CAll PA_obra (300,1000,@CantActualizacion_obras)");
                    System.out.println("Ejecutando procedimiento " + cstmt );
                    System.out.println("Procedimiento Almacenado ejecutado con éxito  ..... OK");     
                    
                    return cargo ;
                } catch (SQLException ex) {
                    System.out.println("Imposible realizar procedimento almacenado ... FAIL");
                    
                    }
                
                
                return cargo ;
            }
        
            
    public static void main(String[] args) {
        //conectar
       try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server,user,password);
            System.out.println("Conexion a base de datos "+server+" ... OK");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion con "+server+" ... FAIL");
        }
    /**
     * @param args the command line arguments
     */
       
        
        //System.out.println("-->"+InicioSesion("hol1","hol11234"));
        getTableSQL("SELECT sol_id, Nombre_Secretario,  sol_Fecha, tip_tipo, estSol_nombre FROM vw_SolicitudesTodasEst");
        
        //desconectar
        try {
        conexion.close();
            System.out.println("Cerrar conexion con "+server+" ... OK");
        } catch (SQLException ex) {
            System.out.println("Imposible cerrar conexion ... FAIL");
        }
    }
    
}
