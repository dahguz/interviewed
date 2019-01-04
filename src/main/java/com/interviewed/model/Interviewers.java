package com.interviewed.model;

/**
 * Clase que contiene los atributos de un entrevistador
 * @author Dahyna Alejandra Guzman Sanchez - 1399700
 *
 */
public class Interviewers {
	
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Interviewers [id=" + id + ", name=" + name + "]";
	}
	
	

}
