package observerGenericBase;

import java.util.LinkedList;

public abstract class SubjectT<T>{
	private LinkedList<ObserverT<T>> observers= new LinkedList<ObserverT<T>>();

	public void addObserver(ObserverT<T> ob) {
		observers.add(ob);
	}
	public void deleteObserver(ObserverT<T> ob) {
		observers.remove(ob);
	}
	public void notifyObservers(T info) {
		
		for(ObserverT<T> ob:observers) {
			ob.update(info);
		}
	}
	

}
