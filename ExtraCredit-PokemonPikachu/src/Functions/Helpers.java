/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Diego Mendez
 */
public class Helpers {
    public void saveExist() {
    File archivo = new File(System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        System.out.println(archivo.exists());
    }
    public void crearSave() throws IOException {
        
        FileWriter pokeFichero = new FileWriter (System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        pokeFichero.write("pepino");
        pokeFichero.close();
    }
    public void borrarArchivo() {
        File archivo = new File(System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        if (archivo.delete()) {
   
        } else{
   
        }
    }
}
