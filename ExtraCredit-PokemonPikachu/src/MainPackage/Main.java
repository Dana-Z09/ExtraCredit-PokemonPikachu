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
        game.startGame();

        // Ejecuta un bucle para actualizar y mostrar el tiempo cada segundo.
        while (true) {
            game.updateTime();
            System.out.println("Tiempo transcurrido: " + game.getTimeToShow());
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre actualizaciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
