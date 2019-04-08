package gebaeudeVerwaltung;

public class Stockwerk {

	int nrStockwerk;
	static int anzahlRaeume = 10;

	Raum [] raeume = new Raum[10];


	public Stockwerk (int _nrStockwerk) {
		nrStockwerk = _nrStockwerk;

		for(int i = 0; i < 5; i++) {

			String raumname = "Etage " +nrStockwerk+ ", Mehrzweckraum " +i;
			Raum r = new Raum(raumname, 56.5, nrStockwerk, "Mehrzweckraum");
			raeume [i] = r;
		}

		for(int i = 5; i < 10; i++) {

			String raumname = "Etage " +nrStockwerk+ ", Büro " +i;
			BueroRaum br = new BueroRaum(raumname, 64.2, "Büro", 4);
			raeume [i] = br;
		}
	}

	public String toString() {
		String raumNamen = "";
		for( int i = 0; i < anzahlRaeume; i++ ) {
			raumNamen += raeume[i].raumName+ "\n";
		}
		String info = String.format("Stockwerk Nummer %s , \n%d Räume: \n%s ", nrStockwerk, anzahlRaeume, raumNamen );
		return info;
	}
}
