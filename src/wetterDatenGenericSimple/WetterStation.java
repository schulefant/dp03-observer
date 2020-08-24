package wetterDatenGenericSimple;
import observerGenericBase.*;
public class WetterStation extends SubjectT<WetterInfo>{

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
