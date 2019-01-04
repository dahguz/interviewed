package com.interviewed.services;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;


/**
 * 
 * Clase que asigna el lenguage por defecto de la aplicación, toma el valor desde el faces-config.xml
 * @author Dahyna Alejandra Guzmán Sánchez - 1399700
 * @version 1.0
 *
 */
@ManagedBean
@SessionScoped
public class LanguageService implements Serializable {

	private static final long serialVersionUID = 1L;
	Logger log = Logger.getLogger("LanguageService");
	
	
	private Locale locale;

	@PostConstruct
    public void init() {
		log.info("Initializing default Locale");
        locale = FacesContext.getCurrentInstance().getApplication().getDefaultLocale();
    }

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	
}
