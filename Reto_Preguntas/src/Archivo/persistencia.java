
package Archivo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class persistencia implements Serializable {
     private static final long serialVersionUID = 7218875082596628525L;
       private String nombre;
       private long puntos;
       
       
       
       public persistencia(String nombre,long puntos){
           this.nombre=nombre;
           this.puntos=puntos;
           
       }
       public void lista() {

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntos
     */
    public long getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(long puntos) {
        this.puntos = puntos;
    }
    
    
    public String directorio(){
        String imprime="";
        imprime=("Nombre: "+this.getNombre()+"\n"+"Puntaje final: "+this.getPuntos()+"\n");
        return imprime;
    }
    @Override
    public String toString(){
        return this.getNombre()+" "+this.getPuntos()+"\n";
    }
}
