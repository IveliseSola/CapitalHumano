/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

/**
 *

 */
public class Usuario {
    int id;
    String nombre;
    String apellido;
    String nombre_usuario;
    String contrasenna;
    String tipousuario;
    //public enum tipo_usuario {Especialista, Tecnico,Administrador};
    
    //Constructor
    public Usuario(){}
    public Usuario(int id, String nombre, String apellido, String nombreusuario, String contrasena, String tipou)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.contrasenna=contrasena;
        this.nombre_usuario=nombreusuario;
        this.tipousuario=tipou;
       
  
        
    }
   
    //metodos set y get
    
    public  int Getid() {
     return id;}
    public void SetId(int id) {
     this.id = id;}
    
     public  String Getnombre() {
     return nombre;}
    public void Setnombre(String nomb) {
     this.nombre = nomb;}
    
     public  String Getapellido() {
     return apellido;}
    public void Setapellido(String apell) {
     this.apellido = apell;}
    
    public  String Getnombu() {
     return nombre_usuario;}
    public void Setnombu(String nombu) {
     this.nombre_usuario = nombu;}
    
     public  String Getcontrasena() {
     return contrasenna;}
    public void Setcontrasena(String contrasena) {
     this.contrasenna = contrasena;}
    
     public String Gettipou() {
     return tipousuario;}
    public void Settipou(String tipou) {
     this.tipousuario = tipou;}
}
