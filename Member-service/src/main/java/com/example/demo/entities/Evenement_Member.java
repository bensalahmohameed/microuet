package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Evenement_Member {
	
	@EmbeddedId
	private Member_Evenement_Ids id;
	
	@ManyToOne @MapsId("member_id")
	private Member member;

	public Member_Evenement_Ids getId() {
		return id;
	}

	public void setId(Member_Evenement_Ids id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	
	
}
