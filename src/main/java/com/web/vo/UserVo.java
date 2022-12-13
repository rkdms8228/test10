package com.web.vo;

public class UserVo {
	
	//필드
	private int no;
	private String id;
	private String password;
	private String name;
	
	//생성자
	public UserVo() {}
	public UserVo(String id, String password) {
		this.id = id;
		this.password = password;	
	}
	public UserVo(int no, String id, String password, String name) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;	
	}
	
	//메소드
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
