
package Persistencia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @author Oliver Mazariegos
 * @version 15.11.2017
 */
@Entity
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String maestro;
    private String nombre;
    private String salon;
    private String alumno;
    private String fecha;

    /**
     * Constructor que nos permite crear un objeto de curso.
     * @param maestro Nombre del maestro.
     * @param nombre Nombre del curso.
     * @param salon Salon del curso.
     * @param alumno Nombre del alumno.
     * @param fecha Fecha donde se impartio el curso.
     */
    public Curso(String maestro, String nombre, String salon, String alumno, String fecha) {
        this.maestro = maestro;
        this.nombre = nombre;
        this.salon = salon;
        this.alumno = alumno;
        this.fecha = fecha;
    }
    
    /**
     * Constructor que conecta con la base de datos.
     */
    public Curso(){
        
    }

    /**
     * Metodo que nos permite conocer el nombre del maestro.
     * @return maestro
     */
    public String getMaestro() {
        return maestro;
    }

    /**
     * Metodo que nos permite conocer el nombre del curso.
     * @return nombre del curso
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que nos permite conocer el lugar.
     * @return salon
     */
    public String getSalon() {
        return salon;
    }

    /**
     * Metodo que nos permite conocer el nombre del alumno.
     * @return alumno
     */
    public String getAlumno() {
        return alumno;
    }

    /**
     * Metodo que nos permite conocer la fecha que asistio la persona.
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

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

    @Override
    public String toString() {
        return "Persistencia.Curso[ id=" + id + " ]";
    }
    
}
