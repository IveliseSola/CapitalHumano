/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_a_Datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UtilDB {
    
   public enum dbTypeQuery {INSERT,MODIFY,DELETE,LIST,SEARCH}; 
   
   public static String DB_IP = "localhost";
   public static String DB_PORT = "3306";
   public static String DB_TYPE = "mysql";
   public static String DB_NAME = "capital_humano";
   public static String DB_USER = "root";
   public static String DB_PASSWORD = "";
    
   private static UtilDB instance = null;
   
   private UtilDB(){
      try
       {
        Class.forName("com.mysql.jdbc.Driver");
        
       }catch(ClassNotFoundException fe){
       Logger.getLogger(UtilDB.class.getName()).log(Level.SEVERE, null, fe);
        }
        //catch(SQLException sqle){}
        catch(Exception e){}
   } 

   
   public static UtilDB getInstance() {
        if (instance == null) {
            instance = new UtilDB();
        }
        return instance;
    }
   
   
   public Connection getConnection() throws SQLException {
       
      String url = "jdbc:" + DB_TYPE + "://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
      return DriverManager.getConnection(url,DB_USER,DB_PASSWORD);
   }
   
   
   public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UtilDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UtilDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UtilDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
