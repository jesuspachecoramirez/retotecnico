package Preguntas;

import Vista.Ingresos_vista;

public class Categorias {

    private static Ingresos_vista in;
    private static Respuestas r;
    private static Respuestas2 r2;
    private static Respuestas3 r3;
    private static Respuestas4 r4;
    private static Respuestas5 r5;
    private int Rc=0;

    public Categorias() { //Controlador
        in = new Ingresos_vista();
        r = new Respuestas();
        r2 = new Respuestas2();
        r3 = new Respuestas3();
        r4 = new Respuestas4();
        r5 = new Respuestas5();
        
   
        /* Categoria1();
        Categoria2();
        Categoria3();
        Categoria4();
        Categoria5();*/
    }

    public void Categoria1() {
        
        int opc = (int) (Math.random() * 5);
        //System.out.println(opc);
        switch (opc) {
            case 0:
                in.informacion("¿En que orden estan los colores de la bandera de colombia?");
                in.informacion(r.getRespt1());
                Rc=3;
                break;
            case 1:
                in.informacion("¿En donde nacio y donde murio Simon Bolivar?");
                in.informacion(r.getRespt2());
                Rc=1;
                break;
            case 2:
                in.informacion("¿Cuál fue la primer ciudad del país en liberarse de la Corona Española?");
                in.informacion(r.getRespt3());
                Rc=1;
                break;
            case 3:
                in.informacion("¿A qué suceso histórico del país hace referencia Gabriel García Márquez en su obra 'Cien años de soledad'?");
                in.informacion(r.getRespt4());
                Rc=4;
                break;
            case 4:
                in.informacion("¿Quién tomó el poder del país, tras el golpe de Estado de 1953?");
                in.informacion(r.getRespt5());
                Rc=3;
                break;

        }

    }

    public void Categoria2() {
        int opc = (int) (Math.random() * 5);
        //System.out.println(opc);
        switch (opc) {
            case 0:
                in.informacion("¿Qué tipo de competición es el Giro de Italia? ");
                in.informacion(r2.getRespt1());
                Rc=2;
                break;
            case 1:
                in.informacion("¿Cuál es la última cinta que puedes conseguir en las artes marciales?");
                in.informacion(r2.getRespt2());
                Rc=4;
                break;
            case 2:
                in.informacion("Si juegas a la NFL ¿qué deporte practicas?");
                in.informacion(r2.getRespt3());
                Rc=3;
                break;
            case 3:
                in.informacion("¿Cuál es el deporte más popular en la India?");
                in.informacion(r2.getRespt4());
                Rc=2;
                break;
            case 4:
                in.informacion("¿Cuántos cubos coloreados hay en el Cubo de Rubik?");
                in.informacion(r2.getRespt5());
                Rc=2;
                break;
        }

    }

    public void Categoria3() {
        int opc = (int) (Math.random() * 5);
        //System.out.println(opc);
        switch (opc) {
            case 0:
                in.informacion("En Matrix ¿Que pastilla toma Neo?");
                in.informacion(r3.getRespt1());
                Rc=3;
                break;
            case 1:
                in.informacion("Que actriz interpreta a Mera en Acuaman");
                in.informacion(r3.getRespt2());
                Rc=1;
                break;
            case 2:
                in.informacion("Como se llamaba el dueño del Parque Jurasico en la pelicula");
                in.informacion(r3.getRespt3());
                Rc=3;
                break;
            case 3:
                in.informacion("Como se llama el arma que crea Thor para matar a Thanos");
                in.informacion(r3.getRespt4());
                Rc=1;
                break;
            case 4:
                in.informacion("Joaquin Phoenix recibió su primera nominación al Oscar por interpretar al emperador romano Cómodo ¿en que pelicula?");
                in.informacion(r3.getRespt5());
                Rc=4;
                break;

        }

    }

    public void Categoria4() {
        int opc = (int) (Math.random() * 5);
        //System.out.println(opc);
        switch (opc) {
            case 0:
                in.informacion("El elemento principal de la computadora, él cual coordina y realiza las operaciones del sistema es:");
                in.informacion(r4.getRespt1());
                Rc=4;
                break;
            case 1:
                in.informacion("¿Cuál es la unidad más pequeña de representación de información en un ordenador?");
                in.informacion(r4.getRespt2());
                Rc=3;
                break;
            case 2:
                in.informacion("¿El código binario está formado por?");
                in.informacion(r4.getRespt3());
                Rc=1;
                break;
            case 3:
                in.informacion("Cuando utilizamos el término QWERTY, nos estamos refiriendo a:");
                in.informacion(r4.getRespt4());
                Rc=2;
                break;
            case 4:
                in.informacion("¿Cuáles son las teclas de atajo usadas para borrar un archivo definitivamente sin que él vaya a la papelera de reciclaje?");
                in.informacion(r4.getRespt5());
                Rc=2;
                break;

        }

    }

    public void Categoria5() {
        int opc = (int) (Math.random() * 5);
       // System.out.println(opc);
        switch (opc) {
            case 0:
                in.informacion("¿Cuál de los siguientes cantantes pronunció la frase 'Prefiero que me odien por lo que soy a que me admiren por lo que nunca seré'?");
                in.informacion(r5.getRespt1());
                Rc=1;
                break;
            case 1:
                in.informacion("¿Cuál de estas canciones no es del grupo inmortal Queen?");
                in.informacion(r5.getRespt2());
                Rc=3;
                break;
            case 2:
                in.informacion("¿Cuándo nació el rap?");
                in.informacion(r5.getRespt3());
                Rc=2;
                break;
            case 3:
                in.informacion("¿De qué país era el grupo Europe autores de la canción 'The final countdown'?");
                in.informacion(r5.getRespt4());
                Rc=4;
                break;
            case 4:
                in.informacion("¿Cuál fue la primera grabación de Rock and Roll?");
                in.informacion(r5.getRespt5());
                Rc=2;
                break;

        }

    }

    /**
     * @return the Rc
     */
    public int getRc() {
        return Rc;
    }
}
