package verificaTpsitGiacomo;

import java.util.Hashtable;

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
	 String v[]= tNum.getText().split(""); 
	 String bcd="";
	 Hashtable<String,String> convertitore = new Hashtable<String, String>();
	 convertitore.put("0", "0000");
	 convertitore.put("1", "0001");
	 convertitore.put("2", "0010");
	 convertitore.put("3", "0011");
	 convertitore.put("4", "0100");
	 convertitore.put("5", "0101");
	 convertitore.put("6", "0110");
	 convertitore.put("7", "0111");
	 convertitore.put("8", "1000");
	 convertitore.put("9", "1001");
	 
	 for(int i=0; i<v.length;i++) {
		 bcd+=convertitore.get(v[i]);
	 }
	 lRis.setText(bcd);
 }
 

public static void main(String[] args) {
		launch(args);
	}
}

