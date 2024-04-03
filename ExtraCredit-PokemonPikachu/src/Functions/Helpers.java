/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import java.io.File;

/**
 *
 * @author Diego Mendez
 */
public class Helpers {
    public void saveExist() {
    File archivo = new File(System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        System.out.println(archivo.exists());
    }
}
