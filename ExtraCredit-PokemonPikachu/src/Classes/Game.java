/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author AresR
 */
public class Game {
    
    private long startTime; // Momento de inicio del juego en milisegundos.
    private int timeInSeconds; // Tiempo transcurrido en segundos desde el inicio.
    private String timeToShow; // Tiempo transcurrido en formato HH:mm:ss.
    private int watts; // Balance actual del jugador en watts (dinero del juego).
    private RelationShip relationship; // La relación actual con los Pokémon.

    // Otros atributos necesarios...

    // Constructor de Game
    public Game() {
        this.startTime = System.currentTimeMillis();
        this.timeInSeconds = 0;
        this.timeToShow = formatTime(0, 0, 0);
        
        // Inicializa otros atributos como watts y relación.
        this.watts = 0;
        //this.relationship = new RelationShip();
        // ... inicialización de otros atributos necesarios.

        /*
        
        Codigo de la prueba realizada
    Se debe colocar un while para el tiempo.
    
    Game game = new Game();

    // Ejecuta un bucle para actualizar y mostrar el tiempo cada segundo.
        
        while (true) {
            
            System.out.println("Tiempo transcurrido: " + game.getTimeToShow());
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre actualizaciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
     */
    }

    // Actualiza el tiempo transcurrido y el formato del tiempo mostrado.
    public void updateTime() {
        long currentTime = System.currentTimeMillis();
        this.timeInSeconds = (int) ((currentTime - this.startTime) / 1000);
        this.watts += 1; // Añade 1 watt por cada segundo transcurrido.
        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds % 3600) / 60;
        int seconds = timeInSeconds % 60;
        this.timeToShow = formatTime(hours, minutes, seconds);
    }

    // Formatea el tiempo en horas, minutos y segundos.
    private String formatTime(int hours, int minutes, int seconds) {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Método para obtener el tiempo transcurrido en formato de cadena.
    public String getTimeToShow() {
        return timeToShow;
    }

    // Obtiene el balance actual de watts del jugador.
    public int getWatts() {
        return watts;
    }

    // Añade o sustrae watts del balance del jugador.
    public void setWatts(int amount) {
        this.watts += amount;
        // Validar que los watts no sean negativos. (Validar amount)
    }

    // Dani, por aqui deberia estar inventario
    public void goToShop() {
        
    }

    // Hacer recorrido del AVL en el orden necesario para imprimir esa vaina bien
    public void recordOfInventory(){
        
    }
    
    // Seleccionar pokemon para el juego
    public void viewPokemons() {
    }

    // Juegos

    // Método para ejecutar acciones de prueba.
    public String summaryToTest() {
        String toReturn;
        
        toReturn = "Resumen de prueba:"+"\n" + "Tiempo de juego: "+getTimeToShow()+"\n"+"Watts: " + getWatts();
        // Hacer con un stringBuilder y agregar el resto de los elementos
        
        return toReturn;
    }
}