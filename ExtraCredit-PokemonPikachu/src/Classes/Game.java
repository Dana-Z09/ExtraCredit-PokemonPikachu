package Classes;


import Functions.Pictures;
import EDD.AVLTree;
import EDD.NodeAVL;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

    // Constructor de Game
    public Game() {
        this.startTime = System.currentTimeMillis();
        this.timeInSeconds = 0;
        this.timeToShow = formatTime(0, 0, 0);
        this.watts = -1;
        this.relationship = null;
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

        // Funciones basicas para el sistema
    public void prepareGame(int numOfPokemon) {
        this.setRelationship(this.createRelationShip(numOfPokemon));
    }

    public void LoadGame() {
        // Funciones de Diego
    }

    public void SaveGame() {
        // Funciones de Diego
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
    }

    // Formatea el tiempo en horas, minutos y segundos.
    private String formatTime(int hours, int minutes, int seconds) {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Método para ejecutar acciones de prueba.
    public String summaryToTest() {
        String toReturn;

        toReturn = "Resumen de prueba:" + "\n" + "Tiempo de juego: " + getTimeToShow() + "\n" + "Watts: " + getWatts()+"\n";
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
 
            // happy
            String name1 = "Feliz";
            ImageIcon statehappy = photos.getHappyShinxPic();
            EmotionalState toAddIn0 = new EmotionalState(name1, statehappy);
            states[0] = toAddIn0;

            // normal
            String name2 = "Normal";
            ImageIcon stateNormal = photos.getNormalShinxPic();
            EmotionalState toAddIn1 = new EmotionalState(name2, stateNormal);
            states[1] = toAddIn1;

            // Inspired
            String name3 = "Inspirado";
            ImageIcon stateInspired = photos.getInspireShinxPic();
            EmotionalState toAddIn2 = new EmotionalState(name3, stateInspired);
            states[2] = toAddIn2;

            // sad
            String name4 = "Triste";
            ImageIcon stateSad = photos.getDeterminationShinxPic();
            EmotionalState toAddIn3 = new EmotionalState(name4, stateSad);
            states[3] = toAddIn3;

            // sigh 
            String name5 = "Fatigado";
            ImageIcon stateSigh = photos.getSighShinxPic();
            EmotionalState toAddIn4 = new EmotionalState(name5, stateSigh);
            states[4] = toAddIn4;

        } else {                        //Segundo Pokemon reemplazar los photos.get con la direccion deseada

            //Happy
            String name1 = "Feliz";
            ImageIcon statehappy = photos.getHappyPikachuPic();
            EmotionalState toAddIn0 = new EmotionalState(name1, statehappy);
            states[0] = toAddIn0;

            // normal
            String name2 = "Normal";
            ImageIcon stateNormal = photos.getNormalPikachuPic();
            EmotionalState toAddIn1 = new EmotionalState(name2, stateNormal);
            states[1] = toAddIn1;

            // Inspired
            String name3 = "Inspirado";
            ImageIcon stateInspired = photos.getInspirePikachuPic();
            EmotionalState toAddIn2 = new EmotionalState(name3, stateInspired);
            states[2] = toAddIn2;

            // sad
            String name4 = "Triste";
            ImageIcon stateSad = photos.getDeterminationPikachuPic();
            EmotionalState toAddIn3 = new EmotionalState(name4, stateSad);
            states[3] = toAddIn3;

            // sigh 
            String name5 = "Fatigado";
            ImageIcon stateSigh = photos.getSighPikachuPic();
            EmotionalState toAddIn4 = new EmotionalState(name5, stateSigh);
            states[4] = toAddIn4;
        }

        return states;
    }

    //Funcionalidades 
    
    // Funciones de la tienda
    
    // comprar recibe el objeto gift
    
    public void buyGiftInShop(String name, int cost, int relationshipBoost){       

        // Pensar si se pasa el objeto gift o los 3 atributos separados
        /*
        Creo que mejor los tres separados porque quantity sera 1 y luego hay que 
        sumarlo y es como raro crear el objeto afuera si al final ese no es el objeto 
        que voy a agregar al nodo por quantity
        
        */
        
        if (this.getWatts()<cost) {
            JOptionPane.showMessageDialog(null, "No posee los watts suficientes.");
        } else {
           this.reduceWatts(cost);
           JOptionPane.showMessageDialog(null, "Compra realizada.");
           
            AVLTree inventoryOfPokemon = this.getRelationship().getCurrentPokemon().getInventory();
            
            NodeAVL inTree;
            try{
                inTree = inventoryOfPokemon.SearchNodeInAVL(inventoryOfPokemon.getRoot(), cost);
                
            }catch(Exception e){
                inTree = null;
                
            }
            
            if (inTree != null) {
                Gift GiftWithNewQuantity, GiftInTree;
                
                try{
                GiftInTree = (Gift) inventoryOfPokemon.SearchNodeInAVL(inventoryOfPokemon.getRoot(), cost).getContent();
                
                GiftInTree.upgradeQuantity();
                
                GiftWithNewQuantity = GiftInTree;  
                
                this.getRelationship().getCurrentPokemon().getInventory().insertNewDataInNode(this.getRelationship().getCurrentPokemon().getInventory().getRoot(), cost, GiftWithNewQuantity);
                
                JOptionPane.showMessageDialog(null, "Cantidad actualizada en el inventario.");
                
                } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error actualizando la cantidad en el inventario.");
                
                }
                
                
            } else {
                Gift newGift = new Gift(name,cost,relationshipBoost);
                
                try {
                    this.getRelationship().getCurrentPokemon().getInventory().insert(newGift);
                    JOptionPane.showMessageDialog(null, "Guardado en el inventario.");
                
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error al insertar en el arbol.");
                }           
            }
        }   
    }
    
    public void reduceWatts(int numToReduce){
        if (this.getWatts()>0) {
            int current = this.getWatts();
            int newValue = current - numToReduce;
            this.setWatts(newValue);
        }
    }
}
