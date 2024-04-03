package Classes;

import Functions.Pictures;
import java.io.Serializable;
import javax.swing.ImageIcon;

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
    private boolean running;           // Estado del juego, si se esta ejecutando es true, de lo contrario es false

    // Constructor de Game
    public Game(int numOfPokemon) {
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

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    // Funciones basicas para el sistema
    public void prepareGame(int numOfPokemon) {
        this.setRelationship(this.createRelationShip(numOfPokemon));
        this.setRunning(false);
    }

    public void StartGame(int numOfPokemon) {
        this.setRunning(true);

        while (this.running) {
            this.updateValues();
        }

    }

    public void continueGame() {
        this.setRunning(true);
    }

    public void StopGame() {
        this.setRunning(false);
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

        toReturn = "Resumen de prueba:" + "\n" + "Tiempo de juego: " + getTimeToShow() + "\n" + "Watts: " + getWatts();
        // Hacer con un stringBuilder y agregar el resto de los elementos

        return toReturn;
    }

    public Pokemon getPokemonOfRelationShip() {
        Pokemon toReturn = null;

        toReturn = this.getRelationship().getCurrentPokemon();

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
            name = "";              // Colocar

        } else {
            name = "";              // Colocar
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

    //Funciones para los botones
}
