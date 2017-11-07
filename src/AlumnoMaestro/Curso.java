
package AlumnoMaestro;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    private String curso;
    private String maestro;
    private String salon;
    private String fecha;    
    private String alumno;    
    
    /**
     * Metodo que nos permite crear un objeto de este tipo para relacionar esta clase.
     */
    public Curso(){
        
    }
    
    /**
     * Metodo que nos permite crear los objetos de este tipo para las colecciones.
     * @param cursito Contiene el nombre del curso.
     * @param Maestro Contiene el nombre del maestro.
     * @param Salon Contiene el salon donde se imparte la clase.
     * @param nom Contiene el nombre del alumno.
     */
    public Curso(String cursito, String Maestro, String Salon, String nom){
        curso = cursito;
        maestro = Maestro;
        salon = Salon;
        Date myDate = new Date();
        fecha=new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        alumno = nom;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del curso.
     * @return curso
     */
    public String getCurso(){
        return curso;
    }

    /**
     * Metodo que nos permite indicar el nombre del curso, salon y fecha.
     * @return cadena
     */
    @Override
    public String toString() {
        String cadena;
        
        cadena = "CURSOS: " + (curso + " " + salon+" "+ fecha);
        return cadena;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del maestro.
     * @return maestro
     */
    public String getMaestro(){
        return maestro;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public String getSalon(){
        return salon;
    }
    
    /**
     * Metodo que nos permite colocer el nombre del alumno
     * @return alumno
     */
    public String getAlumno(){
        return alumno;
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
    
}
