package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Publication_Member {

	@EmbeddedId
	private Member_Pub_Ids id;
	@ManyToOne @MapsId("auteur_id")
	private Member auteur;
	public Member_Pub_Ids getId() {
		return id;
	}
	public void setId(Member_Pub_Ids id) {
		this.id = id;
	}
	public Member getAuteur() {
		return auteur;
	}
	public void setAuteur(Member auteur) {
		this.auteur = auteur;
	}
	
	
	
}
