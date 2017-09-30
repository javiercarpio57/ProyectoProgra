/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 29.09.2017
 */

public class Alumnos {
    private String nombre;
    private String apellido;
    private String contrasena;
    private String carnet;
    
    /**
     * Metodo que nos permite crear los objetos de tipo Alumno.
     * @param Nombre Contiene el nombre del alumno. 
     * @param Apellido Contiene el apellido del alumno.
     * @param Carnet Contiene el numero de carnet.
     * @param Contra Contiene la contrasena ingresada por el usuario.
     */
    public Alumnos(String Nombre, String Apellido, String Carnet, String Contra){
        nombre = Nombre;
        apellido = Apellido;
        carnet = Carnet;
        contrasena = Contra;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del alumno.
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que nos permite conocer el apellido del alumno.
     * @return apellido
     */
    public String getApellido(){
        return apellido;
    }
    
    /**
     * Metodo que nos permite conocer el numero de carnet del alumno.
     * @return carnet
     */
    public String getCarnet(){
        return carnet;
    }
    
    /**
     * Metodo que nos permite conocer la contrasena del alumno.
     * @return contrasena
     */
    public String getContrasena(){
        return contrasena;
    }
    
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
    public String toStringNA(){
        String cadena;
        cadena = (nombre + " " + apellido);
        
        return cadena;
    }
    
    
}
