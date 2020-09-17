package com.org.entity;

public class Car {
	
	private Integer cid;
	
	private String cname;
	

	public Car() {
		super();
	}

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

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + "]";
	}
}
