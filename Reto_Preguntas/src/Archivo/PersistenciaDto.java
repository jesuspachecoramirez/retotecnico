
package Archivo;

import Vista.Ingresos_vista;
import java.io.File;
import java.util.ArrayList;
import reto_preguntas.Reto_Preguntas;

public class PersistenciaDto {
    private ArrayList<persistencia>usuarios;
    private PersistenciaDao dao;
    private File file=new File("Juego.dat");
    private Archivo archivo;
    
    
    public PersistenciaDto(){
        usuarios=new ArrayList<persistencia>();
        archivo=new Archivo(getFile());
        dao=new PersistenciaDao(getArchivo());
        usuarios= archivo.leerArchivo(file);
    }

    /**
     * @return the usuarios
     */
    public ArrayList<persistencia> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ArrayList<persistencia> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the dao
     */
    public PersistenciaDao getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(PersistenciaDao dao) {
        this.dao = dao;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @return the archivo
     */
    public Archivo getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

   } 