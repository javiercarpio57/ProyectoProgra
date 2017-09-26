/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class Asistencia {
    
    private String nombre;
    private String curso;
    
    public Asistencia(String Nombre, String Curso){
        nombre = Nombre;
        curso = Curso;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCurso(){
        return curso;
    }
}
