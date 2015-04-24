/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmweek11Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.Ormweek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormweek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.createEmployee();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : commission, salary
			lormweek11ormtestEmployee.setName("John");
			lormweek11ormtestEmployee.setAddress("123 Sample Town");
			lormweek11ormtestEmployee.setMobile("12345");
			lormweek11ormtestEmployee.setPPS("1234");
			lormweek11ormtestEmployee.setYear("2015");
			lormweek11ormtestEmployee.setSalary(1234);
			lormweek11ormtestEmployee.setCommission(1234);

			ormweek11.ormtest.EmployeeDAO.save(lormweek11ormtestEmployee);
			ormweek11.ormtest.Sales lormweek11ormtestSales = ormweek11.ormtest.SalesDAO.createSales();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : userId, custId
			lormweek11ormtestSales.setDate("23/4/15");
			lormweek11ormtestSales.setCustId(1);
			lormweek11ormtestSales.setUserId(1);
			ormweek11.ormtest.SalesDAO.save(lormweek11ormtestSales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek11Data createOrmweek11Data = new CreateOrmweek11Data();
			try {
				createOrmweek11Data.createTestData();
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
