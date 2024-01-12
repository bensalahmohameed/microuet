package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Member_Outil_Ids;
import com.example.demo.entities.Outil_Member;
import com.example.demo.entities.Publication_Member;

import feign.Param;

public interface MemberOutilRepository extends JpaRepository<Outil_Member, Member_Outil_Ids> {

	@Query("select m from Outil_Member m where member_id=:x")

	List<Outil_Member> findOutilId(@Param("x") Long x);

}
