
package AlumnoMaestro;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author javie
 */
public class BaseDatos {
    
    EntityManagerFactory emf;  
    EntityManager em; 
    
    /**
     * Constructor que crea la conexion a la Base de Datos.
     */
    public BaseDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("AlumnosMaestros");
        em = emf.createEntityManager();
    }
    
    public List<Persona> recuperarPersonas(){
        Query q = em.createQuery("select d from Persona d");
        List<Persona> persona = q.getResultList();
        
        return persona;
    }
    
    public List<Curso> recuperarCursos(){
        Query q = em.createQuery("select d from Curso d");
        List<Curso> curso = q.getResultList();
        
        return curso;
    }
    
    public List<Asistencia> recuperarAsistencia(){
        Query q = em.createQuery("select d from Asistencia d");
        List<Asistencia> asistencia = q.getResultList();
        
        return asistencia;
    }
    
    public Maestro agregarMaestro(String nombre, String apellido, int carnet, String contra, String curso){
        Maestro maestro = new Maestro(nombre, apellido, carnet, contra, curso);
        
        em.getTransaction().begin();
        em.persist(maestro);
        em.getTransaction().commit();
        
        return maestro;
    }
    
    public Alumno agregarAlumno(String nombre, String apellido, int carnet, String contra, String correo){
        Alumno alumno = new Alumno(nombre, apellido, carnet, contra, correo);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        return alumno;
    }
    
    public Asistencia agregarAsistencia(String Nombre, String Curso, String Maestro, String Fecha){
        Asistencia asistencia = new Asistencia(Nombre, Curso, Maestro, Fecha);
        
        em.getTransaction().begin();
        em.persist(asistencia);
        em.getTransaction().commit();
        
        return asistencia;
    }
    
    public Curso agregarCurso(String cursito, String Maestro, String Salon, String nom){
        Curso curso = new Curso(cursito, Maestro, Salon, nom);
        
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
        
        return curso;
    }
    
    
}
