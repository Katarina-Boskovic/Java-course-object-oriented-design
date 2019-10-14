package observer_pattern.observers;

import observer_pattern.domain.Employee;

public interface iObserver {
    public void callMe(Employee emp, String msg);
}
