
package Persistencia;

import java.io.Serializable;
import javax.persistence.Column;
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
public class Estudiante extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String correo;
    private String pregunta;
    private String respuesta;

    /**
     * Constructor que nos permite crear el objeto Estudiante.
     * @param correo Correo del estudiante.
     * @param n Nombre del estudiante.
     * @param a Apellido del estudiante.
     * @param car Carnet del estudiante.
     * @param contra Contrasena del estudiante.
     * @param pregunta Pregunta de seguridad del estudiante.
     * @param respuesta Respuesta a la pregunta de seguridad del estudiante.
     */
    public Estudiante(String correo, String n, String a, int car, String contra, String pregunta, String respuesta) {
        super(n, a, car, contra);
        this.correo = correo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    /**
     * Constructor que nos permite concectar con base de datos.
     */
    public Estudiante(){
        
    }

    /**
     * Metodo que nos permite conocer el correo del estudiante.
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo que nos permite conocer la pregunta de seguridad.
     * @return pregunta
     */
    @Override
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Metodo que nos permite conocer la respuesta a la pregunta de seguridad.
     * @return respuesta
     */
    @Override
    public String getRespuesta() {
        return respuesta;
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
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Estudiante[ id=" + id + " ]";
    }
    
}
