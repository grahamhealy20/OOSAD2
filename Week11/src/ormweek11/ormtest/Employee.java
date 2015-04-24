/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormweek11.ormtest;

public class Employee {
	public Employee() {
	}
	
	private int ID;
	
	private String name;
	
	private String address;
	
	private String mobile;
	
	private String PPS;
	
	private String year;
	
	private double salary;
	
	private double commission;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setPPS(String value) {
		this.PPS = value;
	}
	
	public String getPPS() {
		return PPS;
	}
	
	public void setYear(String value) {
		this.year = value;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setSalary(double value) {
		this.salary = value;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setCommission(double value) {
		this.commission = value;
	}
	
	public double getCommission() {
		return commission;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
