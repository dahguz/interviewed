package com.interviewed.model;

import java.sql.Timestamp;
import java.util.List;

/**
 * Clase que contiene los atributos de una entrevista
 * @author Dahyna Alejandra Guzman Sanchez - 1399700
 *
 */
public class Interview {
	
	private String id;
	
	private Timestamp interviewDate;
	
	private String results;
	
	private String comments;
	
	private List<Interviewers> interviewers;
	
	private Candidate candidate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Timestamp interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public List<Interviewers> getInterviewers() {
		return interviewers;
	}

	public void setInterviewers(List<Interviewers> interviewers) {
		this.interviewers = interviewers;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "Interview [id=" + id + ", interviewDate=" + interviewDate + ", results=" + results + ", comments="
				+ comments + ", candidate=" + candidate.getName() + "]";
	}
	
	

}
