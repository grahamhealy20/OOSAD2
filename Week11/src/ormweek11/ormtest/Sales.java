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

public class Sales {
	public Sales() {
	}
	
	private int ID;
	
	private String date;
	
	private int custId;
	
	private int userId;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDate(String value) {
		this.date = value;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setCustId(int value) {
		this.custId = value;
	}
	
	public int getCustId() {
		return custId;
	}
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
