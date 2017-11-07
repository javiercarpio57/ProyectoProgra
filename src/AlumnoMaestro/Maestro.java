
package AlumnoMaestro;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author javie
 */
@Entity
public class Maestro extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String curso;
    
    public Maestro(){
        super("", "", 0, "");
        curso = "";
    }
    
    public Maestro(String Nombre, String Apellido, int carne, String contra, String Curso){
        super(Nombre, Apellido, carne, contra);
        curso = Curso;
    }
    
    public String getCurso(){
        return curso;
    }
    
    
    /**
     * Metodo que verifica si el usuario y contrasena ingresados son correctos.
     * @param usuario Contiene el usuario ingresado.
     * @param contra Contiene la contrasena ingresada
     * @param x Contiene la lista de los profesores con su informacion.
     * @return respuesta
     */
    /*public boolean IngresarSesion(String usuario, String contra,ArrayList<Maestro> x)
        {
            boolean respuesta=false;
            for (Maestro i:x) 
            {
                if (i.getCarnet().equals(usuario)) 
                {
                    if (i.getContrasena().equals(contra)) 
                    {
                        respuesta=true;
                        VistaProfesor.curso = i.getCurso();
                    }
                }
            }
            return respuesta;
        }*/
    
    
    /**
     * Metodo que muestra el contenido de las asistencias.
     * @param x Contiene la lista de los maestros ingresados.
     * @param curso Contiene el nombre del curso impartido.
     * @return concatenar.
     */
    public String RegistroGeneral(ArrayList<Asistencia> x,String curso )
        {
            String concatenar="";
            
            if (x.size()==0) 
            {
                //System.out.println("Esta sin nada");
                
            }
            
            for(Asistencia i:x)
            {
                if (i.getCurso().equals(curso)) 
                {
                    concatenar+=i.toString2()+"\n";
                    
                }
            
            }
            
            
            
            return concatenar;
        
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
        return super.toString() + " - Curso: " + curso;
    }
    
}
