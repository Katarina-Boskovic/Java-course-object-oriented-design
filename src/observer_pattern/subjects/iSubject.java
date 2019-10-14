package observer_pattern.subjects;

import observer_pattern.observers.iObserver;

public interface iSubject {
    public void registerObserver(iObserver o);
    public void removeObserver(iObserver o);
    public void notifyObservers();
}
