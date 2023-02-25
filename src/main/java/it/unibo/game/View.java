package it.unibo.game;

import java.awt.Dimension;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
    private Label valueLabel;
    private Button incrementButton;
    private Button decrementButton;

    public View() throws IOException {
        
        /*valueLabel = new Label("0");

            incrementButton = new Button("Increment");
            decrementButton = new Button("Decrement");

            HBox buttonBox = new HBox(10);
            buttonBox.getChildren().addAll(incrementButton, decrementButton);


            VBox root = new VBox(30);
            root.setPadding(new Insets(10));
            root.getChildren().addAll(valueLabel, buttonBox); */
         
        // Set up the stage
        /*creo una finestra in base la dimensione dello schermo in cui viene 
        * lanciata l'applicazione
        Parent root = FXMLLoader.load(getClass().getResource(""));
        */
        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/counter.fxml"));
        
        try {
            Stage stage = new Stage();
            Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            stage.setMinWidth(screenSize.getWidth() / 3);
            stage.setMinHeight(screenSize.getHeight() / 2);
            stage.setScene(new Scene(root, stage.getMinWidth(), stage.getMinHeight()));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void setValueLabel(int value) {
        valueLabel.setText(Integer.toString(value));
    }

    public Button getIncrementButton() {
        return incrementButton;
    }

    public Button getDecrementButton() {
        return decrementButton;
    }
}

