package gebaeudeVerwaltung;

abstract public class  Gebaeude implements Reinigungskosten{

	String gebaeudename;
	String verantwortlicherProgrammierer;

	String strasse;
	String hausnummer;
	int plz;

	static int anzahlRaeume;
	static int anzahlStockwerke;

	String kontakt;
	String telNummer;

	static Stockwerk [] stockwerke;// TODO Zahl 38 durch anzahlStockwerke ersetzen


	public Gebaeude (String _gebaeudeName, String _verantwortlicherProgrammierer,
			String _strasse, String _hausnummer, int _plz, int _anzahlStockwerke ) {

		gebaeudename = _gebaeudeName;
		verantwortlicherProgrammierer = _verantwortlicherProgrammierer;
		strasse = _strasse;
		hausnummer = _hausnummer;
		plz = _plz;
		kontakt = "k.A.";
		telNummer = "k.A.";
		anzahlStockwerke = _anzahlStockwerke;

		stockwerke = new Stockwerk[anzahlStockwerke];

		for (int i = 0; i  < anzahlStockwerke; i++) {
			Stockwerk sW = new Stockwerk(i);
			O2Tower.stockwerke[i] = sW;
		}
	}

	public String toString() {

		String info = "Gebäude: " +gebaeudename+ "\n" +
				"Adresse: " +strasse+ " " +hausnummer+ " " +plz+ "\n" +
				"Kontakt: " +kontakt+ " Tel: " +telNummer;
		return info;
	}

	static double getGesamtflaeche(){   // TODO Korrigieren
		double gesFl = 0;

		for(int i = 0; i < anzahlStockwerke; i++) {
			for(int j = 0; j < stockwerke[i].anzahlRaeume; j++){
				gesFl += stockwerke[i].raeume[j].grundFlaeche;

			}
		}
		return gesFl;
	}










}
