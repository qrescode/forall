public class Computer {
    private final String cpu;
    private final int ram;
    private final int ssd;
    private final String gpu;
    private final boolean wifi;
    private final boolean bluetooth;


    public Computer(PCBilder pcb) {
        this.cpu = pcb.getCpu();
        this.ram =  pcb.getRam();
        this.ssd =  pcb.getSsd();
        this.gpu =  pcb.getGpu();
        this.wifi =  pcb.getWifi();
        this.bluetooth =  pcb.getBluetooth();
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
