package it.unibo.game;

import java.io.FileNotFoundException;
import javafx.application.Application;

public final class ArkanoidApp {
    
    ArkanoidApp(){}
    /**
    * @param args
    *            ignored
    * @throws FileNotFoundException 
    */
   public static void main(final String... args) throws FileNotFoundException {
       Application.launch(Controller.class);
   }
}
