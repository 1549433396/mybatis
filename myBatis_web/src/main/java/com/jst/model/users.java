package com.jst.model;

public class users {
	private int uid;
	private String uname;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "users [uid=" + uid + ", uname=" + uname + "]";
	}
	
	

}
