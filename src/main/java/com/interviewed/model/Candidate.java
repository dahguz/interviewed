package com.interviewed.model;

import java.util.List;

/**
 * Clase que contiene los atributos de los candidatos
 * @author Dahyna Alejandra Guzman Sanchez - 1399700
 *
 */
public class Candidate {
	
	private String rut;
	private String name;
	private String referenceName;
	private String role;
	private String education;
	private String currentJob;
	private int countChangeWork;
	private String reasonChangeWork;
	private boolean breakCareer;
	private String reasonBreakCareer;
	private int totalYearsWorking;
	private int totalRelevantYearsWorking;
	private String commentsAboutExperience;
	
	private List<Capacities> technicalCapacities;
	private List<Capacities> managmentCapacities;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReferenceName() {
		return referenceName;
	}
	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}
	public int getCountChangeWork() {
		return countChangeWork;
	}
	public void setCountChangeWork(int countChangeWork) {
		this.countChangeWork = countChangeWork;
	}
	public String getReasonChangeWork() {
		return reasonChangeWork;
	}
	public void setReasonChangeWork(String reasonChangeWork) {
		this.reasonChangeWork = reasonChangeWork;
	}
	public boolean isBreakCareer() {
		return breakCareer;
	}
	public void setBreakCareer(boolean breakCareer) {
		this.breakCareer = breakCareer;
	}
	public String getReasonBreakCareer() {
		return reasonBreakCareer;
	}
	public void setReasonBreakCareer(String reasonBreakCareer) {
		this.reasonBreakCareer = reasonBreakCareer;
	}
	public int getTotalYearsWorking() {
		return totalYearsWorking;
	}
	public void setTotalYearsWorking(int totalYearsWorking) {
		this.totalYearsWorking = totalYearsWorking;
	}
	public int getTotalRelevantYearsWorking() {
		return totalRelevantYearsWorking;
	}
	public void setTotalRelevantYearsWorking(int totalRelevantYearsWorking) {
		this.totalRelevantYearsWorking = totalRelevantYearsWorking;
	}
	public String getCommentsAboutExperience() {
		return commentsAboutExperience;
	}
	public void setCommentsAboutExperience(String commentsAboutExperience) {
		this.commentsAboutExperience = commentsAboutExperience;
	}
	public List<Capacities> getTechnicalCapacities() {
		return technicalCapacities;
	}
	public void setTechnicalCapacities(List<Capacities> technicalCapacities) {
		this.technicalCapacities = technicalCapacities;
	}
	public List<Capacities> getManagmentCapacities() {
		return managmentCapacities;
	}
	public void setManagmentCapacities(List<Capacities> managmentCapacities) {
		this.managmentCapacities = managmentCapacities;
	}
	@Override
	public String toString() {
		return "Candidate [rut=" + rut + ", name=" + name + ", referenceName=" + referenceName + ", role=" + role
				+ ", education=" + education + ", currentJob=" + currentJob + ", countChangeWork=" + countChangeWork
				+ ", reasonChangeWork=" + reasonChangeWork + ", breakCareer=" + breakCareer + ", reasonBreakCareer="
				+ reasonBreakCareer + ", totalYearsWorking=" + totalYearsWorking + ", totalRelevantYearsWorking="
				+ totalRelevantYearsWorking + ", commentsAboutExperience=" + commentsAboutExperience + "]";
	}
	
}
