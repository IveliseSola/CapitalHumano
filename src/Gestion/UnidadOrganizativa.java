/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;


public class UnidadOrganizativa {
    
    int IdentificadorUO;
    String Nombre;
    int Nivel;
    String Clasificacion;

    public UnidadOrganizativa(){};
    public UnidadOrganizativa(int IdentificadorUO, String Nombre, int Nivel, String Clasificacion) {
        this.IdentificadorUO = IdentificadorUO;
        this.Nombre = Nombre;
        this.Nivel = Nivel;
        this.Clasificacion = Clasificacion;
    }

    
    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public int getIdentificadorUO() {
        return IdentificadorUO;
    }

    public void setIdentificadorUO(int IdentificadorUO) {
        this.IdentificadorUO = IdentificadorUO;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
