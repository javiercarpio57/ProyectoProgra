<<<<<<< HEAD
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
=======
/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 29.09.2017
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
import java.util.Date;

public class Cursos {
    private String curso;
    private String maestro;
    private String salon;
    private String fecha;    
<<<<<<< HEAD
    private Date myDate = new Date();
    
    public Cursos(){
       
        
    }
    
    public Cursos(String cursito, String Maestro, String Salon){
=======
    private String alumno;
    private Date myDate = new Date();
    
    /**
     * Metodo que nos permite crear un objeto de este tipo para relacionar esta clase.
     */
    public Cursos(){
        
    }
    
    /**
     * Metodo que nos permite crear los objetos de este tipo para las colecciones.
     * @param cursito Contiene el nombre del curso.
     * @param Maestro Contiene el nombre del maestro.
     * @param Salon Contiene el salon donde se imparte la clase.
     * @param nom Contiene el nombre del alumno.
     */
    public Cursos(String cursito, String Maestro, String Salon, String nom){
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
        curso = cursito;
        maestro = Maestro;
        salon = Salon;
        fecha=new SimpleDateFormat("dd-MM-yyyy").format(myDate);
<<<<<<< HEAD
        
    }
    
=======
        alumno = nom;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del curso.
     * @return curso
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public String getCurso(){
        return curso;
    }

<<<<<<< HEAD
=======
    /**
     * Metodo que nos permite indicar el nombre del curso, salon y fecha.
     * @return cadena
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    @Override
    public String toString() {
        String cadena;
        
<<<<<<< HEAD
        cadena = (curso + " " + salon+" "+"<html><b><u> Fecha de asistencia "+fecha+"</u></b>");
        return cadena;
    }
    
    
=======
        cadena = "CURSOS: " + (curso + " " + salon+" "+ fecha);
        return cadena;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del maestro.
     * @return maestro
     */
    public String getMaestro(){
        return maestro;
    }
    
    /**
     * Metodo que nos permite colocer el nombre del alumno
     * @return alumno
     */
    public String getAlumno(){
        return alumno;
    }
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    
}
