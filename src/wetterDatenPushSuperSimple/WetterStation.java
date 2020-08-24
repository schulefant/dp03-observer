package wetterDatenPushSuperSimple;
import java.util.LinkedList;

public class WetterStation {
	private LinkedList<WetterDatenObserver> observers= new LinkedList<WetterDatenObserver>();

	public void addObserver(WetterDatenObserver ob) {
		observers.add(ob);
	}
	public void deleteObserver(WetterDatenObserver ob) {
		observers.remove(ob);
	}
	public void notifyObservers(WetterInfo info) {
		
		for(WetterDatenObserver ob:observers) {
			ob.update(info);
		}
	}

	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;

	public void setMesswerte(float temp, float feucht, float luft){
		setTemperatur(temp);
		setFeuchtigkeit( feucht);
		setLuftdruck(luft);
	}

	public void setTemperatur(float temperatur) {
		this.temperatur = temperatur;
		notifyObservers(new WetterInfo(WetterIndikator.TEMPERATUR, temperatur));
	}

	public void setFeuchtigkeit(float feuchtigkeit) {
		this.feuchtigkeit = feuchtigkeit;
		notifyObservers(new WetterInfo(WetterIndikator.FEUCHTIGKEIT, feuchtigkeit));
	}

	public void setLuftdruck(float luftdruck) {
		this.luftdruck = luftdruck;
		notifyObservers(new WetterInfo(WetterIndikator.LUFTDRUCK, luftdruck));
	}

	public float getFeuchtigkeit() {
		return feuchtigkeit;
	}

	public float getTemperatur() {
		return temperatur;
	}

	public float getLuftdruck() {
		return luftdruck;
	}


}
