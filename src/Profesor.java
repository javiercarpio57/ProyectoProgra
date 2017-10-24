
import java.util.ArrayList;

/**
 *
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 29.09.2017
 */
public class Profesor 
{
    
    private String nombre;
    private String contrasena;
    private String carnet;
    private String curso;
    
    /**
     * Metodo que nos permite crear un objeto y relacionarlo con esta clase.
     */
    public Profesor()
    {}
    
    /**
     * Metodo que crea los objetos de Profesor.
     * @param nombre Contiene el nombre del maestro.
     * @param contrasena Contiene el password del maestro.
     * @param carnet Contiene el numero de carnet del maestro.
     * @param curso Contiene el nombre del curso impartido.
     */
    public Profesor(String nombre, String contrasena, String carnet, String curso)
    {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.carnet = carnet;
        this.curso = curso;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del maestro.
     * @return nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Metodo que nos permite conocer el password del maestro.
     * @return contrasena
     */
    public String getContrasena()
    {
        return contrasena;
    }
    
    /**
     * Metodo que nos permite conocer el numero de carnet del maestro.
     * @return carnet
     */
    public String getCarnet()
    {
        return carnet;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del curso impartido por el maestro.
     * @return curso
     */
    public String getCurso()
    {
        return curso;
    }
    
    /**
     * Metodo que crea todos los profesores que utilizaran este programa.
     * @param x ArrayList que contiene los datos de los profesores
     * @return x
     */
    public ArrayList<Profesor> crearProfesor(ArrayList<Profesor> x)
    {
        Profesor poo= new Profesor( "Douglas Barrios","contrasena","17","Programacion Orientada a Objetos");
        x.add(poo);
        Profesor calc= new Profesor( "Ronald Curtiss","contrasena","18","Calculo 1");
        x.add(calc);
        Profesor fis= new Profesor( "Magda Moscoso","contrasena","19","Fisica 1");
        x.add(fis);
        
        return x;
    }
    
    /**
     * Metodo que verifica si el usuario y contrasena ingresados son correctos.
     * @param usuario Contiene el usuario ingresado.
     * @param contra Contiene la contrasena ingresada
     * @param x Contiene la lista de los profesores con su informacion.
     * @return respuesta
     */
    public boolean IngresarSesion(String usuario, String contra,ArrayList<Profesor> x)
        {
            boolean respuesta=false;
            for (Profesor i:x) 
            {
                if (i.getCarnet().equals(usuario)) 
                {
                    if (i.getContrasena().equals(contra)) 
                    {
                        respuesta=true;
                        VistaProfesor.curso = i.getCurso();
                    }
                }
            }
            return respuesta;
        }
    
    
    /**
     * Metodo que muestra el contenido de las asistencias.
     * @param x Contiene la lista de los maestros ingresados.
     * @param curso Contiene el nombre del curso impartido.
     * @return concatenar.
     */
    public String RegistroGeneral(ArrayList<Asistencia> x,String curso )
        {
            String concatenar="";
            
            if (x.size()==0) 
            {
                //System.out.println("Esta sin nada");
                
            }
            
            for(Asistencia i:x)
            {
                if (i.getCurso().equals(curso)) 
                {
                    concatenar+=i.toString2()+"\n";
                    
                }
            
            }
            
            
            
            return concatenar;
        
        }
}
