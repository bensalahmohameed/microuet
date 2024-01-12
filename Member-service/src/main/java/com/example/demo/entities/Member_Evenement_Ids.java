package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Member_Evenement_Ids implements Serializable {

	private Long evenement_id;
	private Long member_id;
	public Long getEvenement_id() {
		return evenement_id;
	}
	public void setEvenement_id(Long evenement_id) {
		this.evenement_id = evenement_id;
	}
	public Long getMember_id() {
		return member_id;
	}
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}
	public Member_Evenement_Ids(Long evenement_id, Long member_id) {
		super();
		this.evenement_id = evenement_id;
		this.member_id = member_id;
	}
	public Member_Evenement_Ids() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
