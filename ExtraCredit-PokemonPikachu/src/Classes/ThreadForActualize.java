
package Classes;

import Interfaces.MainMenu;
import javax.swing.SwingUtilities;

/**
 *
 * @author AresR
 */
public class ThreadForActualize extends Thread {

    private MainMenu mainMenu;

    public ThreadForActualize(MainMenu mainMenu) {
        super();
        this.mainMenu = mainMenu;
    }

    @Override
    public void run() {
        while (MainMenu.running) {
            try {
                // Actualiza los valores del juego.
                MainMenu.CurrentGame.updateValues();
                int currentRelationShip = MainMenu.CurrentGame.getRelationship().getRelationShipRange();

                if (currentRelationShip > 0) {
                    currentRelationShip--;
                }

                MainMenu.CurrentGame.getRelationship().setRelationShipRange(currentRelationShip);

                // Actualiza la interfaz de usuario con los valores más recientes.
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        mainMenu.updateLabels();
                    }
                });

                Thread.sleep(1000); // Espera un segundo antes de la próxima actualización.
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt(); // Restablece el estado de interrupción.
                return; // Sale del bucle si el hilo ha sido interrumpido.
            }
        }
    }

    /**
     *
     */
    public void stopThread() {
        MainMenu.running = false;
    }
}
