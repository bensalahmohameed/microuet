package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Member_Outil_Ids implements Serializable {
	
	private Long outil_id;
	private Long member_id;
	public Long getOutil_id() {
		return outil_id;
	}
	public void setOutil_id(Long outil_id) {
		this.outil_id = outil_id;
	}
	public Long getMember_id() {
		return member_id;
	}
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}
	public Member_Outil_Ids(Long outil_id, Long member_id) {
		super();
		this.outil_id = outil_id;
		this.member_id = member_id;
	}
	public Member_Outil_Ids() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
