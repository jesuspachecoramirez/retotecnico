package Archivo;

import Vista.Ingresos_vista;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PersistenciaDao {

    private persistencia pr;
    private Ingresos_vista in;
    private PersistenciaDto dto;
    private Archivo archivo;

    public PersistenciaDao(Archivo archivo) {
        this.archivo = archivo;
    }

    public String ingreso(String nombre, long puntos, ArrayList<persistencia> usuarios, File file) {
        persistencia nuevo = new persistencia(nombre, puntos);
        String exito = "";
        usuarios.add(nuevo);
        archivo.escribirArchivo(usuarios, file);
        return exito;

    }

    public String directorio(ArrayList<persistencia> usuarios) {
        in = new Ingresos_vista();
        dto = new PersistenciaDto();
        in.informacion("\nDatos de los jugadores:" + "\n");
        String listado = "";
        for (persistencia jugadores : usuarios) {
            listado = listado.concat(jugadores.toString());

        }
        return listado;

    }

    

}
