/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;


public class CategoriaOcuapcional {
    
    int id;
    String Nombre;
    String Clasificacion;
    String Abreviatura;

    public CategoriaOcuapcional(){}
    public CategoriaOcuapcional(int id, String Nombre, String Clasificacion, String Abreviatura) {
        
        this.id = id;
        this.Nombre = Nombre;
        this.Clasificacion = Clasificacion;
        this.Abreviatura=Abreviatura;
        
    }

    public String getAbreviatura() {
        return Abreviatura;
    }

    public void setAbreviatura(String Abreviatura) {
        this.Abreviatura = Abreviatura;
    }


    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
