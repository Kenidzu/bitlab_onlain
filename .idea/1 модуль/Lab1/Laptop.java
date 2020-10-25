public class Laptop {
    //3 задание
    public String name;
    public int price;
    public int weight;
    public HDD hardDiskDrive;
    public CPU[] cpuMemory;


    public Laptop(){

    }

    public Laptop(String name, int price, int weight, HDD hardDiskDrive, CPU[] cpuMemory){
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDrive = hardDiskDrive;
        this.cpuMemory = cpuMemory;
    }

    public int getTotalprice(){
        int sum = 0;
        for (int i = 0; i <cpuMemory.length ; i++) {
            sum += cpuMemory[i].price;
        }
        return sum + price + hardDiskDrive.price;
    }
    public int getTotalCPUmemory(){
        int summa = 0;
        for (int i = 0; i < cpuMemory.length; i++) {
            summa += cpuMemory[i].price;
        }
        return  summa + hardDiskDrive.memory;
    }

    public int getTotalWeight(){
        int sum = 0;
        for (int i = 0; i < cpuMemory.length; i++) {
            sum += cpuMemory[i].weight;
        }
        return sum + weight + hardDiskDrive.weight;
    }
}
