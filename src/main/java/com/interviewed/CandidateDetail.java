package com.interviewed;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "editor")
public class CandidateDetail {
	
	private String value = "locale: " + FacesContext.getCurrentInstance().getViewRoot().getLocale().toString();

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
