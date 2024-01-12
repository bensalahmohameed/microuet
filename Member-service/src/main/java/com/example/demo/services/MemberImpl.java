package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.EvenementBean;
import com.example.demo.bean.OutilBean;
import com.example.demo.bean.PublicationBean;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Evenement_Member;
import com.example.demo.entities.Member;
import com.example.demo.entities.Member_Evenement_Ids;
import com.example.demo.entities.Member_Outil_Ids;
import com.example.demo.entities.Member_Pub_Ids;
import com.example.demo.entities.Outil_Member;
import com.example.demo.entities.Publication_Member;
import com.example.demo.proxy.EvenementProxyService;
import com.example.demo.proxy.OutilProxyService;
import com.example.demo.proxy.PublicationProxyService;
import com.example.demo.repository.EnseignantChercheurRepository;
import com.example.demo.repository.EtudiantRepository;
import com.example.demo.repository.MemberEvenementRepository;
import com.example.demo.repository.MemberOutilRepository;
import com.example.demo.repository.MemberPublicationRepository;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberImpl implements IMemberService {

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	EtudiantRepository etudiantRepository;

	@Autowired
	EnseignantChercheurRepository enseignantChercheurRepository;

	@Autowired
	MemberPublicationRepository membrepubrepository;

	@Autowired
	MemberOutilRepository memberOutilRepository;

	@Autowired
	MemberEvenementRepository memberEvenementRepository;
	
	@Autowired
	PublicationProxyService proxy;
	
	@Autowired
	OutilProxyService outilProxyService;
	
	@Autowired
	EvenementProxyService evenementProxyService;

	@Override
	public Member addMember(Member m) {
		memberRepository.save(m);
		return m;
	}

	@Override
	public void deleteMember(Long id) {

		memberRepository.deleteById(id);
	}

	@Override
	public Member updateMember(Member m) {

		return memberRepository.saveAndFlush(m);
	}

	@Override
	public Member findMember(Long id) {
		Member m = (Member) memberRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}

	@Override
	public Member findByCin(String cin) {
		// TODO Auto-generated method stub
		return memberRepository.findByCin(cin);
	}

	@Override
	public Member findByEmail(String email) {
		// TODO Auto-generated method stub
		return memberRepository.findByEmail(email);
	}

	@Override
	public List<Member> findByNom(String nom) {
		// TODO Auto-generated method stub
		return memberRepository.findByNomStartingWith(nom);
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByDiplome(diplome);
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByEtablissement(etablissement);
	}

	@Override
	public void affecterauteurTopublication(Long idauteur, Long idpub) {
		Member mbr = memberRepository.findById(idauteur).get();
		Publication_Member mbs = new Publication_Member();
		mbs.setAuteur(mbr);
		mbs.setId(new Member_Pub_Ids(idpub, idauteur));
		membrepubrepository.save(mbs);
	}

	@Override
	public List<PublicationBean> findPublicationparauteur(Long idauteur) {
		List<PublicationBean> pubs = new ArrayList<PublicationBean>();
		List<Publication_Member> idpubs = membrepubrepository.findpubId(idauteur);
		idpubs.forEach(s -> {
			System.out.println(s);
			pubs.add(proxy.findPublicationById(s.getId().getPublication_id()));
		});

		return pubs;
	}

	@Override
	public void affectermemberTooutil(Long idmember, Long idoutil) {
		// TODO Auto-generated method stub
		Member mbr = memberRepository.findById(idmember).get();
		Outil_Member mbs = new Outil_Member();
		mbs.setMember(mbr);
		mbs.setId(new Member_Outil_Ids(idoutil, idmember));
		memberOutilRepository.save(mbs);
	}

	@Override
	public List<OutilBean> findOutilparmember(Long idmember) {
		List<OutilBean> outils = new ArrayList<OutilBean>();
		List<Outil_Member> idoutils = memberOutilRepository.findOutilId(idmember);
		idoutils.forEach(s -> {
			System.out.println(s);
			outils.add(outilProxyService.findOutilById(s.getId().getOutil_id()));
		});

		return outils;
	}

	@Override
	public void affectermemberToevenement(Long idmember, Long idevenement) {
		// TODO Auto-generated method stub
		Member mbr = memberRepository.findById(idmember).get();
		Evenement_Member mbs = new Evenement_Member();
		mbs.setMember(mbr);
		mbs.setId(new Member_Evenement_Ids(idevenement, idmember));
		memberEvenementRepository.save(mbs);
		
	}

	@Override
	public List<EvenementBean> findEvenementparmember(Long idmember) {
		// TODO Auto-generated method stub
		List<EvenementBean> evenements = new ArrayList<EvenementBean>();
		List<Evenement_Member> idevenements = memberEvenementRepository.findEvenementId(idmember);
		idevenements.forEach(s -> {
			System.out.println(s);
			evenements.add(evenementProxyService.findEvenementById(s.getId().getEvenement_id()));
		});

		return evenements;
	}

}
