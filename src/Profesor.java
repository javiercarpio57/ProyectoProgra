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
	private String apellido;
	private String carnet;
	private String curso;
	
	/**
     * Constructor for objects of class Catedratico con parametros sus atributos.
     */
	public Profesor(String nombre, String contrasena, String apellido, String carnet, String curso) 
        {
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.apellido = apellido;
		this.carnet = carnet;
		this.curso = curso;
	}
	/**
     * @return String el nombre del catedratico
     */
	public String getNombre() {
		return nombre;
	}
	/**
     * @return String la contrasena del catedratico
     */
	public String getContrasena() {
		return contrasena;
	}
	/**
     * @return String el apellido del catedratico
     */
	public String getApellido() {
		return apellido;
	}
	/**
     * @return String el carnet del catedratico
     */
	public String getCarnet() {
		return carnet;
	}
	/**
     * @return String el curso del catedratico
     */
	public String getCurso() {
		return curso;
	}
    
}
