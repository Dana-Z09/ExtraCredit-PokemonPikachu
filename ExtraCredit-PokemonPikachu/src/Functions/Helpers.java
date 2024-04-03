package Functions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
    
    public void saveExist() {
    File archivo = new File(System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        System.out.println(archivo.exists());
    }
    public void crearSave() throws IOException {
        
        FileWriter pokeFichero = new FileWriter (System.getProperty("user.dir") + "\\src\\PokeFile\\pokesave.txt");
        pokeFichero.write("pepino");
        pokeFichero.close();
    }
}
