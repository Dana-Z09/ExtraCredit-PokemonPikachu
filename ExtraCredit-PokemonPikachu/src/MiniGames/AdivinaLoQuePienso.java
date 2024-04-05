/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniGames;

import Classes.Gift;
import EDD.AVLTree;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Username
 */
public class AdivinaLoQuePienso {
    public int Adivina(int wattsApostados, AVLTree historialObjetos) {
        //Convierte el arbol a un array
        ArrayList historial = historialObjetos.inordenArray(historialObjetos.getRoot());
        //ArrayUsado para contener los objetos posibles
        String[] rango = {"Baya Aranja","Baya Caquic", "Pokeball","Baya Zreza","Baya Zanama","Baya Ziuela","Baya Zidra", "Baya Enigma", "Caramelo raro"};
        int answer = JOptionPane.showOptionDialog(null, "   En que objeto piensa el Pokemon?  " ,"Juego Adivina lo que pienso" , JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rango, rango[0]);
        //La respuesta depende de que objeto se haya elegido en el Optiondialog, usando la lenght del array rango
        System.out.println(answer);
        //Este array es de probabilidades, mientras mas aparezca un numero ahi mas probable sera que coincida con el escogido en el Joptiondialog
        ArrayList objetosRecibidosPosibles = new ArrayList();
        //Recorre la ArrayList de hsitorial
        for (int i = 0; i < historial.size(); i++) {
            Gift objetoActual = (Gift) historial.get(i);
            //El numero sale dependiendo de la quantity de ese objeto en esa posicion del primer ArrayList
            for (int j = 0; j < objetoActual.getQuantity(); j++) {   
                objetosRecibidosPosibles.add(i);
            }
        }
        Random randomNumber1 = new Random();
        //Se crea un numero aleatorio entre 0 y la length del ArrayList objetosrecibidosPosible
        int numRandom = randomNumber1.nextInt(objetosRecibidosPosibles.size());
        //Luego se toma el numero qeu este en la posicion que haya dicho numRandom
        int numObjeto = (int) objetosRecibidosPosibles.get(numRandom);
        //Si el numObjeto coincide con la posicion del ArrayList historial que elegio el jugador entonces se ganan los watts
        if (answer == numObjeto) {
            //Prueba en terminal
            System.out.println("Ganaste, coincidio " + answer +"con " + numObjeto);
            JOptionPane.showMessageDialog(null, "yippiee");
            return wattsApostados;
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste");
            return -wattsApostados;
        }
    }
}
