public class FerrariEngine extends Engine{


    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderamount, double engineWeight) {
        super(engineVolume, cylinderamount, engineWeight);
    }

    @Override
    public double efficiency() {
        return 0.25;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume()*getCylinderamount()*100;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight()*2;
    }
}
