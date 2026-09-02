public class Computer {
    private final String cpu;
    private final int ram;
    private final int ssd;
    private final String gpu;
    private final boolean wifi;
    private final boolean bluetooth;

    private Computer(PCBuilder pcb) {
        this.cpu = pcb.cpu;
        this.ram =  pcb.ram;
        this.ssd =  pcb.ssd;
        this.gpu =  pcb.gpu;
        this.wifi =  pcb.wifi;
        this.bluetooth =  pcb.bluetooth;
    }

    public void getC(){
        System.out.println("cpu = " + cpu);
        System.out.println("ram = " + ram);
        System.out.println("ssd = " + ssd);
        System.out.println("gpu = " + gpu);
        System.out.println("wifi = " + wifi);
        System.out.println("bluetooth = " + bluetooth);
    }

    static class PCBuilder {
        private String cpu;
        private int ram = 8;
        private int ssd = 256;
        private String gpu = "rtx 2060 super";
        private boolean wifi;
        private boolean bluetooth;

        public PCBuilder(String cpu){
            this.cpu = cpu;
        }

        public PCBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public PCBuilder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public PCBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PCBuilder setSsd(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public PCBuilder setWifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
