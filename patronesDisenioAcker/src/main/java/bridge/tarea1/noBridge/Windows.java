package bridge.tarea1.noBridge;

public class Windows implements IPlataforma{
    @Override
    public void windows7X86() {
        System.out.println("Ejecutando Windows7X86...");
        System.out.println("=======================================");
    }

    @Override
    public void windows7X64() {
        System.out.println("Ejecutando Windows7X64...");
        System.out.println("=======================================");
    }

    @Override
    public void linuxX86() {
        System.out.println("Este Sistema Operativo no es Linux!");
        System.out.println("=======================================");
    }

    @Override
    public void linuxX64() {
        System.out.println("Este Sistema Operativo no es Linux!");
        System.out.println("=======================================");
    }
}
