package it.unibo.game;

import java.io.FileNotFoundException;
import javafx.application.Application;

public class Runner {
    private Runner(){};

    /**
    * @param args
    *            ignored
    * @throws FileNotFoundException 
    */
   public static void main(final String... args) throws FileNotFoundException {
    Application.launch(ArkanoidApp.class);
}
}
