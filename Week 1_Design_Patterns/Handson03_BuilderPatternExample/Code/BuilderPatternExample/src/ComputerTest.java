public class ComputerTest {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM(8)
                .setStorage(256)
                .setOS("Windows 10")
                .build();

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4080")
                .setOS("Windows 11")
                .build();

        Computer linuxBox = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM(16)
                .setStorage(512)
                .setOS("Ubuntu 22.04")
                .build();
                
        System.out.println();
        System.out.println("Basic PC: " + basicPC);
        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Linux Workstation: " + linuxBox);
    }
}
