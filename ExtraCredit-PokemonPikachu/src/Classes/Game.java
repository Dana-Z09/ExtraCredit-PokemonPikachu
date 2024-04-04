package Classes;

import Functions.Pictures;
import EDD.AVLTree;
import EDD.NodeAVL;
import Functions.Helpers;
import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author AresR
 */
public class Game implements Serializable {

    private long startTime;            // Momento de inicio del juego en milisegundos.
    private int timeInSeconds;         // Tiempo transcurrido en segundos desde el inicio.      
    private String timeToShow;         // Tiempo transcurrido en formato HH:mm:ss.              
    private int watts;                 // Balance actual del jugador en watts (dinero del juego).       
    private RelationShip relationship; // La relación actual con los Pokémon.
    private boolean canSecondPokemon;

    // Constructor de Game
    public Game() {
        this.startTime = System.currentTimeMillis();
        this.timeInSeconds = 0;
        this.timeToShow = formatTime(0, 0, 0);
        this.watts = -1;
        this.relationship = null;
        this.canSecondPokemon = false;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public String getTimeToShow() {
        return timeToShow;
    }

    public void setTimeToShow(String timeToShow) {
        this.timeToShow = timeToShow;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public RelationShip getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationShip relationship) {
        this.relationship = relationship;
    }

    public boolean getCanSecondPokemon() {
        return canSecondPokemon;
    }

    public void setCanSecondPokemon(boolean canSecondPokemon) {
        this.canSecondPokemon = canSecondPokemon;
    }

    // Funciones basicas para el sistema
    public void prepareGame(int numOfPokemon) {
        this.setRelationship(this.createRelationShip(numOfPokemon));
    }

    public Game LoadGame() {
        Helpers help = new Helpers();
        try {
            return help.cargarSave();
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No hay información guardada de una partida previa.\nInténtelo nuevamente o inicie un nuevo juego.", "Error de Guardado", ERROR_MESSAGE, null);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se ha cargado correctamente la información de la partida.\nInténtelo nuevamente.", "Error de Guardado", ERROR_MESSAGE, null);
            return null;
        }
    }

    public void SaveGame() {
        Helpers help = new Helpers();
        try {
        help.guardarSave(this);
        JOptionPane.showMessageDialog(null, "Se ha guardado correctamente la información de la partida.", "Guardado Exitoso", INFORMATION_MESSAGE, null);
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(null, "No se ha guardado correctamente la información de la partida.\nInténtelo nuevamente.", "Error de Guardado", ERROR_MESSAGE, null);
            
        }
    }    

    // Actualiza el tiempo transcurrido y el formato del tiempo mostrado.
    public void updateValues() {

        long currentTime = System.currentTimeMillis();
        this.timeInSeconds = (int) ((currentTime - this.startTime) / 1000);
        this.watts += 1; // Añade 1 watt por cada segundo transcurrido.
        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds % 3600) / 60;
        int seconds = timeInSeconds % 60;
        this.timeToShow = formatTime(hours, minutes, seconds);
        this.relationship.actualizateRelationShipRange();           //Actualiza el rango de la relacion
        this.updatePhoto(this.getWatts());

