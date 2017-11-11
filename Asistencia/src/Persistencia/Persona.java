
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
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected String nombre;
    protected String apellido;
    protected int carnet;
    protected String contrasena;
    
    public Persona(){
        
    }
    
    public Persona(String n, String a, int car, String contra){
        nombre = n;
        apellido = a;
        carnet = car;
        contrasena = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public String getPregunta(){
        return "";
    }
    
    public String getRespuesta(){
        return "";
    }
    
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
