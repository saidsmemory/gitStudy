package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.MemberDao;
import spring.dto.Member;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;

	public void print(Member member) {
		List<Member> list = dao.memberlist(member);
		list.stream().forEach(p -> System.out.println(p.getId() + "|" + p.getName()));
	}
	@Transactional
	public void add(Member member) {
		dao.memberinsert(member);
	}
	
	public Member detail(Member member) {
		return dao.selectdetail(member);
	}
	
	public int del(Member member) {
		return dao.memberdelete(member);
	}
	
	public void update(Member member) {
		dao.updatemember(member);
	}

}
