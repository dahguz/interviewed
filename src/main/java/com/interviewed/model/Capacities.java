package com.interviewed.model;

/**
 * Clase que contiene los atributos de las capacidades/skills de los candidatos
 * @author Dahyna Alejandra Guzman Sanchez - 1399700
 *
 */
public class Capacities {

	private String capacityName;
	private String eval;
	
	public String getCapacityName() {
		return capacityName;
	}
	
	public void setCapacityName(String capacityName) {
		this.capacityName = capacityName;
	}
	
	public String getEval() {
		return eval;
	}
	
	public void setEval(String eval) {
		this.eval = eval;
	}
	
	@Override
	public String toString() {
		return "Capacities [capacityName=" + capacityName + ", eval=" + eval + "]";
	}
	
}
