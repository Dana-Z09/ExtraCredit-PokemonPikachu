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
        for (int i = 0; i < historial.size(); i++) {
            Gift objetoActual = (Gift) historial.get(i);
            System.out.println(objetoActual.getCost());
            
        }
      return wattsApostados;
    }
}
