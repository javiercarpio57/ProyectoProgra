
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

    public Curso(String maestro, String nombre, String salon, String alumno, String fecha) {
        this.maestro = maestro;
        this.nombre = nombre;
        this.salon = salon;
        this.alumno = alumno;
        this.fecha = fecha;
    }
    
    public Curso(){
        
    }

    public String getMaestro() {
        return maestro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSalon() {
        return salon;
    }

    public String getAlumno() {
        return alumno;
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
