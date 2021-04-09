package com.abc.model;

public class Student {

	private String sid;
	private String sname;
	private String semailid;
	private String sphno;
	private String sadharno;
	private String sbankacc;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student() {

	}

	public void setSemailid(String semailid) {
		this.semailid = semailid;
	}
	public String getSemail() {
		return semailid;
	}
	
	public void setSphno(String sphno) {
		this.sphno =sphno;
	}
	public String getSphno() {
		return sphno;
	}
	
	public void setSadharno(String sadharno) {
		this.sadharno =sadharno;
	}
	public String getSadharno() {
		return sadharno;
	}
	
	public void setSbankacc(String sbankacc) {
		this.sbankacc =sbankacc;
	}
	public String getSbankacc() {
		return sbankacc;
	}
	
	
}
