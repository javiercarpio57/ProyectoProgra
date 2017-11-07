
package AlumnoMaestro;

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

    private String nombre;
    private String curso;
    private String maestro;
    private String fecha;
    
    public Asistencia(){}
    
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
    
}
