/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 29.09.2017
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
        curso = cursito;
        maestro = Maestro;
        salon = Salon;
        fecha=new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        alumno = nom;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del curso.
     * @return curso
     */
    public String getCurso(){
        return curso;
    }

    /**
     * Metodo que nos permite indicar el nombre del curso, salon y fecha.
     * @return cadena
     */
    @Override
    public String toString() {
        String cadena;
        
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
    
}
