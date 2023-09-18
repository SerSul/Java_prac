package task4;


enum ComputerBrand {
    HP,
    Dell,
    Lenovo,
    Asus,
    Acer
}


class Processor {
    private String model;
    private double clockSpeedGHz;
    private int numberOfCores;

    public Processor(String model, double clockSpeedGHz, int numberOfCores) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
        this.numberOfCores = numberOfCores;
    }

    // Геттеры и сеттеры

    public String getModel() {
        return model;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

}


class Memory {
    private String type;
    private int capacityGB;

    public Memory(String type, int capacityGB) {
        this.type = type;
        this.capacityGB = capacityGB;
    }

    // Геттеры и сеттеры

    public String getType() {
        return type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

}


class Monitor {
    private String model;
    private int sizeInInches;
    private String resolution;

    public Monitor(String model, int sizeInInches, String resolution) {
        this.model = model;
        this.sizeInInches = sizeInInches;
        this.resolution = resolution;
    }


    public String getModel() {
        return model;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public String getResolution() {
        return resolution;
    }


}


class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттеры и сеттеры

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }


}

public class zad4_4 {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel Core i7", 3.5, 4);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("Dell UltraSharp", 24, "1920x1080");
        Computer computer = new Computer(ComputerBrand.Dell, processor, memory, monitor);


        System.out.println("Марка компьютера: " + computer.getBrand());
        System.out.println("Процессор: " + computer.getProcessor().getModel());
        System.out.println("Частота : " + computer.getProcessor().getClockSpeedGHz() + " GHz");
        System.out.println("ядра: " + computer.getProcessor().getNumberOfCores());
        System.out.println("память: " + computer.getMemory().getType());
        System.out.println("Объем : " + computer.getMemory().getCapacityGB() + " GB");
        System.out.println("Монитор: " + computer.getMonitor().getModel());
        System.out.println("Размер : " + computer.getMonitor().getSizeInInches() + " дюймов");
        System.out.println("Разрешение : " + computer.getMonitor().getResolution());
    }
}

