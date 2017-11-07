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
=======
/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 29.09.2017
 */

>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
public class Alumnos {
    private String nombre;
    private String apellido;
    private String contrasena;
    private String carnet;
    
<<<<<<< HEAD
=======
    /**
     * Metodo que nos permite crear los objetos de tipo Alumno.
     * @param Nombre Contiene el nombre del alumno. 
     * @param Apellido Contiene el apellido del alumno.
     * @param Carnet Contiene el numero de carnet.
     * @param Contra Contiene la contrasena ingresada por el usuario.
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public Alumnos(String Nombre, String Apellido, String Carnet, String Contra){
        nombre = Nombre;
        apellido = Apellido;
        carnet = Carnet;
        contrasena = Contra;
<<<<<<< HEAD
        
        
    }
    
=======
    }
    
    /**
     * Metodo que nos permite conocer el nombre del alumno.
     * @return nombre
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public String getNombre(){
        return nombre;
    }
    
<<<<<<< HEAD
=======
    /**
     * Metodo que nos permite conocer el apellido del alumno.
     * @return apellido
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public String getApellido(){
        return apellido;
    }
    
<<<<<<< HEAD
=======
    /**
     * Metodo que nos permite conocer el numero de carnet del alumno.
     * @return carnet
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public String getCarnet(){
        return carnet;
    }
    
<<<<<<< HEAD
=======
    /**
     * Metodo que nos permite conocer la contrasena del alumno.
     * @return contrasena
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public String getContrasena(){
        return contrasena;
    }
    
<<<<<<< HEAD
    public String toStringNAC() {
        String cadena;
        cadena = (nombre + " " + apellido + " - " + carnet);
        return cadena;
    }
    
=======
    /**
     * Metodo que concatena la informacion del alumno, nombre, apellido y carnet
     * @return cadena
     */
    public String toStringNAC() {
        String cadena;
        cadena = "ALUMNO: " + (nombre + " " + apellido + " - " + carnet);
        return cadena;
    }
    
    /**
     * Metodo que nos permite conocer el nombre y el apellido
     * @return cadena
     */
>>>>>>> 65e049850fce1cb7d392717e388b1a94b6407f80
    public String toStringNA(){
        String cadena;
        cadena = (nombre + " " + apellido);
        
        return cadena;
    }
    
    
}
