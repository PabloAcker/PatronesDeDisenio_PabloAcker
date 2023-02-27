package parcial1.singgleton.a;

public class Main {
    public static void main(String[] args) {
        Vehiculo vh1 = new Vehiculo("6941HJF","Camioneta","Rojo", 5);
        Vehiculo vh2 = new Vehiculo("6431JLF","Vagoneta","Amarillo", 2);
        Vehiculo vh3 = new Vehiculo("5481LAD","Moto","Verde", 2);
        Vehiculo vh4 = new Vehiculo("302FJK","Deportivo","Azul", 10);
        Vehiculo vh5 = new Vehiculo("0741NLA","Trailer","Celeste", 3);
        Vehiculo vh6 = new Vehiculo("9619HFL","Bus","Negro", 7);

        vh1.registro();
        vh1.dineroRecaudado();

        vh2.registro();
        vh2.dineroRecaudado();

        vh3.registro();
        vh3.dineroRecaudado();

        vh4.registro();
        vh4.dineroRecaudado();

        vh5.registro();
        vh5.dineroRecaudado();

        vh6.registro();
        vh6.dineroRecaudado();
    }
}
