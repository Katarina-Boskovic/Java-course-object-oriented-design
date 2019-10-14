package observer_pattern.observers;

import observer_pattern.domain.Employee;
import observer_pattern.observers.iObserver;

public class PayrollDepartment implements iObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("PAYROLL department notified...");
        System.out.println(msg + emp.getName());
    }
}
