package reto_preguntas;

import Archivo.Archivo;
import Archivo.PersistenciaDto;
import Archivo.persistencia;
import Preguntas.Categorias;
import Vista.Ingresos_vista;


public class Reto_Preguntas {

 
    private static PersistenciaDto dto;
    private static Categorias cat;
    private static Ingresos_vista in;


    public static void main(String[] args) {
        dto = new PersistenciaDto();
        in = new Ingresos_vista();
        cat = new Categorias();

        Opciones();
    }

    public static void Opciones() {
        int opcion = 0;
        while (opcion != 3) {
            String menu = "Bienvenido a este Juego de Preguntas" + "\n"
                    + "Seleccione una opción :" + "\n"
                    + "1. Jugar" + "\n"
                    + "2. Ver puntajes" + "\n"
                    + "3. Salir" + "\n"
                    + "Selecionado:";

            opcion = in.respuesta(menu);
            int base = 20;
            int puntos = 0;
            int sol = 0;
            String c = "";

            switch (opcion) {
                case 1: {
                    String nombre = in.texto("Ingrese su nombre de jugador");
                    in.informacion("Primera Pregunta (Nvl. Facil)");
                    cat.Categoria1();
                    sol = (int) in.numeros("Digite el numero de la respuesta que crea correcta");
                    if (sol == cat.getRc()) {
                        puntos = puntos + base;
                        System.out.println("La respuesta es correcta ha ganado " + base + " puntos\n");

                    } else {
                        System.out.println("Respuesta incorrecta, Gracias por jugar\n");
                        break;
                    }
                    in.informacion("Segunda Pregunta (Nvl. Medio-Facil)");
                    cat.Categoria2();
                    base = 30;
                    c = in.texto("Desea continuar S/N");
                    if (c.equalsIgnoreCase("S")) {

                    } else {
                        in.informacion(dto.getDao().ingreso(nombre, puntos, dto.getUsuarios(), dto.getFile()));
                        
                        break;
                    }
                    sol = (int) in.numeros("Digite el numero de la respuesta que crea correcta");
                    if (sol == cat.getRc()) {
                        puntos = puntos + base;
                        System.out.println("La respuesta es correcta ha ganado " + base + " puntos");
                        System.out.println("Llevas " + puntos + " puntos\n");

                    } else {
                        System.out.println("Respuesta incorrecta, Gracias por jugar\n");
                        break;
                    }
                    in.informacion("Tercera Pregunta (Nvl. Medio)");
                    cat.Categoria3();
                    base = 40;
                    c = in.texto("Desea continuar S/N");
                    if (c.equalsIgnoreCase("S")) {

                    } else {
                        in.informacion(dto.getDao().ingreso(nombre, puntos, dto.getUsuarios(), dto.getFile()));
                        break;
                    }
                    sol = (int) in.numeros("Digite el numero de la respuesta que crea correcta");
                    if (sol == cat.getRc()) {
                        puntos = puntos + base;
                        System.out.println("La respuesta es correcta ha ganado " + base + " puntos");
                        System.out.println("Llevas " + puntos + " puntos\n");
                    } else {
                        System.out.println("Respuesta incorrecta, Gracias por jugar\n");
                        break;
                    }
                    in.informacion("Cuarta Pregunta (Nvl. Medio-Dificil)");
                    cat.Categoria4();
                    base = 50;
                    c = in.texto("Desea continuar S/N");
                    if (c.equalsIgnoreCase("S")) {

                    } else {
                        in.informacion(dto.getDao().ingreso(nombre, puntos, dto.getUsuarios(), dto.getFile()));
                        break;
                    }
                    sol = (int) in.numeros("Digite el numero de la respuesta que crea correcta");
                    if (sol == cat.getRc()) {
                        puntos = puntos + base;
                        System.out.println("La respuesta es correcta ha ganado " + base + " puntos");
                        System.out.println("Llevas " + puntos + " puntos\n");

                    } else {
                        System.out.println("Respuesta incorrecta, Gracias por jugar\n");
                        break;
                    }
                    in.informacion("Ultima Pregunta (Nvl. Dificil)");
                    cat.Categoria5();
                    base = 80;
                    c = in.texto("Desea continuar S/N");
                    if (c.equalsIgnoreCase("S")) {

                    } else {
                        in.informacion(dto.getDao().ingreso(nombre, puntos, dto.getUsuarios(), dto.getFile()));
                        break;
                    }
                    sol = (int) in.numeros("Digite el numero de la respuesta que crea correcta");
                    if (sol == cat.getRc()) {
                        puntos = puntos + base;
                        System.out.println("La respuesta es correcta ha ganado " + base + " puntos");
                        System.out.println("Felicidades has contestado todas las preguntas te llevas " + puntos + " puntos\n");
                        in.informacion(dto.getDao().ingreso(nombre, puntos, dto.getUsuarios(), dto.getFile()));
                    } else {
                        System.out.println("Respuesta incorrecta, Gracias por jugar\n");
                        break;
                    }

                    String conti = in.texto("Desea continuar jugando S/N: ");
                    if (conti.equalsIgnoreCase("S")) {
                        opcion = 0;
                    } else {
                        opcion = 3;
                        System.out.println("Gracias por jugar, Hasta pronto");
                    }
                    break;
                }

                case 2: {
                    in.informacion(dto.getDao().directorio(dto.getUsuarios()));
                    break;
                }

                case 3: {
                    System.out.println("Gracias por jugar, Hasta pronto");
                    break;
                }
                default:
                    in.informacion("Opcion no valida");

            }

        }

    }

    

}
