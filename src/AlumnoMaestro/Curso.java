
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
    
    private Date myDate = new Date();
    
    public Curso(){
        
    }
    
    public Curso(String cursito, String Maestro, String Salon, String nom){
        curso = cursito;
        maestro = Maestro;
        salon = Salon;
        Date myDate = new Date();
        fecha=new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        alumno = nom;
    }
    public String getCurso(){
        return curso;
    }
    public String toString() {
        String cadena;
        cadena = (curso + " " + salon+" "+"<html><b><u> Fecha de asistencia "+fecha+"</u></b>");
        return cadena;
    }
    
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
