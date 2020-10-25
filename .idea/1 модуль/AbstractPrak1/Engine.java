public abstract class Engine {
    private double engineVolume;
    private int cylinderamount;
    private double engineWeight;

    public Engine() {

    }

    public Engine(double engineVolume, int cylinderamount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderamount = cylinderamount;
        this.engineWeight = engineWeight;
    }
    public abstract double efficiency();

    public abstract double throttleEnergy();

    public abstract double breakEnergy();

    public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderamount() {
        return cylinderamount;
    }

    public void setCylinderamount(int cylinderamount) {
        this.cylinderamount = cylinderamount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }
}
