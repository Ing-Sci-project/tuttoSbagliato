package it.unibo.game;

import javafx.geometry.Insets;
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

    public View() {
        valueLabel = new Label("0");

        incrementButton = new Button("Increment");
        decrementButton = new Button("Decrement");

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(incrementButton, decrementButton);

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(valueLabel, buttonBox);

        // Set up the stage
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
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

