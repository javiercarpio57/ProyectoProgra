/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 29.09.2017
 */

public class Asistencia {
    
    private String nombre;
    private String curso;
    private String maestro;
    private String fecha;
    
    /**
     * Metodo que nos permite crear un objeto de este tipo para relacionarlo con la clase.
     */
    public Asistencia()
    {}
    
    /**
     * Metodo que nos permite crear los objetos de las clase Asistencia.
     * @param Nombre Contiene el nombre del alumno que asistio.
     * @param Curso Contiene el nombre del curso que asistio.
     * @param Maestro Contiene el nombre del maestro que imparte el curso.
     * @param Fecha Contiene la fecha del dia asistido.
     */
    public Asistencia(String Nombre, String Curso, String Maestro, String Fecha){
        nombre = Nombre;
        curso = Curso;
        maestro = Maestro;
        fecha = Fecha;
        
    }
    
    /**
     * Metodo que nos permite conocer el nombre del alumno.
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del curso.
     * @return curso
     */
    public String getCurso(){
        return curso;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del maestro.
     * @return maestro
     */
    public String getMaestro(){
        return maestro;
    }
    
    /**
     * Metodo que nos permite conocer la fecha.
     * @return fecha
     */
    public String getFecha(){
        return fecha;
    }

    /**
     * Metodo que nos devuelve los datos concatenados para mostrar al alumno.
     * @return cadena
     */
    @Override
    public String toString() {
        String cadena = "Nombre: " + nombre + ", curso: " + curso + ", maestro: " + maestro + ", fecha: " + fecha;
        return cadena;
    }
    
    /**
     * Metodo que nos devuelve los datos concatenados para mostrar al maestro.
     * @return 
     */
    public String toString2() 
    {
        String cadena = "Nombre: " + nombre + ", curso: " + curso + ", fecha: " + fecha;
        return cadena;
    }
    
}
