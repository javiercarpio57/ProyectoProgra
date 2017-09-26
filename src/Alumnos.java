/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class Alumnos {
    private String nombre;
    private String apellido;
    private String contrasena;
    private String carnet;
    
    public Alumnos(String Nombre, String Apellido, String Carnet, String Contra){
        nombre = Nombre;
        apellido = Apellido;
        carnet = Carnet;
        contrasena = Contra;
        
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getCarnet(){
        return carnet;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public String toStringNAC() {
        String cadena;
        cadena = (nombre + " " + apellido + " - " + carnet);
        return cadena;
    }
    
    public String toStringNA(){
        String cadena;
        cadena = (nombre + " " + apellido);
        
        return cadena;
    }
    
    
}
