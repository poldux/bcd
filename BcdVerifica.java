package verificaTpsitGiacomo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BcdVerifica extends Application {
 TextField tNum = new TextField("");
 Label lRis = new Label();
 Button bCalcola = new Button("calcola");
 public void start(Stage finestra) {
	 GridPane griglia = new GridPane();
	 Scene scena = new Scene(griglia);
		
		griglia.add(tNum, 0, 0);
		griglia.add(bCalcola, 0, 1);
		griglia.add(lRis, 0, 2);
	
		griglia.setAlignment(Pos.CENTER);
		griglia.setPadding(new Insets(10));
		griglia.setHgap(10);
		griglia.setVgap(10);
		finestra.setScene(scena);
		finestra.setTitle("BCD");
		finestra.show();
		
		bCalcola.setOnAction(e->calcolo());
	}
 public void calcolo() {
	 
 }
 

public static void main(String[] args) {
		launch(args);
	}
}

