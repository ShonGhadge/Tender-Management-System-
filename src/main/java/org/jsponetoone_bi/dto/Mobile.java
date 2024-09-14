package org.jsponetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Mobile {
	@Id
	private int mid;
	private String color;
	private double price;
	private String brand;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Os os;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", color=" + color + ", price=" + price + ", brand=" + brand + "]";
	}
	public Os getOs() {
		return os;
	}
	public void setOs(Os os) {
		this.os = os;
	}
	
	
	
	
	

}
