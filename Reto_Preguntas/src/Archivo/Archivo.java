
package Archivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Archivo {
     private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    

   
    public Archivo(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {

            }
        }

    }

   
    public void escribirArchivo(ArrayList<persistencia> usuarios, File file) {
        try {
            setSalida(new ObjectOutputStream(new FileOutputStream(file)));
            getSalida().writeObject(usuarios);
            getSalida().close();

        } catch (FileNotFoundException ex) {
            
        } catch (IOException e) {
            
        }

    }

   
    public ArrayList<persistencia> leerArchivo(File file) {
        ArrayList<persistencia> usuarios= new ArrayList<persistencia>();
        if (file.length() != 0) {
            try {
                setEntrada(new ObjectInputStream(new FileInputStream(file)));
                usuarios = (ArrayList<persistencia>) getEntrada().readObject();
                getEntrada().close();
            } catch (FileNotFoundException ex) {
                

            } catch (IOException | ClassNotFoundException ex) {
                
            }
        }

        return usuarios;
    }

    
    public ObjectInputStream getEntrada() {
        return entrada;
    }

   
    public void setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
    }

   
    public ObjectOutputStream getSalida() {
        return salida;
    }

    
    public void setSalida(ObjectOutputStream salida) {
        this.salida = salida;
    }
}



