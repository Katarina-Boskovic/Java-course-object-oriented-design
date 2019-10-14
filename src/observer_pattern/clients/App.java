package observer_pattern.clients;

import observer_pattern.domain.Employee;
import observer_pattern.observers.HRDepartment;
import observer_pattern.observers.PayrollDepartment;
import observer_pattern.observers.iObserver;
import observer_pattern.subjects.EmployeeManagementSystem;

import java.util.Date;

public class App {

    public static void main(String args[]){

        iObserver payroll = new PayrollDepartment();
        iObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 3500, true);
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(2, "Jack");
    }
}
