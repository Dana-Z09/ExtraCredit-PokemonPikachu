/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.ImageIcon;

/**
 *
 * @author AresR
 */
public class EmotionalState {

    private String name;    // Nombre del estado emocional
    private ImageIcon image; // Imagen asociada al estado emocional

    // Constructor para crear un nuevo estado emocional con nombre e imagen.
    public EmotionalState(String name, ImageIcon image) {
        this.name = name;
        this.image = image;
    }

    // Método getter para obtener el nombre del estado emocional.
    public String getName() {
        return name;
    }

    // Método setter para establecer el nombre del estado emocional.
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para obtener la imagen del estado emocional.
    public ImageIcon getImage() {
        return image;
    }

    // Método setter para establecer la imagen del estado emocional.
    public void setImage(ImageIcon image) {
        this.image = image;
    }
}
