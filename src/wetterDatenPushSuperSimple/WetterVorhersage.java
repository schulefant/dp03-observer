package wetterDatenPushSuperSimple;

public class WetterVorhersage implements WetterDatenObserver {

	private float luftdruck;
	private float alterLuftdruck;

	public WetterVorhersage() {
	}

	public void update(WetterInfo typ) {

		if (typ.getTyp() == WetterIndikator.LUFTDRUCK) {
			this.alterLuftdruck = this.luftdruck;
			this.luftdruck = typ.getWert();
			anzeigen();
		}
	}

	public void anzeigen() {
		System.out.println("DER WETTERBERICHT");
		if (alterLuftdruck > luftdruck) {
			System.out.println("Das Wetter wird schlechter!");
		} else if (alterLuftdruck < luftdruck) {
			System.out.println("Das Wetter wird besser!");
		} else {
			System.out.println("Das Wetter bleibt gleich!");
		}

	}
}
