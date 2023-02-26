package src.main;

import javax.swing.JPanel;

import src.movingObjects.Ball;
import src.movingObjects.Pad;
import src.staticObjects.SuperBrick;
import src.tile.TileManager;

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
