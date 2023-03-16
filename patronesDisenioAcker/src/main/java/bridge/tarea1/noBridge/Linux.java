package bridge.tarea1.noBridge;

public class Linux implements IPlataforma {
    @Override
    public void windows7X86() {
        System.out.println("Este Sistema Operativo no es Windows!");
        System.out.println("=======================================");
    }

    @Override
    public void windows7X64() {
        System.out.println("Este Sistema Operativo no es Windows!");
        System.out.println("=======================================");
    }

    @Override
    public void linuxX86() {
        System.out.println("Ejecutando LinuxX86...");
        System.out.println("=======================================");
    }

    @Override
    public void linuxX64() {
        System.out.println("Ejecutando LinuxX64...");
        System.out.println("=======================================");
    }
}
