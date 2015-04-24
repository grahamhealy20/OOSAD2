/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListOrmweek11Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		ormweek11.ormtest.Employee[] ormweek11ormtestEmployees = ormweek11.ormtest.EmployeeDAO.listEmployeeByQuery(null, null);
		int length = Math.min(ormweek11ormtestEmployees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormweek11ormtestEmployees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		ormweek11.ormtest.EmployeeCriteria lormweek11ormtestEmployeeCriteria = new ormweek11.ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormweek11ormtestEmployeeCriteria.ID.eq();
		lormweek11ormtestEmployeeCriteria.setMaxResults(ROW_COUNT);
		ormweek11.ormtest.Employee[] ormweek11ormtestEmployees = lormweek11ormtestEmployeeCriteria.listEmployee();
		int length =ormweek11ormtestEmployees== null ? 0 : Math.min(ormweek11ormtestEmployees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormweek11ormtestEmployees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOrmweek11Data listOrmweek11Data = new ListOrmweek11Data();
			try {
				listOrmweek11Data.listTestData();
				//listOrmweek11Data.listByCriteria();
			}
			finally {
				ormweek11.ormtest.Ormweek11PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
