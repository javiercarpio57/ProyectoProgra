
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
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected String nombre;
    protected String apellido;
    protected int carnet;
    protected String contrasena;
    
    /**
     * Constructor que nos conecta con base de datos.
     */
    public Persona(){
        
    }
    
    /**
     * Constructor que nos permite crear los objetos Persona.
     * @param n Nombre de la persona.
     * @param a Apellido de la persona.
     * @param car Carnet de la persona.
     * @param contra Contraseña de la persona.
     */
    public Persona(String n, String a, int car, String contra){
        nombre = n;
        apellido = a;
        carnet = car;
        contrasena = contra;
    }

    /**
     * Metodo que nos permite conocer el nombre de la persona.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que nos permite conocer el apellido de la persona.
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que nos permite conocer el carnet de la persona.
     * @return carnet
     */
    public int getCarnet() {
        return carnet;
    }

    /**
     * Metodo que nos permite conocer la contraseña de la persona.
     * @return contrasena
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * Metodo que nos permite conocer la pregunta de seguridad.
     * @return Se hereda a las hijas.
     */
    public String getPregunta(){
        return "";
    }
    
    /**
     * Metodo que nos permite conocer la respuesta a la pregunta de seguridad.
     * @return Se hereda a las hijas.
     */
    public String getRespuesta(){
        return "";
    }
    
    /**
     * Metodo que nos permite conocer el curso.
     * @return Se hereda a las hijas.
     */
    public String getCurso(){
        return "";
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Persona[ id=" + id + " ]";
    }
    
}
