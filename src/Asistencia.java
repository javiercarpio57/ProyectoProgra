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
    private String maestro;
    private String fecha;
    
    public Asistencia(String Nombre, String Curso, String Maestro, String Fecha){
        nombre = Nombre;
        curso = Curso;
        maestro = Maestro;
        fecha = Fecha;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public String getMaestro(){
        return maestro;
    }
    
    public String getFecha(){
        return maestro;
    }

    @Override
    public String toString() {
        return "ASISTENCIA: " + "Nombre: " + nombre + ", curso: " + curso + ", maestro: " + maestro + ", fecha: " + fecha;
    }
    
    
}
