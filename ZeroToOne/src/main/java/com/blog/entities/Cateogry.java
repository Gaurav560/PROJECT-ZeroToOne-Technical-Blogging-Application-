package com.blog.entities;

public class Cateogry {

	
	
	//private variables
	private Integer cid;
	private String cname;
	private String cdescription;
	
	
	
	//getters and setters
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	
	
	//3 arg constructor
	public Cateogry(Integer cid, String cname, String cdescription) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cdescription = cdescription;
	}
	
	
	//2 arg constructor
	public Cateogry(String cname, String cdescription) {
		super();
		this.cname = cname;
		this.cdescription = cdescription;
	}
	
	
	//default constructor
	public Cateogry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
