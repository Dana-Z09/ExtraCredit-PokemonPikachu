package Functions;

import Classes.Game;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Diego Mendez
 */
public class Helpers {
    
    public boolean existCSV(){//esta funcion revisa si existe o no el archivo principal de CSV
        //el cual va a estar guardado en una carpeta preterminada del proyecto
        //regresa true cuando existe
        //false cuando no se consigue
        //@diego esta encargado
    return true;
    }
    
    public boolean saveExist() {
    File archivo = new File(System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
    if (archivo.exists()) {
        return true;
    } else {
        return false;
    }
       
    }
    public void guardarSave(Game juegoGuardado) throws IOException {
        juegoGuardado.prepareGame(1);
        File archivo = new File(System.getProperty("user.dir") + "\\src\\Pokefile\\pokesave.txt");
        FileOutputStream direccion = new FileOutputStream(archivo);
        ObjectOutputStream serializador = new ObjectOutputStream(direccion);
        serializador.writeObject(juegoGuardado);
        serializador.close();
    }
    
    public Game cargarSave() throws IOException, ClassNotFoundException {
        File archivo = new File(System.getProperty("user.dir") + "\\src\\Pokefile\\pokesave.txt");
        FileInputStream direccion = new FileInputStream(archivo);
        ObjectInputStream serializador = new ObjectInputStream(direccion);
        System.out.println("a");
        Game Jueguino = (Game) serializador.readObject();
        Jueguino.prepareGame(1);
        serializador.close();
        return Jueguino;
                
        
        
    }
    public void borrarArchivo() {
        File archivo = new File(System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        if (archivo.delete()) {
   
        } else{
   
        }
    }
    
    
}
