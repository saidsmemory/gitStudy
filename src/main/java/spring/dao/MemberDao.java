package spring.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.dto.Board;
import spring.dto.Member;

@Component
public class MemberDao {

	@Autowired
	SqlSession ss;
	
	public List<Member> memberlist(Member member){
		return ss.selectList("spring.sql.Mapper.memberselect", member);
	}
	
	public int memberinsert(Member member) {
		return ss.insert("spring.sql.Mapper.memberinsert", member);
	}
	
	public Member selectdetail(Member member){
		return ss.selectOne("spring.sql.Mapper.selectdetail", member);
	}
	
	public int memberdelete(Member member) {
		return ss.delete("spring.sql.Mapper.deletemember",member);
	}
	
	public void updatemember(Member member) {
		ss.update("spring.sql.Mapper.updatemember", member);
	}
	
	
	 public List<Map> selectboard(Board board) {
		 return ss.selectList("spring.sql.Mapper.selectboard", board);		 
	 }
}
