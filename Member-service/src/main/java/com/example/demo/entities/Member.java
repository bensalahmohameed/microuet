package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.example.demo.bean.EvenementBean;
import com.example.demo.bean.OutilBean;
import com.example.demo.bean.PublicationBean;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_mbr",discriminatorType =DiscriminatorType.STRING,length = 3)
public abstract class Member implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cin;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date date;
	byte[] photo;
	private String cv;
	private String email;
	private String password;
	
	@Transient
	Collection<PublicationBean> pubs;
	
	@Transient
	Collection<OutilBean> outils;
	
	@Transient
	Collection<EvenementBean> evenements;
	
	
	
	public Collection<EvenementBean> getEvenements() {
		return evenements;
	}


	public void setEvenements(Collection<EvenementBean> evenements) {
		this.evenements = evenements;
	}


	public Collection<PublicationBean> getPubs() {
		return pubs;
	}
	
	
	public Collection<OutilBean> getOutils() {
		return outils;
	}




	public void setOutils(Collection<OutilBean> outils) {
		this.outils = outils;
	}




	public void setPubs(Collection<PublicationBean> pubs) {
		this.pubs = pubs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email,
			String password) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.photo = photo;
		this.cv = cv;
		this.email = email;
		this.password = password;
	}
	
	



}
