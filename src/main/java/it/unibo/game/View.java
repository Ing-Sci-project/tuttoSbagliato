package it.unibo.game;

import java.awt.Dimension;
import java.io.IOException;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class View  {
    @FXML
    private Label valueLabel;
    @FXML
    private Button decBtn;
    @FXML
    private Button incBtn;
    final Parent root;

    public View(Stage primaryStage) throws IOException {
        root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/Counter.fxml"));
        /*dimensiono la finestra di avvio in base alla grandezza dello schermo */
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        primaryStage.setMinWidth(screenSize.getWidth() / 3);
        primaryStage.setMinHeight(screenSize.getHeight() / 2);
        primaryStage.setTitle("Arkanoid");
        primaryStage.setScene(new Scene(root, primaryStage.getMinWidth(), primaryStage.getMinHeight()));
        primaryStage.show();

    }

    public void setValueLabel(int value) {
        valueLabel.setText(Integer.toString(value));
    }

    public Button getIncrementButton() {
        return incBtn;
    }

    public Button getDecrementButton() {
        return decBtn;
    }
}
