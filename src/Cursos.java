/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cursos {
    private String curso;
    private String maestro;
    private String salon;
    private String fecha;    
    private Date myDate = new Date();
    
    public Cursos(){
        
    }
    
    public Cursos(String cursito, String Maestro, String Salon){
        curso = cursito;
        maestro = Maestro;
        salon = Salon;
        fecha=new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        
    }
    
    public String getCurso(){
        return curso;
    }

    @Override
    public String toString() {
        String cadena;
        
        cadena = (curso + " " + salon+" "+"<html><b><u> Fecha de asistencia "+fecha+"</u></b>");
        return cadena;
    }
    
    public ArrayList crearCursos(ArrayList<Cursos> curso){
        Cursos cur = null;
        
        cur = new Cursos("Programacion Orientada a Objetos", "Douglas Barrios", "A - 302");
        curso.add(cur);
        
        cur = new Cursos("Calculo 1", "Ronald Curtiss", "A - 109");
        curso.add(cur);
        
        cur = new Cursos("Fisica 1", "Magda Moscoso", "A - 202");
        curso.add(cur);
        
        
        return curso;
        
        
    }
    
}
