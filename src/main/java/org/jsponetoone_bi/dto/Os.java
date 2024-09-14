package org.jsponetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Os {
	
    @Id
	private int oid;
	private String name;
	private int bit;
	
	//@OneToOne(cascade=CascadeType.ALL)
	@OneToOne(cascade=CascadeType.ALL,mappedBy="os")
	private Mobile mobile;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBit() {
		return bit;
	}
	public void setBit(int bit) {
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Os [oid=" + oid + ", name=" + name + ", bit=" + bit + "]";
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
	
}
