package observer.tarea1;

public class Propaganda {
    private String id;
    private String categoria;

    public Propaganda(String id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void showInfoPropaganda(){
        System.out.println("El anuncio que se mostro es de la categoria: "+getCategoria()+" [id: "+getId()+"]");
    }
}
