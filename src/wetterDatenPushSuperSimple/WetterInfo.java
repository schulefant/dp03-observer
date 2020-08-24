package wetterDatenPushSuperSimple;

public class WetterInfo {
	
	private WetterIndikator typ;
	private float wert;
	
	public WetterInfo(WetterIndikator typ, float temperatur) {
		super();
		this.typ = typ;
		this.wert = temperatur;
	}
	public WetterIndikator getTyp() {
		return typ;
	}
	public void setTyp(WetterIndikator typ) {
		this.typ = typ;
	}
	public float getWert() {
		return wert;
	}
	public void setWert(float wert) {
		this.wert = wert;
	}

}
