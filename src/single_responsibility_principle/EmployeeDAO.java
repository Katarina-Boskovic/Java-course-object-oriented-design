package single_responsibility_principle;

// data specific operations on employees
// DAO - data access object

import java.sql.SQLException;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) throws SQLException {
        // DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getMangerInstance();
        // connectionManager.connect();
        // connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        // connectionManager.disconnect();
        System.out.println("saved employee to the database: " + employee);
    }

    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee from the database");
    }
}
