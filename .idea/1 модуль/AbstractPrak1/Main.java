public class Main {
    public static void main(String[] args) {
        Engine [] all = new Engine[]{
                new FerrariEngine(2.33,15,255.67),
                new FerrariEngine(2.34,16,255.68),
                new FerrariEngine(2.35,17,255.69),
                new FerrariEngine(2.36,18,255.70),
                new FerrariEngine(2.37,19,255.71),
                new RenaultEngine(4.55,21,255.56,34.33),
                new RenaultEngine(4.56,22,255.57,34.34),
                new RenaultEngine(4.57,23,255.58,34.35),
                new RenaultEngine(4.58,24,255.59,34.36),
                new RenaultEngine(4.59,25,255.60,34.37)
        };

        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getMaxSpeed());
        }
    }
}
