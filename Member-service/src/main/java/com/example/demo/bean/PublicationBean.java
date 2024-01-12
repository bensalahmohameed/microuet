package com.example.demo.bean;

import java.util.Date;

public class PublicationBean {
	
	Long id ;
	Date date;
	String titre;
	String lien;
	String type;
	String sourcepdf;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSourcepdf() {
		return sourcepdf;
	}
	public void setSourcepdf(String sourcepdf) {
		this.sourcepdf = sourcepdf;
	}
	
	

}
