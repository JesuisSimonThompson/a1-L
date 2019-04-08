package gebaeudeVerwaltung;

public class Test {

	public static void main(String[] args) {

		O2Tower märzO2Tower = new O2Tower ();


		System.out.println(märzO2Tower);

		Anfrage anfrUmzug = new Anfrage ("Name Unternehmen");
		anfrUmzug.anfrageUmzugSenden ();
	}
}
