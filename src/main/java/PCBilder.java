public class PCBilder {
    private String cpu = "i5";
    private int ram = 8;
    private int ssd = 256;
    private String gpu = "rtx 2060 super";
    private boolean wifi;
    private boolean bluetooth;

    public PCBilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public PCBilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public PCBilder setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public PCBilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PCBilder setSsd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public PCBilder setWifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    public Computer build(){
        return new Computer(cpu, ram, ssd, gpu, wifi, bluetooth);
    }
}
