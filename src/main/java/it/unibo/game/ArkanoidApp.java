package it.unibo.game;

import java.awt.Dimension;

import javafx.application.Application;
import javafx.stage.Stage;

public final class ArkanoidApp extends Application {

    private Model model;
    private View view;

    @Override
    public void start(Stage primaryStage) throws Exception {
        model = new Model();
        view = new View(primaryStage);

        // Wire up the increment button
        view.getIncrementButton().setOnAction(EventHandler -> {
            model.incrementValue();
            view.setValueLabel(model.getValue());
        });

        // Wire up the decrement button
        view.getDecrementButton().setOnAction(EventHandler->{
                model.decrementValue();
                view.setValueLabel(model.getValue());
        });
    }
}
