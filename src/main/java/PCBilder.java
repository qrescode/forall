public class PCBilder {
    private String cpu;
    private int ram = 8;
    private int ssd = 256;
    private String gpu = "rtx 2060 super";
    private boolean wifi;
    private boolean bluetooth;

    public PCBilder(String cpu){
        this.cpu = cpu;
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
        return new Computer(this);
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public boolean getWifi() {
        return wifi;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

}
