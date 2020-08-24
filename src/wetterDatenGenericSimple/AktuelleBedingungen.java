package wetterDatenGenericSimple;

import observerGenericBase.*;

public class AktuelleBedingungen implements ObserverT<WetterInfo> {

	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;

	public AktuelleBedingungen() {
	}

	public void update(WetterInfo info) {

		switch (info.getTyp()) {
		case LUFTDRUCK:
			this.luftdruck = info.getWert();
			break;
		case FEUCHTIGKEIT:
			this.feuchtigkeit = info.getWert();
			break;
		case TEMPERATUR:
			this.temperatur = info.getWert();
			break;
		}
		anzeigen();
	}

	public void anzeigen() {
		System.out.println("AKTUELLE BEDINGUNGEN");
		System.out.println("Aktuelle Temparatur: " + temperatur);
		System.out.println("Aktuelle Feuchtigkeit: " + feuchtigkeit);
		System.out.println("Aktueller Luftdruck: " + luftdruck);
	}

}
