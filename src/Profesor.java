
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Profesor 
{
    
    private String nombre;
	private String contrasena;
	
	private String carnet;
	private String curso;
	
        public Profesor()
        {}
	/**
     * Constructor for objects of class Catedratico con parametros sus atributos.
     */
	public Profesor(String nombre, String contrasena, String carnet, String curso) 
        {
		this.nombre = nombre;
		this.contrasena = contrasena;
		
		this.carnet = carnet;
		this.curso = curso;
	}
	/**
     * @return String el nombre del catedratico
     */
	public String getNombre() 
        {
		return nombre;
	}
	/**
     * @return String la contrasena del catedratico
     */
	public String getContrasena() 
        {
		return contrasena;
	}
	/**
     
	/**
     * @return String el carnet del catedratico
     */
	public String getCarnet() 
        {
		return carnet;
	}
	/**
     * @return String el curso del catedratico
     */
	public String getCurso() 
        {
		return curso;
	}
        
        public ArrayList<Profesor> crearProfesor(ArrayList<Profesor> x)
        {
            Profesor poo= new Profesor( "Douglas Barrios","contrasena","17","Programacion Orientada a Objetos");
            x.add(poo);
            
            Profesor calc= new Profesor( "Ronald Curtiss","contrasena","18","Calculo 1");
            x.add(calc);
            
            Profesor fis= new Profesor( "Magda Moscoso","contrasena","19","Fisica 1");
            x.add(fis);
            
            return x;
        
        }
        
        public boolean IngresarSesion(String usuario, String contra,ArrayList<Profesor> x)
        {
            boolean respuesta=false;
            for (Profesor i:x) 
            {
                if (i.getCarnet().equals(usuario)) 
                {
                    if (i.getContrasena().equals(contra)) 
                    {
                        respuesta=true;
                        VistaProfesor j= new VistaProfesor();
                        j.curso=i.getCurso();
                        
                        
                    }
                    
                }
                
            }
            
            return respuesta;
        
        }
    
        public String RegistroGeneral(ArrayList<Asistencia> x,String curso )
        {
            String concatenar="";
            
            if (x.size()==0) 
            {
                System.out.println("Esta sin nada");
                
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
}
