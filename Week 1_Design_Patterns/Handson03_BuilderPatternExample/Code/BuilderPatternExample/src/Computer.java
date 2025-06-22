public class Computer {
    
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private String os;

    
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + "GB, Storage=" + storage + "GB, GPU=" + gpu + ", OS=" + os + "]";
    }

    
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private String os;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }

        
        public Computer build() {
            return new Computer(this);
        }
    }
}
