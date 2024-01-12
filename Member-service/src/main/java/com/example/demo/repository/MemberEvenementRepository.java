package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Evenement_Member;
import com.example.demo.entities.Member_Evenement_Ids;
import com.example.demo.entities.Outil_Member;

import feign.Param;

public interface MemberEvenementRepository extends JpaRepository<Evenement_Member, Member_Evenement_Ids> {
	
	@Query("select m from Evenement_Member m where member_id=:x")

	List<Evenement_Member> findEvenementId(@Param("x") Long x);


}
