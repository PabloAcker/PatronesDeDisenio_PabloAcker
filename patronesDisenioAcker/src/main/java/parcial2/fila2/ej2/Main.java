package segundoParcial.fila2.ej2;

public class Main {

    public static void main(String[] args) {

        ChatEquipo chatEquipo = new ChatEquipo();
        ChatGlobal chatGlobal = new ChatGlobal();

        Estudiante estudiante1 = new Estudiante(chatEquipo, "Lagu", "Jhosias", "1");
        Estudiante estudiante2 = new Estudiante(chatEquipo, "Stone", "Pablo", "7");
        Estudiante estudiante3 = new Estudiante(chatEquipo, "Renuco", "Rene", "8");
        Estudiante estudiante4 = new Estudiante(chatEquipo, "Mollinex", "Manuel", "11");

        Docente docente1 = new Docente(chatEquipo, "Edi", "Edilberto", "9");
        Docente docente2 = new Docente(chatEquipo, "Payaso", "Ernesto", "10");
        Docente docente3 = new Docente(chatEquipo, "Coco", "Jorge", "69");
        Docente docente4 = new Docente(chatEquipo, "Alcon", "Fabian", "12");

        chatEquipo.addJugador(estudiante1)
                .addJugador(estudiante2)
                .addJugador(estudiante3)
                .addJugador(estudiante4)
                .addJugador(docente1)
                .addJugador(docente2)
                .addJugador(docente3)
                .addJugador(docente4);

        estudiante1.send("Vamos a ganar equipoooo");
        System.out.println("\n");
        docente2.send("Nosotros los docentes vamos a ganar!!");

        estudiante1.setChatJuego(chatGlobal);
        estudiante2.setChatJuego(chatGlobal);
        estudiante3.setChatJuego(chatGlobal);
        estudiante4.setChatJuego(chatGlobal);

        docente1.setChatJuego(chatGlobal);
        docente2.setChatJuego(chatGlobal);
        docente3.setChatJuego(chatGlobal);
        docente4.setChatJuego(chatGlobal);

        chatGlobal.addJugador(estudiante1)
                .addJugador(estudiante2)
                .addJugador(estudiante3)
                .addJugador(estudiante4)
                .addJugador(docente1)
                .addJugador(docente2)
                .addJugador(docente3)
                .addJugador(docente4);

        System.out.println("=========================");

        docente1.send("Buen juego Estudiantes!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        estudiante4.send("les vamos a ganar la proxima a los docentes");




    }








}
