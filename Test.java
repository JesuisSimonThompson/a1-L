package gebaeudeVerwaltung;

public class Test {

	public static void main(String[] args) {

		O2Tower m�rzO2Tower = new O2Tower ();


		System.out.println(m�rzO2Tower);

		Anfrage anfrUmzug = new Anfrage ("Name Unternehmen");
		anfrUmzug.anfrageUmzugSenden ();
	}
}
