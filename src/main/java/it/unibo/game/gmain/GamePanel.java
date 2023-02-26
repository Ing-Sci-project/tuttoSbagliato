package it.unibo.game.gmain;

import javax.swing.JPanel;

import it.unibo.game.movingObjects.Ball;
import it.unibo.game.movingObjects.Pad;
import it.unibo.game.staticObjects.SuperBrick;
import it.unibo.game.tile.TileManager;



public class GamePanel extends JPanel implements Runnable{


    /*
     * Questa è la classe che gestisce tutti i componenti del gioco
     */



    //Sistema
    TileManager cellaManager = new TileManager();
    KeyHandler keyHandler = new KeyHandler();
    Thread gameThread;
    CollisionChecker collisionChecker = new CollisionChecker();
    ObjectPositioner posizionatoreOggetti = new ObjectPositioner();
    UI u = new UI();

    //Giocatore, Pallina e Mattoncini
    Pad player = new Pad();    
    Ball pallina = new Ball();
    SuperBrick superMattoncino[] = new SuperBrick[4];

    /*
     * Game State
     *
     */
    
    //Screen Settings
    public GamePanel() {

    }
    public void setupGame() {
        posizionatoreOggetti.setObject();
    }
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
        /*
         * 
         */
    }
    @Override
    public void run() {
        // GAME LOOP
        while(gameThread != null) {
            //Aggiorna le info
            //Disegna l'interfaccia con le info aggiornate
        }
    }
}
