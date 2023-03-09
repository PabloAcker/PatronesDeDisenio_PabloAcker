package segundoParcial.fila2.ej4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

   private List<Estudiante> estudiantes = new ArrayList<>();
   private IOrden orden;
   public BaseDatos(IOrden orden) {
       this.orden = orden;
   }
   public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
   public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

   public IOrden getOrdenar() {
        return orden;
    }

   public void setOrdenar(IOrden sorting) {
        this.orden = sorting;
    }

   public void addEstudiantes(Estudiante estudiante) {
       estudiantes.add(estudiante);
    }

   public void ordenarListaEstudiantes() {
       this.orden.ordenar(estudiantes);
    }

}
