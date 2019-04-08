package gebaeudeVerwaltung;

public class O2Tower extends Gebaeude {

	public O2Tower () {

		super("O2Tower", "Louisa", "Georg-Brauchle-Ring ", "50 - 66", 80992, 38  );

	}

	static double getGesamtflaeche() {

		double gesFl = 0;

		for(int i = 0; i < anzahlStockwerke; i++) {

			for(int j = 0; j < stockwerke[i].anzahlRaeume; j++){
				gesFl += stockwerke[i].raeume[j].grundFlaeche;

			}
		}
		return gesFl;
	}

	String getBesonderheiten() {

		return "Der O2Tower sieht schön aus - in der Dunkelheit mit beleuchteten Fenstern und am Morgen im Licht des Sonnenaufgangs \n";
	}

	public String toString() {
		return super.toString()+ "\n \n" +"Besonderheit: " +getBesonderheiten();
	}


	public double getKosten() {
		double kosten = 0;
		for (int i = 0; i < anzahlStockwerke; i++ ) {
			for (int j = 0; j < stockwerke[i].anzahlRaeume; j++){
				kosten += stockwerke[i].raeume[j].grundFlaeche * 0.5;
				kosten += stockwerke[i].raeume[j].anzahlFenster * 1.0;
			}
		}
		return kosten;

	}




}

