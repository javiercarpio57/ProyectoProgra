
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
public class Maestro extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String curso;

    /**
     * Constructor que nos permite crear el objeto Maestro.
     * @param curso Contiene el curso impartido por el maestro.
     * @param n Contiene el nombre del maestro.
     * @param a Apellido del maestro.
     * @param car Carnet del maestro.
     * @param contra Contrasena del maestro.
     */
    public Maestro(String curso, String n, String a, int car, String contra) {
        super(n, a, car, contra);
        this.curso = curso;
    }
    
    /**
     * Constructor que nos conecta con la base de datos.
     */
    public Maestro(){
        super("", "", 0, "");
        curso = "";
    }

    /**
     * Metodo que nos permite conocer el curso del maestro.
     * @return curso
     */
    @Override
    public String getCurso() {
        return curso;
    }
    
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
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
        if (!(object instanceof Maestro)) {
            return false;
        }
        Maestro other = (Maestro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Maestro[ id=" + id + " ]";
    }
    
}
