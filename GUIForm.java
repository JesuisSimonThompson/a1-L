package gebaeudeVerwaltung;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import java.time.LocalDate;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class GUIForm extends Application {
	LocalDate datumAnfang ;
	LocalDate datumEnde;
	String nameUnternehmen; 

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Auftragsformular");

		Text textUnternehmen = new Text("Name des beauftragten Unternehmens: ");
		TextField tFieldUnternehmen = new TextField();

		Text textDatumAnf = new Text("Beginn der Arbeiten: ");
		DatePicker datePickerAnf = new DatePicker();

		Text textDatumEnde = new Text("Ende der Arbeiten: ");
		DatePicker datePickerEnde = new DatePicker ();

		Button button = new Button("Absenden");

		button.setOnAction(action -> {
			datumAnfang = datePickerAnf.getValue();
			datumEnde = datePickerEnde.getValue();
			nameUnternehmen = tFieldUnternehmen.getText();
			primaryStage.close();
		});

		GridPane gPane = new GridPane();
		gPane.add(textUnternehmen, 0,0);
		gPane.add(tFieldUnternehmen, 1,0);

		gPane.add(textDatumAnf, 0,1);
		gPane.add(datePickerAnf, 1, 1);

		gPane.add(textDatumEnde, 0, 2);
		gPane.add(datePickerEnde, 1, 2);

		gPane.add(button, 1, 3);

		Scene scene = new Scene(gPane, 400, 110);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}
}
