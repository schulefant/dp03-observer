package wetterDatenPushSuperSimple;


public class Main_WetterAufgabe {

	public static void main(String[] args) {

		System.out.println("--------------WETTERSTATION PUSH LIGHT--------------");
		WetterStation wetterStation = new WetterStation();
		AktuelleBedingungen aktuell = new AktuelleBedingungen();
		WetterVorhersage vorhersage = new WetterVorhersage();
		
		System.out.println("----------------------------");
		wetterStation.addObserver(vorhersage);
		wetterStation.addObserver(aktuell);
		
		wetterStation.setMesswerte(30,25,30);
		System.out.println("----------------------------");
		
		wetterStation.setTemperatur(18);
		wetterStation.setFeuchtigkeit(65);
		wetterStation.setLuftdruck(25);
		System.out.println("----------------------------");
		wetterStation.setMesswerte(19,65,25);
		System.out.println("----------------------------");
		wetterStation.setMesswerte(35,25,35);
		System.out.println("----------------------------");
		wetterStation.deleteObserver(vorhersage);
		wetterStation.setMesswerte(26, 20,55);
	}

}
