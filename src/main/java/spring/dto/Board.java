package spring.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Board {

	private Long id;
	   private String title;
	   private String content;
	   @DateTimeFormat(pattern = "yy.MM.dd.HH:mm")
	   private LocalDateTime reg_date;
	   private String m_id;
	   private String file1Name;
	   private String file1sname;
	   private String update_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getReg_date() {
		return reg_date;
	}
	public void setReg_date(LocalDateTime reg_date) {
		this.reg_date = reg_date;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getFile1Name() {
		return file1Name;
	}
	public void setFile1Name(String file1Name) {
		this.file1Name = file1Name;
	}
	public String getFile1sname() {
		return file1sname;
	}
	public void setFile1sname(String file1sname) {
		this.file1sname = file1sname;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	   
}
