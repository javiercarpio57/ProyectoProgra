
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
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    //ATRIBUTOS PROPIOS
    protected String nombre;
    protected String apellido;
    protected int carnet;
    protected String contrasena;
    
    public Persona(){}
    
    public Persona(String Nombre, String Apellido, int carne, String contra){
        nombre = Nombre;
        apellido = Apellido;
        carnet = carne;
        contrasena = contra;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del alumno.
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo que nos permite conocer el apellido del alumno.
     * @return apellido
     */
    public String getApellido(){
        return apellido;
    }
    
    /**
     * Metodo que nos permite conocer el numero de carnet del alumno.
     * @return carnet
     */
    public int getCarnet(){
        return carnet;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    //METODOS PROPIOS
    
    
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
        String cadena = "";
        
        cadena += "Nombre: " + nombre + " " + apellido + " - Carnet: " + carnet;
        
        return cadena;
    }
    
}
