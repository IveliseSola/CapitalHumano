/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Acceso_a_Datos.ConsultaDB;
import Acceso_a_Datos.UtilDB;
import GUIS.PrincipalA;
import GUIS.PrincipalE;
import GUIS.PrincipalT;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CapitalHumano {
   
     // Gestionar Usuario
         
      public static  void addUsuario(Usuario u) throws SQLException, Exception {
      
          Connection conn = null;
          PreparedStatement pstmt = null;
             try {
                   if (!existUsuario(u.Getnombre(),u.Getapellido())) {
                   conn = UtilDB.getInstance().getConnection();
                   pstmt = conn.prepareStatement(ConsultaDB.INSERT_USUARIO);
                  
                   pstmt.setString(1, u.Getnombre());
                   pstmt.setString(2, u.Getapellido());
                   pstmt.setString(3, u.Getnombu());
                   pstmt.setString(4, u.Getcontrasena());
                   pstmt.setString(5, u.Gettipou());
                 
                   pstmt.executeUpdate();
                   } else {    
                      throw new Exception("Ya existe el Usuario: " + u.Getnombre());
                     }
            } catch (SQLException sqle) {
                 Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
              throw sqle;
            } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
            }
     }
     
      
     private static boolean existUsuario(String nombre, String apellidos) throws SQLException {
        boolean found = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_USUARIO);
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidos);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                found = true;
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return found;
      }    
        
       
      public static List<Usuario> getAllUsuarios() throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<Usuario> usuarios= new ArrayList<Usuario>(); 
      try {
            conn = UtilDB.getInstance().getConnection();
            stmt = (Statement) conn.createStatement();
            rs = stmt.executeQuery(ConsultaDB.SELECT_ALL_USUARIO);
            Usuario u = null;
            while (rs.next()) {
                u = new Usuario();
                u.SetId(rs.getInt("idusuario"));
                u.Setnombre(rs.getString("nombre"));
                u.Setapellido(rs.getString("apellidos"));
                u.Setnombu(rs.getString("nombreusuario"));
                u.Setcontrasena(rs.getString("contraseña"));
                u.Settipou(rs.getString("rol"));
              
                usuarios.add(u);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return usuarios;
    }

     public static void deleteUsuario(int idusuario) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.DELETE_USUARIO);
            pstmt.setInt(1, idusuario);
            pstmt.executeUpdate();
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
    }

     public static void updateUsuario(Usuario u, int id) throws SQLException {
        Connection conn = null;
       
       // PreparedStatement pstmt = null;
        try {
                conn = UtilDB.getInstance().getConnection();
                 Statement stmt= conn.createStatement();
                //pstmt = conn.prepareStatement(ConsultaDB.UPDATE_USUARIO);
               // pstmt.setInt(1, id);
                //pstmt.setInt(1, u.Getid());
               // pstmt.setString(2, u.Getnombre());
               // pstmt.setString(3, u.Getapellido());
               // pstmt.setString(4, u.Getnombu());
               // pstmt.setString(5, u.Getcontrasena());
               // pstmt.setString(6, u.Gettipou());
                 
                 String UPDATE_USUARIO = "UPDATE usuario SET "
                         + " nombre='" + u.Getnombre() + "',"
                         + " apellidos='" +u.Getapellido() + "',"
                         + " nombreusuario='" + u.Getnombu() + "',"
                         + " contraseña='" + u.Getcontrasena() + "',"
                         + " rol='" + u.Gettipou() + "'"
                         + " WHERE idusuario='"+ id + "';";
                stmt.executeUpdate(UPDATE_USUARIO);
        }catch (SQLException sqle){
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            //UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
    }
    
     public static Usuario getUsuario(int Id) throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Usuario u = new Usuario();
        try {

            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.SELECT_USUARIO);
            pstmt.setInt(1, Id);
            rs = pstmt.executeQuery();

             if (rs.next()) {
                u.SetId(rs.getInt("idusuario"));
                u.Setnombre(rs.getString("nombre"));
                u.Setapellido(rs.getString("apellidos"));
                u.Setnombu(rs.getString("nombreusuario"));
                u.Setcontrasena(rs.getString("contraseña"));
                u.Settipou(rs.getString("rol"));
             }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return u;
     }
        
        
        public static void Authenticate (String n, String p) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
     
        try{

            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.AUTHENTICATE);
            pstmt.setString(1, n);
            pstmt.setString(2, p);
            rs = pstmt.executeQuery();
            rs.next();
            
            String role= rs.getString("rol");
            if ("Administrador".equals(role)){
                new PrincipalA().setVisible(true);}
             else if ("Especialista".equals(role))
                    { new PrincipalE().setVisible(true);}
                 else {new PrincipalT().setVisible(true);}
           
        }catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        }finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        }
    
        
    // Gestionar CO
        
        public static  void addCO (CategoriaOcuapcional co) throws SQLException, Exception {
      
          Connection conn = null;
          PreparedStatement pstmt = null;
             try {
                //   if (!existCO(co.getNombre())) {
                   conn = UtilDB.getInstance().getConnection();
                   pstmt = conn.prepareStatement(ConsultaDB.INSERT_CO);
                  
                   pstmt.setString(1, co.getNombre());
                   pstmt.setString(2, co.getClasificacion());
                   pstmt.setString(3,co.getAbreviatura());
                   
                   pstmt.executeUpdate();
             /*  } else {    
                      throw new Exception("Ya existe la Categoria Ocupacional: " + co.getNombre());
                     }  */  
            } catch (SQLException sqle) {
                 Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
              throw sqle;
            } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
            }
        }
        
         private static int findCO(String nombre) throws SQLException{
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int id;
        try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_CO);
            pstmt.setString(1, nombre);
            
            rs = pstmt.executeQuery();
            rs.next();
            id= rs.getInt("identificadorco");
                
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return id;
        
        }
        
      /*   private static boolean existCO(String nombre) throws SQLException {
        boolean found = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_CO);
            pstmt.setString(1, nombre);
            
            rs = pstmt.executeQuery();
            if (rs.next()) {
                found = true;
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return found;
      }    
     */   
        public static void updateCO(CategoriaOcuapcional co, int id) throws SQLException {
        Connection conn = null;
       
        try {
                conn = UtilDB.getInstance().getConnection();
                 Statement stmt= conn.createStatement();
                 
                 String UPDATE_CO = "UPDATE categoriaocupacional SET "
                         + " nombre='" + co.getNombre() + "',"
                         + " abreviatura='" +co.getAbreviatura() + "',"
                         + " clasificacion='" + co.getClasificacion() + "'"
                         + " WHERE identificadorco='"+ id + "';";
                stmt.executeUpdate(UPDATE_CO);
        }catch (SQLException sqle){
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(conn);
        }
    }
             
        public static void deleteCO (int id) throws SQLException {
        
         Connection conn = null;
         PreparedStatement pstmt = null;
         try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.DELETE_CO);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
         } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
         } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
     }
        
      public static List<CategoriaOcuapcional> getAllCO() throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<CategoriaOcuapcional> categorias= new ArrayList<CategoriaOcuapcional>(); 
      try {
            conn = UtilDB.getInstance().getConnection();
            stmt = (Statement) conn.createStatement();
            rs = stmt.executeQuery(ConsultaDB.SELECT_ALL_CO);
            CategoriaOcuapcional co = null;
            while (rs.next()) {
                co = new CategoriaOcuapcional();
                co.setId(rs.getInt("identificadorco"));
                co.setNombre(rs.getString("nombre"));
                co.setClasificacion(rs.getString("clasificacion"));
                co.setAbreviatura(rs.getString("abreviatura"));
                
                categorias.add(co);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return categorias;
    }
    
       public static CategoriaOcuapcional getCO(int Id) throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CategoriaOcuapcional co = new CategoriaOcuapcional();
        try {

            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.SELECT_CO);
            pstmt.setInt(1, Id);
            rs = pstmt.executeQuery();

             if (rs.next()) {
                co.setId(rs.getInt("identificadorco"));
                co.setNombre(rs.getString("nombre"));
                co.setAbreviatura(rs.getString("abreviatura"));
                co.setClasificacion(rs.getString("clasificacion"));

             }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return co;
     }
        
      // Gestionar Cargo
       
        public static  void addCargo (Cargo c, String nombuo, String nombco) throws SQLException, Exception {
      
          Connection conn = null;
         
                try {
                conn = UtilDB.getInstance().getConnection();
                Statement stmt= conn.createStatement();
                int iduo= findUO(nombuo);
                int idco= findCO(nombco);
                 
                 String INSERT = "INSERT INTO `cargo` (`nombre`, `grupoescala`, `salario`, `resolucion`, `calificacion`, `Tipo`, `identificadoruo`, `identificadorco`) VALUES ("
                         + "'" + c.getNombre() + "',"
                         + "'" +c.getGrupoEscala() + "',"
                         + "'" +c.getSalario() + "',"
                         + "'" +c.getResolucion() + "',"
                         + "'" +c.getCalificacion() + "',"
                         + "'" +c.getTipo() + "',"
                         + "" +iduo + ","
                         + "" +idco + ");";
                        
                stmt.execute(INSERT);
                 
            } catch (SQLException sqle) {
                 Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
              throw sqle;
            } finally {
           
            UtilDB.close(conn);
            }
        }
       
        public static void updateCargo(Cargo c,int id, String nombuo, String nombco) throws SQLException {
        Connection conn = null;
         
                try {
                conn = UtilDB.getInstance().getConnection();
                Statement stmt= conn.createStatement();
                int iduo= findUO(nombuo);
                int idco= findCO(nombco);
                 
                 String UPDATE_CARGO = "UPDATE cargo SET "
                         + " nombre='" + c.getNombre() + "',"
                         + " grupoescala='" +c.getGrupoEscala() + "',"
                         + " salario='" +c.getSalario() + "',"
                         + " resolucion='" +c.getResolucion() + "',"
                         + " calificacion='" +c.getCalificacion() + "',"
                         + " tipo='" +c.getTipo() + "',"
                         + " identificadoruo='" +iduo + "',"
                         + " identificadorco='" + idco + "'"
                         + " WHERE identificadorcargo='"+ id + "';";
                stmt.executeUpdate(UPDATE_CARGO);
        }catch (SQLException sqle){
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(conn);
        }
    }
        
     public static void updatePlazas(Cargo c,int id) throws SQLException {
        Connection conn = null;
         
                try {
                conn = UtilDB.getInstance().getConnection();
                Statement stmt= conn.createStatement();
               
                 
                 String UPDATE_CARGO = "UPDATE cargo SET "
                         + " plazasp='" +c.getPlazasP() + "',"
                         + " plazasa='" +c.getPlazasA() + "',"
                         + " plazasc='" + c.getPlazasC()+ "'"
                         + " WHERE identificadorcargo='"+ id + "';";
                stmt.executeUpdate(UPDATE_CARGO);
        }catch (SQLException sqle){
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(conn);
        }
    }
        
        
        public static Cargo getCargo(int Id) throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Cargo c = new Cargo();
        try {

            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.SELECT_CARGO);
            pstmt.setInt(1, Id);
            rs = pstmt.executeQuery();

             if (rs.next()) {
                c.setId(rs.getInt("identificadorcargo"));
                c.setNombre(rs.getString("nombre"));
                c.setGrupoEscala(rs.getString("grupoescala"));
                c.setSalario(rs.getFloat("salario"));
                c.setResolucion(rs.getString("resolucion"));
                c.setCalificacion(rs.getString("calificacion"));
                c.setTipo(rs.getString("tipo"));
               // c.setIdco(rs.getInt("identificadorco"));
                //c.setIduo(rs.getInt("identificadoruo"));
             }
             
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return c;
     } 
        
      public static List<Cargo> getAllCargos() throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<Cargo> cargos= new ArrayList<Cargo>(); 
      try {
            conn = UtilDB.getInstance().getConnection();
            stmt = (Statement) conn.createStatement();
            rs = stmt.executeQuery(ConsultaDB.SELECT_ALL_CARGO);
            Cargo c;
            while (rs.next()) {
                c = new Cargo();
                c.setId(rs.getInt("identificadorcargo"));
                c.setNombre(rs.getString("nombre"));
                c.setGrupoEscala(rs.getString("grupoescala"));
                c.setSalario(rs.getFloat("salario"));
                c.setResolucion(rs.getString("resolucion"));
                c.setCalificacion(rs.getString("calificacion"));
                c.setTipo(rs.getString("tipo"));
                c.setIdco(rs.getInt("identificadorco"));
                c.setIduo(rs.getInt("identificadoruo"));
                c.setPlazasP(rs.getInt("plazasp"));
                c.setPlazasA(rs.getInt("plazasa"));
                c.setPlazasC(rs.getInt("plazasc"));
                
                cargos.add(c);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return cargos;
    }
        
   public static List<Cargo> getSalaryBigger(float value) throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<Cargo> cargos= new ArrayList<Cargo>(); 
      try {
           conn = UtilDB.getInstance().getConnection();
           stmt = (Statement) conn.createStatement();
           rs = stmt.executeQuery(ConsultaDB.SELECT_SALARY);
           Cargo c;
            
           while (rs.next()) {
              if(rs.getFloat("salario") >= value) {    
              
                c = new Cargo();
                c.setNombre(rs.getString("nombre"));
                c.setGrupoEscala(rs.getString("grupoescala"));
                c.setSalario(rs.getFloat("salario"));
                c.setCalificacion(rs.getString("calificacion"));
                
                cargos.add(c);
            }
         }  
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return cargos;
    }  
    
   public static List<Cargo> getSalaryLower(float value) throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<Cargo> cargos= new ArrayList<Cargo>(); 
      try {
           conn = UtilDB.getInstance().getConnection();
           stmt = (Statement) conn.createStatement();
           rs = stmt.executeQuery(ConsultaDB.SELECT_SALARY);
           Cargo c;
            while (rs.next()) {
              if(rs.getFloat("salario") <= value) {  
                c = new Cargo();
                c.setNombre(rs.getString("nombre"));
                c.setGrupoEscala(rs.getString("grupoescala"));
                c.setSalario(rs.getFloat("salario"));
                c.setCalificacion(rs.getString("calificacion"));
                
                cargos.add(c);
            }
         }  
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return cargos;
    }  
   
     public static void deleteCARGO (int id) throws SQLException {
        
         Connection conn = null;
         PreparedStatement pstmt = null;
         try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.DELETE_CARGO);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
         } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
         } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
     }   
        
        // Gestionar Unidad Organizativa
        
         public static  void addUO(UnidadOrganizativa uo) throws SQLException, Exception {
      
          Connection conn = null;
          PreparedStatement pstmt = null;
             try {
                   if (!existUO(uo.getNombre())) {
                   conn = UtilDB.getInstance().getConnection();
                   pstmt = conn.prepareStatement(ConsultaDB.INSERT_UO);
                  
                   pstmt.setString(1, uo.getNombre());
                   pstmt.setInt(2, uo.getNivel());
                   pstmt.setString(3, uo.getClasificacion());
                 
                   pstmt.executeUpdate();
                   } else {    
                      throw new Exception("Ya existe la Unidad Organizativa: " + uo.getNombre());
                     } 
                   
            } catch (SQLException sqle) {
                 Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
              throw sqle;
            } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
            }
     }
     
         
        private static int findUO(String nombre) throws SQLException{
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int id;
        try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_UO);
            pstmt.setString(1, nombre);
            
            rs = pstmt.executeQuery();
            rs.next();
            id = rs.getInt("identificadoruo");
                
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return id;
        
        }
         
        private static boolean existUO(String nombre) throws SQLException {
        boolean found = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_UO);
            pstmt.setString(1, nombre);
            
            rs = pstmt.executeQuery();
            if (rs.next()) {
                found = true;
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return found;
      }       
         
        public static void updateUO(UnidadOrganizativa uo, int id) throws SQLException {
        Connection conn = null;
       
        try {
                 conn = UtilDB.getInstance().getConnection();
                 Statement stmt= conn.createStatement();
                 
                 String UPDATE_UO = "UPDATE unidadorganizativa SET "
                         + " nombre='" + uo.getNombre() + "',"
                         + " nivel='" +uo.getNivel() + "',"
                         + " clasificacion='" + uo.getClasificacion() + "'"
                         + " WHERE identificadoruo='"+ id + "';";
                stmt.executeUpdate(UPDATE_UO);
        }catch (SQLException sqle){
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(conn);
        }
    }
        
         public static UnidadOrganizativa getUO(int Id) throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UnidadOrganizativa uo = new UnidadOrganizativa();
        try {

            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.SELECT_UO);
            pstmt.setInt(1, Id);
            rs = pstmt.executeQuery();

             if (rs.next()) {
                uo.setIdentificadorUO(rs.getInt("identificadoruo"));
                uo.setNombre(rs.getString("nombre"));
                uo.setNivel(rs.getInt("nivel"));
                uo.setClasificacion(rs.getString("clasificacion"));

             }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return uo;
     }
         
         public static void deleteUO (int id) throws SQLException {
        
         Connection conn = null;
         PreparedStatement pstmt = null;
         try {
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.DELETE_UO);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
         } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
         } finally {
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
     }
         
      public static List<UnidadOrganizativa> getAllUO() throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<UnidadOrganizativa> unidadeso= new ArrayList<UnidadOrganizativa>(); 
      try {
            conn = UtilDB.getInstance().getConnection();
            stmt = (Statement) conn.createStatement();
            rs = stmt.executeQuery(ConsultaDB.SELECT_ALL_UO);
            UnidadOrganizativa uo = null;
            while (rs.next()) {
                uo = new UnidadOrganizativa();
                uo.setIdentificadorUO(rs.getInt("identificadoruo"));
                uo.setNombre(rs.getString("nombre"));
                uo.setClasificacion(rs.getString("clasificacion"));
                uo.setNivel(rs.getInt("nivel"));
                
                unidadeso.add(uo);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(stmt);
            UtilDB.close(conn);
        }
        return unidadeso;
    }
       
     public static List<Cargo> getPlantilla(String nombre) throws SQLException {
      Connection conn = null;
      PreparedStatement pstmt = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<Cargo> cargos= new ArrayList<Cargo>(); 
      try {
          
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_UO);
            pstmt.setString(1, nombre);
            rs = pstmt.executeQuery();
            rs.next();
            int id = rs.getInt("identificadoruo");
                
            //stmt = (Statement) conn.createStatement();
            //rs = stmt.executeQuery(ConsultaDB.SELECT_ALL_UO);
            pstmt = conn.prepareStatement(ConsultaDB.SELECT_PLANTILLA);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            Cargo c;
            while (rs.next()) {
                
                c = new Cargo();
                c.setNombre(rs.getString("nombre"));
                c.setGrupoEscala(rs.getString("grupoescala"));
                c.setCalificacion(rs.getString("calificacion"));
                c.setPlazasP(rs.getInt("plazasp"));
                c.setPlazasA(rs.getInt("plazasa"));
                c.setPlazasC(rs.getInt("plazasc"));
                c.setIdco(rs.getInt("identificadorco"));
                
                cargos.add(c);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return cargos;
    }  
   
      public static List<Cargo> getVacancy(String nombre) throws SQLException {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      List<Cargo> cargos= new ArrayList<Cargo>(); 
      try {
          
            conn = UtilDB.getInstance().getConnection();
            pstmt = conn.prepareStatement(ConsultaDB.FIND_UO);
            pstmt.setString(1, nombre);
            rs = pstmt.executeQuery();
            rs.next();
            int id = rs.getInt("identificadoruo");
                
            pstmt = conn.prepareStatement(ConsultaDB.SELECT_VACANCY);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            Cargo c;
            while (rs.next()) {
                
                c = new Cargo();
                c.setNombre(rs.getString("nombre"));
                c.setGrupoEscala(rs.getString("grupoescala"));
                c.setSalario(rs.getFloat("salario"));
                c.setCalificacion(rs.getString("calificacion"));
                c.setPlazasA(rs.getInt("plazasa"));
                c.setPlazasC(rs.getInt("plazasc"));
                
                cargos.add(c);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(CapitalHumano.class.getName()).log(Level.SEVERE, null, sqle);
            throw sqle;
        } finally {
            UtilDB.close(rs);
            UtilDB.close(pstmt);
            UtilDB.close(conn);
        }
        return cargos;
    }  

}

