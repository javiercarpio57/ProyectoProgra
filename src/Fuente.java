/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Fuente {
    public String nombre;
    public String apellido;
    public String carnet;
    public String correo;
    
    public Fuente(){
        
        
        
    }
    
    public void getDatos(String nom, String ap, String car, String cor){
            nombre = nom;
            apellido = ap;
            carnet = car;
            correo = cor;
            
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
    
    public String getCorreo(){
        
        return correo;
    }
    
    public void registro(String clase)
    {
        Ver_Registro c = new Ver_Registro();
        c.j=clase;
    
    }
    
    
    
}
