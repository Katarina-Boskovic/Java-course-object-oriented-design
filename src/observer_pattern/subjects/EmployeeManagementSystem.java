package observer_pattern.subjects;

import observer_pattern.domain.Employee;
import observer_pattern.domain.EmployeeDAO;
import observer_pattern.observers.iObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements iSubject{

    private List<iObserver> observers;
    private List<Employee> employees;

    private EmployeeDAO employeeDAO;

    private Employee employee;
    private String msg;

    public EmployeeManagementSystem(){
        observers = new ArrayList<iObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(iObserver o){
        observers.add(o);
    }

    @Override
    public void removeObserver(iObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(iObserver departments: observers){
            departments.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp){

        employees.add(emp);
        // assign emp that was passed in to class employee so it can be passed to observers (same for msg) - callMe
        employee = emp;
        msg = "New Hire: ";
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String name){
        boolean notify = false;
        for(Employee emp : employees){
            if(id == emp.employeeID){
                emp.setName(name);
                this.employee = emp;
                this.msg = "Employee name has been modified to: ";
                notify = true;
            }
        }
        if(notify){
            notifyObservers();
        }
    }

}
