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

    // Inicia el juego y el contador de tiempo.
    public void startGame() {
        this.startTime = System.currentTimeMillis();
        this.timeInSeconds = 0;
        this.timeToShow = formatTime(0, 0, 0);
    }

    // Actualiza el tiempo transcurrido y el formato del tiempo mostrado.
    public void updateTime() {
        long currentTime = System.currentTimeMillis();
        this.timeInSeconds = (int) ((currentTime - this.startTime) / 1000);
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
}
