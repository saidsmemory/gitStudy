package spring.sql;

import java.util.List;

import spring.dto.Member;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

	public List<Member> memberselect(Member member);
	
	public int memberinsert(Member member);
	
	public Member selectdetail(Member member);

	public int deletemember(Member member);
	
	public void updatemember(Member member);
}
