package MainPackage;

import Classes.Game;

/**
 *
 * @author Daniela Zambrano, Arez Ramirez, Diego Mendez
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game game = new Game();

        while (true) {
            game.updateTime();  // Actualiza el tiempo y los watts
            System.out.println(game.summaryToTest());
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre actualizaciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
