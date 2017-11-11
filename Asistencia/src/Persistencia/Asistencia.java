
package Persistencia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author javie
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

    public Asistencia(String curso, String alumno, String maestro, String fecha) {
        this.curso = curso;
        this.alumno = alumno;
        this.maestro = maestro;
        this.fecha = fecha;
    }
    
    public Asistencia(){
        
    }

    public String getCurso() {
        return curso;
    }

    public String getAlumno() {
        return alumno;
    }

    public String getMaestro() {
        return maestro;
    }

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
