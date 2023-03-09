package segundoParcial.fila1.ej4;

public class Main {
    public static void main(String[] args){
        BDD db = new BDD();
        db.addLibros(new Libro("11111", "Harry Potter", "CienciaFiccion"));
        db.addLibros(new Libro("22222", "Pep Guardiola", "Deportes"));
        db.addLibros(new Libro("33333", "Los juegos del hambre", "Accion"));
        db.addLibros(new Libro("44444", "Metamorfosis", "CienciaFiccion"));

        String tipoBusqueda = "Por ID";

        if (tipoBusqueda.equals("Por ID")){
            db.setStrategy(new Estrategia1ID());
        } else if(tipoBusqueda.equals("Por Titulo")){
            db.setStrategy(new Estrategia2Titulo());
        } else if(tipoBusqueda.equals("Por Categoria")){
            db.setStrategy(new Estrategia3Categoria());
        }

        db.iniciarOrden("11111", "Harry Potter", "CienciaFiccion");
    }
}
