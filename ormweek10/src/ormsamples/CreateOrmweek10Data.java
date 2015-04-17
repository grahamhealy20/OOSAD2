/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
import java.util.Scanner;

public class CreateOrmweek10Data {
	Scanner input = new Scanner(System.in);
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			System.out.println("Please Enter the number of records you wish to enter: ");
			int entries = input.nextInt();
			input.nextLine();
			for(int i = 0; i < entries; i++) {
				ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
				System.out.println("Please enter the Name: ");
				lormtestEmployee.setName(input.nextLine());
				System.out.println("Please enter the Address: ");
				lormtestEmployee.setAddress(input.nextLine());
				System.out.println("Please enter the PPS: ");
				lormtestEmployee.setPps(input.nextLine());
				System.out.println("Please enter the Mobile Number: ");
				lormtestEmployee.setMobile(input.nextLine());
				System.out.println(i);
				lormtestEmployee.save();		
			}			
			t.commit();	
		}
		catch (Exception e) {
			t.rollback();
		}	
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek10Data createOrmweek10Data = new CreateOrmweek10Data();
			try {
				createOrmweek10Data.createTestData();
			}
			finally {
				ormtest.Ormweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
