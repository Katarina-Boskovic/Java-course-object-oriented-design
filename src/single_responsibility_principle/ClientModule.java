package single_responsibility_principle;

import java.sql.SQLException;
//import reporting.EmployeeReportFormatter;

public class ClientModule {

    public static void main(String args[]) throws SQLException {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }
    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
