package spring.sql;

import java.util.List;
import java.util.Map;

import spring.dto.Board;
import spring.dto.Member;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

	public List<Member> memberselect(Member member);
	
	public int memberinsert(Member member);
	
	public Member selectdetail(Member member);

	public int deletemember(Member member);
	
	public void updatemember(Member member);
	
	
	public List<Map> selectboard(Board board);
}
