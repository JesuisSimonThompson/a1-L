package gebaeudeVerwaltung;

public class BueroRaum extends Raum {

	Moebel[] moebel; 
	int anzahlSchreibtische;

	public BueroRaum(String _raumName, double grundFlaeche, String _nutzungsZweck, int anzahlSchreibtische) {

		super(_raumName, 3.2);
		this.anzahlSchreibtische = anzahlSchreibtische;
		this.nutzungsZweck = "Büroarbeiten";
		this.moebel = new Moebel[anzahlSchreibtische];
		for(int i=0; i < anzahlSchreibtische; i++) {
			moebel[i] = new Moebel(20, 2, 1, 1); // Tisch mit 20kg, 2m Laenge, 1m Breite, 1m Hoehe
		}
	}
	
	int getMoebelGewicht() {
		int gew = 0; 

		for ( int i=0; i < anzahlSchreibtische; i++) {
			gew += moebel[i].getGewicht();
		}

		return gew;
	}


	int getMoebelVolumen() {


		int gesVol = 0; 
		for(int i=0; i < anzahlSchreibtische; i++) {
			gesVol += moebel[i].getVolumen(); 
		}

		return gesVol;
	}

}
