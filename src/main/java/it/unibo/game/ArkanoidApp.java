package it.unibo.game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public final class ArkanoidApp extends Application{
    
    private Model model;
    private View view;

    @Override
    public void start(Stage primaryStage) throws Exception {
        model = new Model();
        view = new View();


        // Wire up the increment button
        view.getIncrementButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.incrementValue();
                view.setValueLabel(model.getValue());
            }
        });

        // Wire up the decrement button
        view.getDecrementButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.decrementValue();
                view.setValueLabel(model.getValue());
            }
        });
    }

    @Override
    public void stop() throws Exception {
       
        super.stop();
    }
}
