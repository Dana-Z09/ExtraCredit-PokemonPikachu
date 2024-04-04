package Games;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Mendez
 */
public class CartaAlta {
    public boolean cartaAlta() {
        Random randomNumber1 = new Random();
        int num1 = randomNumber1.nextInt(13)+1;
        String firstCard = convertToPoker(num1);
        String[] rango = {"Menor","Mayor"};
        Icon icono = new ImageIcon(getClass().getResource("pichu.png"));
        int answer = JOptionPane.showOptionDialog(null, "   Seleccione si la carta será mayor o menor que:    " +firstCard,"Juego carta mas alta" , JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icono, rango, rango[0]);
        int num2 = randomNumber1.nextInt(13)+1;
        String secondCard = convertToPoker(num2);
        
        if (num1>num2 && answer == 0) {
            JOptionPane.showMessageDialog(null, "La segunda carta es " + secondCard + ", Ganaste!");
            return true;
            
        } else if (num1<num2 && answer == 0) {
            JOptionPane.showMessageDialog(null, "La segunda carta es " + secondCard + ", Perdiste!");
            return false;
            
        } else if (num1>num2 && answer == 1) {
            JOptionPane.showMessageDialog(null, "La segunda carta es " + secondCard + ", Perdiste!");
            return false;
                   
        } else if (num1<num2 && answer == 1) {
            JOptionPane.showMessageDialog(null, "La segunda carta es " + secondCard + ", Ganaste!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "La segunda carta es " + secondCard + ", Perdiste!");
            return false;
        }
    }
    
    public String convertToPoker(int RandomNumber){
        
         switch(RandomNumber) {
            case 1:
               return "A";
            case 11:
               return "J";
            case 12:
               return "Q";  
            case 13:
               return "K";
            default:
                return Integer.toString(RandomNumber);
        }
    }
}
