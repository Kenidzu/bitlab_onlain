public class KFC implements Restaurant{
    private int basketPrices[] = new int[100];

    private int basketSize = 0;

    public void addBasket(int basketPrice){
        basketPrices[basketSize] = basketPrice;
        basketSize++;
    }

    public KFC() {
    }


    @Override
    public double getTotalIncome() {
        int sum = 0;
        for (int i = 0; i < basketPrices.length; i++) {
            sum += basketPrices[i];
        }
        return sum;
    }

    @Override
    public double getTotalOutcome() {
        return 0;
    }
}