        if (!canSecondPokemon) {
            this.setCanSecondPokemon(this.verifyCanSecondPokemon());
        }

    }

    public void updatePhoto(int watts) {

        switch (watts) {
            case 2000 -> {
                EmotionalState newState = this.getRelationship().getCurrentPokemon().getPokemonStates()[1];
                this.getRelationship().getCurrentPokemon().setCurrentState(newState);
            }
            case 4000 -> {
                EmotionalState newState = this.getRelationship().getCurrentPokemon().getPokemonStates()[2];
                this.getRelationship().getCurrentPokemon().setCurrentState(newState);
            }
            case 6000 -> {
                EmotionalState newState = this.getRelationship().getCurrentPokemon().getPokemonStates()[3];
                this.getRelationship().getCurrentPokemon().setCurrentState(newState);
            }
            case 8000 -> {
                EmotionalState newState = this.getRelationship().getCurrentPokemon().getPokemonStates()[4];
                this.getRelationship().getCurrentPokemon().setCurrentState(newState);
            }
            default -> {

            }
        }

    }

    // Formatea el tiempo en horas, minutos y segundos.
    private String formatTime(int hours, int minutes, int seconds) {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Método para ejecutar acciones de prueba.
    public String summaryToTest() {
        String toReturn;

        toReturn = "Resumen de prueba:" + "\n" + "Tiempo de juego: " + getTimeToShow() + "\n" + "Watts: " + getWatts() + "\n";
        // Hacer con un stringBuilder y agregar el resto de los elementos

        return toReturn;
    }

    public String getNamePokemonOfRelationShip() {
        String toReturn;
        Pokemon PokemonInGame = null;

        PokemonInGame = this.getRelationship().getCurrentPokemon();
        toReturn = PokemonInGame.getName();

        return toReturn;
    }

    public RelationShip createRelationShip(int numOfPokemon) {
        RelationShip toReturn;

        Pokemon newPokemon = createPokemon(numOfPokemon);

        RelationShip newRelationShip = new RelationShip(newPokemon);

        toReturn = newRelationShip;

        return toReturn;
    }

    public Pokemon createPokemon(int numOfPokemon) {
        Pokemon toReturn;
        String name;
        EmotionalState[] states = this.createEmotionalStates(numOfPokemon);

        if (numOfPokemon == 1) {
            name = "Shinx";

        } else {
            name = "Pikachu";
        }

        toReturn = new Pokemon(name, states);

        return toReturn;
    }

    public EmotionalState[] createEmotionalStates(int numOfPokemon) {
        EmotionalState[] states = new EmotionalState[5];

        Pictures photos = new Pictures();

        if (numOfPokemon == 1) {        // Primer pokemon reemplazar los photos.get con la direccion deseada

            // sigh             
            String name1 = "Fatigado";
            ImageIcon stateSigh = photos.getSighShinxPic();
            EmotionalState toAddIn0 = new EmotionalState(name1, stateSigh);
            states[0] = toAddIn0;

            // sad
            String name2 = "Triste";
            ImageIcon stateSad = photos.getDeterminationShinxPic();
            EmotionalState toAddIn1 = new EmotionalState(name2, stateSad);
            states[1] = toAddIn1;

            // normal
            String name3 = "Normal";
            ImageIcon stateNormal = photos.getNormalShinxPic();
            EmotionalState toAddIn2 = new EmotionalState(name3, stateNormal);
            states[2] = toAddIn2;

            // happy
            String name4 = "Feliz";
            ImageIcon statehappy = photos.getHappyShinxPic();
            EmotionalState toAddIn3 = new EmotionalState(name4, statehappy);
            states[3] = toAddIn3;

            // Inspired
            String name5 = "Inspirado";
            ImageIcon stateInspired = photos.getInspireShinxPic();
            EmotionalState toAddIn4 = new EmotionalState(name5, stateInspired);
            states[4] = toAddIn4;

        } else {                        //Segundo Pokemon reemplazar los photos.get con la direccion deseada

            // sigh 
            String name1 = "Fatigado";
            ImageIcon stateSigh = photos.getSighPikachuPic();
            EmotionalState toAddIn0 = new EmotionalState(name1, stateSigh);
            states[0] = toAddIn0;

            // sad
            String name2 = "Triste";
            ImageIcon stateSad = photos.getDeterminationPikachuPic();
            EmotionalState toAddIn1 = new EmotionalState(name2, stateSad);
            states[1] = toAddIn1;

            // normal
            String name3 = "Normal";
            ImageIcon stateNormal = photos.getNormalPikachuPic();
            EmotionalState toAddIn2 = new EmotionalState(name3, stateNormal);
            states[2] = toAddIn2;

            //Happy
            String name4 = "Feliz";
            ImageIcon statehappy = photos.getHappyPikachuPic();
            EmotionalState toAddIn3 = new EmotionalState(name4, statehappy);
            states[3] = toAddIn3;

            // Inspired
            String name5 = "Inspirado";
            ImageIcon stateInspired = photos.getInspirePikachuPic();
            EmotionalState toAddIn4 = new EmotionalState(name5, stateInspired);
            states[4] = toAddIn4;
        }
        return states;
    }

    public boolean verifyCanSecondPokemon() {
        if (this.watts == 8000) {
            return true;
        } else {
            return false;
        }

    }

    //Funcionalidades 
    
    // Funciones de la tienda e inventario
    
    public void buyGiftInShop(String name, int cost, int relationshipBoost) {

        if (this.getWatts() < cost) {
            JOptionPane.showMessageDialog(null, "No posee los watts suficientes.");
        } 
        else {
            this.decreaseWatts(cost);
            JOptionPane.showMessageDialog(null, "Compra realizada.");
            
            try {
                Gift GiftWithNewQuantity, GiftInTree;

                // Arbol para obtener el nodo
                AVLTree inventoryOfPokemon = this.getRelationship().getCurrentPokemon().getInventory();
                
                // Gift guardado en el nodo
                GiftInTree = (Gift) inventoryOfPokemon.SearchNodeInAVL(inventoryOfPokemon.getRoot(), cost).getContent();

                //Aumento su cantidad
                GiftInTree.upgradeQuantity();

                //Le doy el valor a nuevo al objeto a agregar
                GiftWithNewQuantity = GiftInTree;

                //Agrego el nuevo objeto Gift al nodo en el arbol
                this.getRelationship().getCurrentPokemon().getInventory().insertNewDataInNode(this.getRelationship().getCurrentPokemon().getInventory().getRoot(), cost, GiftWithNewQuantity);

                JOptionPane.showMessageDialog(null, "Cantidad actualizada en el inventario.");

            } catch (Exception e) {
                
                // Creo el objeto Gift
                Gift newGift = new Gift(name, cost, relationshipBoost);

                try {
                    // Inserto en el arbol
                    this.getRelationship().getCurrentPokemon().getInventory().insert(newGift);
                    JOptionPane.showMessageDialog(null, "Guardado en el inventario.");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al insertar en el arbol.");
                }   
            }
            JOptionPane.showMessageDialog(null, "Llegó.");
        }   
    }

    public String makeSummaryForRecord(){
        String toReturn;
        
        AVLTree tree = this.getRelationship().getCurrentPokemon().getRecordOfGifts();
        
        StringBuilder temp = new StringBuilder();
        toReturn = this.getRelationship().getCurrentPokemon().getRecordOfGifts().inorden(tree.getRoot(), temp);
        
        return toReturn;
    }
       
    public void giveGiftOfInventory(){
        
        AVLTree inventory = this.getRelationship().getCurrentPokemon().getInventory();
        
        
    }
    
    public void decreaseWatts(int numToReduce) {
        if (this.getWatts() > 0) {
            int current = this.getWatts();
            int newValue = current - numToReduce;
            this.setWatts(newValue);
        }
    }

    public void increaseWatts(int numToIncrease) {
        if (this.getWatts() > 0) {
            int current = this.getWatts();
            int newValue = current + numToIncrease;
            this.setWatts(newValue);
        }
    }
    
    
}
