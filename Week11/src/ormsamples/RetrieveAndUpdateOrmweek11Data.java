/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOrmweek11Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ormweek11.ormtest.Ormweek11PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek11.ormtest.Employee lormweek11ormtestEmployee = ormweek11.ormtest.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			ormweek11.ormtest.EmployeeDAO.save(lormweek11ormtestEmployee);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		ormweek11.ormtest.EmployeeCriteria lormweek11ormtestEmployeeCriteria = new ormweek11.ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormweek11ormtestEmployeeCriteria.ID.eq();
		System.out.println(lormweek11ormtestEmployeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmweek11Data retrieveAndUpdateOrmweek11Data = new RetrieveAndUpdateOrmweek11Data();
			try {
				retrieveAndUpdateOrmweek11Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmweek11Data.retrieveByCriteria();
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
