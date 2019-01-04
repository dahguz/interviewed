package com.interviewed.repository;

import java.util.List;

import com.interviewed.model.Interview;

/**
 * Interfaz con los métodos principales para guardar y recuperar los datos de las entrevistas 
 * @author Dahyna Alejandra Guzman Sanchez - 1399700
 *
 */
public interface InterviewRepository {
	
	public int save (Interview interview);
	
	public Interview getInterviewById(String id);
	
	public List<Interview> getAllInterviews();

}
