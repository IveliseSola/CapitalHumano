/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;


public class Cargo {
    int id;
    String Nombre;
    String GrupoEscala;
    float Salario;
    String Resolucion;
    String Calificacion;
    String Tipo;
    int PlazasP;
    int PlazasA;
    int PlazasC;
    int idco;
    int iduo;
    

    public Cargo (){};
    public Cargo(int id, String Nombre, String GrupoEscala, float Salario, String Resolucion, String Calificacion, String Tipo, int PlazasP, int PlazasA, int PlazasC, int idco, int iduo) {
        this.id = id;
        this.Nombre = Nombre;
        this.GrupoEscala = GrupoEscala;
        this.Salario = Salario;
        this.Resolucion = Resolucion;
        this.Calificacion = Calificacion;
        this.Tipo = Tipo;
        this.PlazasP = PlazasP;
        this.PlazasA = PlazasA;
        this.PlazasC = PlazasC;
        this.idco=idco;
        this.iduo=iduo;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
    }

    public String getGrupoEscala() {
        return GrupoEscala;
    }

    public void setGrupoEscala(String GrupoEscala) {
        this.GrupoEscala = GrupoEscala;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPlazasA() {
        return PlazasA;
    }

    public void setPlazasA(int PlazasA) {
        this.PlazasA = PlazasA;
    }

    public int getPlazasC() {
        return PlazasC;
    }

    public void setPlazasC(int PlazasC) {
        this.PlazasC = PlazasC;
    }

    public int getPlazasP() {
        return PlazasP;
    }

    public void setPlazasP(int PlazasP) {
        this.PlazasP = PlazasP;
    }

    public String getResolucion() {
        return Resolucion;
    }

    public void setResolucion(String Resolusion) {
        this.Resolucion = Resolusion;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdco() {
        return idco;
    }

    public void setIdco(int idco) {
        this.idco = idco;
    }

    public int getIduo() {
        return iduo;
    }

    public void setIduo(int iduo) {
        this.iduo = iduo;
    }
    
    
    
}
