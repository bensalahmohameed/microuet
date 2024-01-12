package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Member_Pub_Ids;
import com.example.demo.entities.Publication_Member;

import java.util.List;
import feign.Param;



public interface MemberPublicationRepository extends JpaRepository<Publication_Member, Member_Pub_Ids> {

	@Query("select m from Publication_Member m where auteur_id=:x")
	
	List<Publication_Member> findpubId(@Param ("x")Long x);
}