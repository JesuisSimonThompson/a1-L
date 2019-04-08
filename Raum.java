package gebaeudeVerwaltung;





public class Raum {

	static final int KEINE_INFO = -1;

	String raumName;
	String nutzungsZweck ;

	double grundFlaeche;
	int anzahlFenster = KEINE_INFO;

	int stockwerk;

	Moebel moebel[];



	public Raum (String _raumName, double _grundFlaeche) {

		raumName = _raumName;

		O2Tower.anzahlRaeume ++;
		moebel = new Moebel [11];
		anzahlFenster = 4; 
	}

	public Raum (String _raumName, double _grundFlaeche, int _stockwerk){

		this(_raumName,  _grundFlaeche);
		stockwerk = _stockwerk;

	}

	public Raum (String _raumName , double _grundFlaeche, int _stockwerk, String _nutzungsZweck ) {

		this(_raumName, _grundFlaeche, _stockwerk);
		nutzungsZweck = _nutzungsZweck;

	}

	public Raum (String _raumName , double _grundFlaeche, int _stockwerk, String _nutzungsZweck, int _anzahlFenster ) {

		this( _raumName , _grundFlaeche, _stockwerk, _nutzungsZweck );
		anzahlFenster = _anzahlFenster;

	}

	public String toString() {

		String info = "Raumname: " +raumName+ "\n";

		if(nutzungsZweck != null) {
			info += "Nutzungszweck: " +nutzungsZweck+ "\n" ;
		}

		if(grundFlaeche != 0) {
			info += "Grundfläche: " +grundFlaeche ;
		}

		if(anzahlFenster != KEINE_INFO ) {
			info += " Fenster: " +anzahlFenster;
		}

		return info;

	}


}
