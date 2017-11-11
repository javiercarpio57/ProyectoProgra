package Persistencia;

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
    
    public BaseDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("AsistenciaPU");
        em = emf.createEntityManager();
    }
    
    public void cerrarBD(){
        em.close();
        emf.close();
    }
    
    public void agregarMaestro(String curso, String n, String a, int car, String contra){
        Maestro maestro = new Maestro(curso, n, a, car, contra);
        
        em.getTransaction().begin();
        em.persist(maestro);
        em.getTransaction().commit();
    }
    
    public Estudiante agregarEstudiante(String correo, String n, String a, int car, String contra, String pregunta, String respuesta){
        Estudiante e = new Estudiante(correo, n, a, car, contra, pregunta, respuesta);
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
        return e;
    }
    
    public Curso agregarCurso(String maestro, String nombre, String salon, String alumno, String fecha){
        Curso curso = new Curso(maestro, nombre, salon, alumno, fecha);
        
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
        
        return curso;
    }
    
    public Asistencia agregarAsistencia(String curso, String alumno, String maestro, String fecha){
        Asistencia asistencia = new Asistencia(curso, alumno, maestro, fecha);
        
        em.getTransaction().begin();
        em.persist(asistencia);
        em.getTransaction().commit();
        
        return asistencia;
    }
    
    public List<Persona> recogerPersona(){
        Query q = em.createQuery("select d from Persona d");
        List<Persona> persona = q.getResultList();
        
        return persona;
    }
    
    public List<Asistencia> recogerAsistencia(){
        Query q = em.createQuery("select d from Asistencia d");
        List<Asistencia> asistencia = q.getResultList();
        
        return asistencia;
    }
    
    public List<Curso> recogerCurso(){
        Query q = em.createQuery("select d from Curso d");
        List<Curso> curso = q.getResultList();
        
        return curso;
    }
    
    
}
