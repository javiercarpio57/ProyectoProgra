
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
public class Asistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String curso;
    private String alumno;
    private String maestro;
    private String fecha;

    /**
     * Constructor que nos permite crear el objeto Asistencia.
     * @param curso Nombre del curso al que se le tomo asistencia.
     * @param alumno Nombre del alumno que se tomo asistencia.
     * @param maestro Nombre del maestro que imparte el curso.
     * @param fecha Fecha en la que se asisttio a clase.
     */
    public Asistencia(String curso, String alumno, String maestro, String fecha) {
        this.curso = curso;
        this.alumno = alumno;
        this.maestro = maestro;
        this.fecha = fecha;
    }
    
    /**
     * Constructor que nos permite conectar con base de datos.
     */
    public Asistencia(){
        
    }

    /**
     * Metodo que nos permite conocer el nombre del curso que se asistio.
     * @return curso
     */
    public String getCurso() {
        return curso;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del alumno que tomo asistencia.
     * @return alumno
     */
    public String getAlumno() {
        return alumno;
    }

    /**
     * Metodo que nos permite conocer el nombre del maestro que impartia el curso.
     * @return maestro
     */
    public String getMaestro() {
        return maestro;
    }

    /**
     * Metodo que nos permite conocer la fecha que se asistio.
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
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Asistencia[ id=" + id + " ]";
    }
    
}
