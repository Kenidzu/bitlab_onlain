public class RenaultEngine extends Engine{
    private double extraTurboEnergy;


    public RenaultEngine() {

    }

    public RenaultEngine(double engineVolume, int cylinderamount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderamount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency() {
        return 0.27;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume()*getCylinderamount()*110+extraTurboEnergy;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight()*2.1;
    }
}
