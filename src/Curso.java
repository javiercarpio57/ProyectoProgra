package AlumnoMaestro;

<<<<<<< HEAD:src/AlumnoMaestro/Curso.java
=======
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
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f:src/Cursos.java

package AlumnoMaestro;

import java.io.Serializable;
import java.text.SimpleDateFormat;
<<<<<<< HEAD:src/AlumnoMaestro/Curso.java
=======
import java.util.ArrayList;
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f:src/Cursos.java
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author javie
 */
@Entity
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String curso;
    private String maestro;
    private String salon;
    private String fecha;    
<<<<<<< HEAD:src/AlumnoMaestro/Curso.java
    private String alumno;    
=======
<<<<<<< HEAD
    private Date myDate = new Date();
    
    public Cursos(){
       
        
    }
    
    public Cursos(String cursito, String Maestro, String Salon){
=======
    private String alumno;
    private Date myDate = new Date();
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f:src/Cursos.java
    
    /**
     * Metodo que nos permite crear un objeto de este tipo para relacionar esta clase.
     */
    public Curso(){
        
    }
    
    /**
     * Metodo que nos permite crear los objetos de este tipo para las colecciones.
     * @param cursito Contiene el nombre del curso.
     * @param Maestro Contiene el nombre del maestro.
     * @param Salon Contiene el salon donde se imparte la clase.
     * @param nom Contiene el nombre del alumno.
     */
<<<<<<< HEAD:src/AlumnoMaestro/Curso.java
    public Curso(String cursito, String Maestro, String Salon, String nom){
=======
    public Cursos(String cursito, String Maestro, String Salon, String nom){
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
>>>>>>> d2008b9f5b613cbc902d12597c619e5cb1e7376f:src/Cursos.java
        curso = cursito;
        maestro = Maestro;
        salon = Salon;
        Date myDate = new Date();
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
    
    public String getFecha(){
        return fecha;
    }
    
    public String getSalon(){
        return salon;
    }
    
    /**
     * Metodo que nos permite colocer el nombre del alumno
     * @return alumno
     */
    public String getAlumno(){
        return alumno;
    }
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
