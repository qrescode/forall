public class Computer {
    private final String cpu;
    private final int ram;
    private final int ssd;
    private final String gpu;
    private final boolean wifi;
    private final boolean bluetooth;


    public Computer(String cpu, int ram, int ssd, String gpu, boolean wifi, boolean bluetooth) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }

    public void getC(){
        System.out.println("cpu = " + cpu);
        System.out.println("ram = " + ram);
        System.out.println("ssd = " + ssd);
        System.out.println("gpu = " + gpu);
        System.out.println("wifi = " + wifi);
        System.out.println("bluetooth = " + bluetooth);
    }
}
