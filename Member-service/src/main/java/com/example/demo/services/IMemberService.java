package com.example.demo.services;

import java.util.List;

import com.example.demo.bean.EvenementBean;
import com.example.demo.bean.OutilBean;
import com.example.demo.bean.PublicationBean;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;

public interface IMemberService {
	

	//Crud sur les membres
	public Member addMember(Member m);
	public void deleteMember(Long id) ;
	public Member updateMember(Member p) ;
	public Member findMember(Long id) ;
	public List<Member> findAll();
	//Filtrage par propriété
	public Member findByCin(String cin);
	public Member findByEmail(String email);
	public List<Member> findByNom(String nom);
	//recherche spécifique des étudiants
	public List<Etudiant> findByDiplome(String diplome);
	//recherche spécifique des enseignants
	public List<EnseignantChercheur> findByGrade(String grade);
	public List<EnseignantChercheur> findByEtablissement(String
	etablissement);
	
	public void affecterauteurTopublication(Long
			idauteur, Long idpub);
	
	public List<PublicationBean>
	findPublicationparauteur (Long idauteur);
	
	
	public void affectermemberTooutil(Long
			idmember, Long idoutil);
	
	public List<OutilBean>
	findOutilparmember(Long idmember);
	
	
	
	public void affectermemberToevenement(Long
			idmember, Long idevenement);
	
	public List<EvenementBean>
	findEvenementparmember(Long idmember);
	
	
}
