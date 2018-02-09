/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_a_Datos;

public class ConsultaDB {
    
    //Usuario
    
         public static String INSERT_USUARIO = "INSERT INTO usuario ( nombre, apellidos, nombreusuario, contraseña, rol) VALUES ( ?, ?, ?, ?,?);";
         public static String FIND_USUARIO = "SELECT idusuario FROM usuario WHERE nombre = ? AND apellidos = ?;";
         public static String SELECT_ALL_USUARIO = "SELECT idusuario, nombre, apellidos, nombreusuario, contraseña,rol FROM usuario;";
         public static String DELETE_USUARIO = "DELETE FROM usuario WHERE idusuario = ?;";
        // public static String UPDATE_USUARIO = "UPDATE usuario SET nombre = 'mmmmmm', apellidos = 'jjjj', nombreusuario = 'ghgh', contraseña = 'ghhgh', rol = 'ghgh' WHERE idusuario = '21';";
         public static String SELECT_USUARIO = "SELECT * FROM usuario WHERE idusuario = ?;";
         public static String AUTHENTICATE= "SELECT rol FROM usuario WHERE nombreusuario = ? AND contraseña = ?;";
  
    //CO     
         public static String INSERT_CO = "INSERT INTO categoriaocupacional ( nombre, clasificacion, abreviatura) VALUES ( ?, ?, ?);";
         public static String FIND_CO = "SELECT identificadorco FROM categoriaocupacional WHERE nombre = ?;";
         public static String SELECT_ALL_CO = "SELECT identificadorco, nombre, clasificacion, abreviatura FROM categoriaocupacional;";
         public static String DELETE_CO = "DELETE FROM categoriaocupacional WHERE identificadorco = ?;";
         public static String UPDATE_CO = "UPDATE categoriaocupacional SET nombre = ?, aclasificacion = ?, abreviatura = ? WHERE identificadorco = ?;";
         public static String SELECT_CO = "SELECT * FROM categoriaocupacional WHERE identificadorco = ?;";
         
     //Cargo    
         public static String INSERT_CARGO = "INSERT INTO cargo ( nombre, grupoescala, salario, resolucion, calificacion, tipo, identificadoruo,identificadorco ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";
         public static String FIND_CARGO = "SELECT identificadorcargo FROM cargo WHERE LOWER(identificadorcargo) = ?;";
         public static String SELECT_ALL_CARGO = "SELECT identificadorcargo ,nombre, grupoescala, salario, resolucion, calificacion, tipo, identificadoruo, identificadorco, plazasp, plazasa, plazasc FROM cargo;";
         public static String DELETE_CARGO = "DELETE FROM cargo WHERE identificadorcargo = ?;";
         public static String UPDATE_CARGO = "UPDATE cargo SET nombre = ?,grupoescala =?, salario =?, resolucion =?, calificacion=?, tipo=? WHERE identificadorcargo = ?;";
         public static String SELECT_CARGO = "SELECT * FROM cargo WHERE identificadorcargo = ?;";
         public static String SELECT_SALARY= "SELECT nombre, grupoescala, salario, calificacion FROM cargo;";
      //UO   
         public static String INSERT_UO = "INSERT INTO unidadorganizativa ( nombre, nivel, clasificacion) VALUES ( ?, ?, ?);";
         public static String FIND_UO = "SELECT identificadoruo FROM  unidadorganizativa WHERE nombre = ?;";
         public static String SELECT_ALL_UO = "SELECT identificadoruo ,nombre, nivel, clasificacion FROM unidadorganizativa;";
         public static String DELETE_UO = "DELETE FROM unidadorganizativa WHERE identificadoruo = ?;";
         public static String UPDATE_UO = "UPDATE unidadorganizativa SET nombre = ?,nivel =?, clasificacion =? WHERE identificadoruo = ?;";
         public static String SELECT_UO = "SELECT * FROM unidadorganizativa WHERE identificadoruo = ?;";
         
      //Plantilla   
         public static String SELECT_PLANTILLA = "SELECT cargo.nombre, cargo.grupoescala, cargo.calificacion, cargo.plazasp, cargo.plazasa, cargo.plazasc, cargo.identificadorco FROM cargo INNER JOIN unidadorganizativa ON cargo.identificadoruo = unidadorganizativa.identificadoruo WHERE cargo.identificadoruo = ?;";
         public static String SELECT_VACANCY = "SELECT cargo.nombre, cargo.grupoescala, cargo.salario, cargo.calificacion, cargo.plazasa, cargo.plazasc FROM cargo INNER JOIN unidadorganizativa ON cargo.identificadoruo = unidadorganizativa.identificadoruo WHERE cargo.identificadoruo = ?; ";

}