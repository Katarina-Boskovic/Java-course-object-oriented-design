package observer_pattern.observers;

import observer_pattern.domain.Employee;
import observer_pattern.observers.iObserver;

public class HRDepartment implements iObserver {

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("HR department notified...");
        System.out.println(msg + emp.getName());
    }
}
