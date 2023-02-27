package parcial1.singgleton.b;

public class LaunchTesis {
    public static void main(String[] args) {
        TemaTesis tema1 = new TemaTesis("Hacking","Master");
        TemaTesis tema2 = new TemaTesis("Full Stack","Master");
        TemaTesis tema3 = new TemaTesis("Nanotecnologia","PHD");
        TemaTesis tema4 = new TemaTesis("Robotica","PHD");

        Estudiante est1 = new Estudiante("Soria","747820",tema1);
        Estudiante est2 = new Estudiante("Jhoni","84132030",tema2);
        Estudiante est3 = new Estudiante("Carlos","2212123",tema3);
        Estudiante est4 = new Estudiante("Jose","1111000",tema4);
        Estudiante est5 = new Estudiante("Alice","788888",tema1);
        AlmacenTesis.getInstance().cantidadRegistros();
        est1.registroTesis();
        AlmacenTesis.getInstance().cantidadRegistros();
        est2.registroTesis();
        AlmacenTesis.getInstance().cantidadRegistros();
        est3.registroTesis();
        AlmacenTesis.getInstance().cantidadRegistros();
        est4.registroTesis();
        AlmacenTesis.getInstance().cantidadRegistros();
        est5.registroTesis();
        AlmacenTesis.getInstance().cantidadRegistros();
    }
}
