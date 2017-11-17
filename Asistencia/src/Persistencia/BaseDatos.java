package Persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 15.11.2017
 */
public class BaseDatos {
    
    EntityManagerFactory emf;  
    EntityManager em; 
    
    /**
     * Constructor que nos permite conectar con la base de datos.
     */
    public BaseDatos(){
        emf = javax.persistence.Persistence.createEntityManagerFactory("AsistenciaPU");
        em = emf.createEntityManager();
    }
    
    /**
     * Metodo que permite cerrar la base de datos.
     */
    public void cerrarBD(){
        em.close();
        emf.close();
    }
    
    /**
     * Metodo que nos permite agregar un maestro a la base de datos.
     * @param curso Nombre del curso.
     * @param n Nombre del maestro.
     * @param a Apellido del maestro.
     * @param car Carnet del maestro.
     * @param contra Contrasena del maestro.
     */
    public void agregarMaestro(String curso, String n, String a, int car, String contra){
        Maestro maestro = new Maestro(curso, n, a, car, contra);
        
        em.getTransaction().begin();
        em.persist(maestro);
        em.getTransaction().commit();
    }
    
    /**
     * Metodo que nos permite agregar un estudiante a la base de datos.
     * @param correo Correo del estudiante.
     * @param n Nombre del estudiante.
     * @param a Apellido del estudiante.
     * @param car Carnet del estudiante.
     * @param contra Contrasena del estudiante.
     * @param pregunta Pregunta de seguridad del estudiante.
     * @param respuesta Respuesta a la respuesta del estudiante.
     * @return Estudiante
     */
    public Estudiante agregarEstudiante(String correo, String n, String a, int car, String contra, String pregunta, String respuesta){
        Estudiante e = new Estudiante(correo, n, a, car, contra, pregunta, respuesta);
        
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        
        return e;
    }
    
    /**
     * Metodo que nos permite agregar un curso a la base de datos.
     * @param maestro Nombre del maestro.
     * @param nombre Nombre del curso.
     * @param salon Salon donde se impartio el curso.
     * @param alumno Nombre del alumno.
     * @param fecha Fecha que se impartio el curso.
     * @return Curso
     */
    public Curso agregarCurso(String maestro, String nombre, String salon, String alumno, String fecha){
        Curso curso = new Curso(maestro, nombre, salon, alumno, fecha);
        
        em.getTransaction().begin();
        em.persist(curso);
        em.getTransaction().commit();
        
        return curso;
    }
    
    /**
     * Metodo que nos permite agregar una asistencia a la base de datos.
     * @param curso Nombre del curso.
     * @param alumno Nombre del alumno.
     * @param maestro Nombre del maestro.
     * @param fecha Fecha que se impartio el curso.
     * @return asistencia
     */
    public Asistencia agregarAsistencia(String curso, String alumno, String maestro, String fecha){
        Asistencia asistencia = new Asistencia(curso, alumno, maestro, fecha);
        
        em.getTransaction().begin();
        em.persist(asistencia);
        em.getTransaction().commit();
        
        return asistencia;
    }
    
    /**
     * Metodo que nos permite recurperar todas las personas de la base de datos.
     * @return Lista de personas
     */
    public List<Persona> recogerPersona(){
        Query q = em.createQuery("select d from Persona d");
        List<Persona> persona = q.getResultList();
        
        return persona;
    }
    
    /**
     * Metodo que nos permite recuperar todas las asistencias de la base de datos.
     * @return Lista de asistencias.
     */
    public List<Asistencia> recogerAsistencia(){
        Query q = em.createQuery("select d from Asistencia d");
        List<Asistencia> asistencia = q.getResultList();
        
        return asistencia;
    }
    
    /**
     * Metodo que nos permite recuperar todos los cursos de la base de datos.
     * @return Lista de cursos.
     */
    public List<Curso> recogerCurso(){
        Query q = em.createQuery("select d from Curso d");
        List<Curso> curso = q.getResultList();
        
        return curso;
    }
    
    
}
