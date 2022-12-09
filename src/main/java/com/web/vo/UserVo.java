package com.web.vo;

public class UserVo {
	
	//필드
	private int no;
	private String id;
	private String name;
	private int password;
	
	//생성자
	public UserVo() {}
	
	public UserVo(int no, String id, String name, int password) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.password = password;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}


}
