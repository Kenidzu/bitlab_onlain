public class MCDonalds implements Restaurant{

    private int burgersPrices[] = new int[100];

    private int workersSalary[] = new int[20];

    private int burgersSize = 0;

    private int workersSize = 0;


    public MCDonalds() {
    }

    public void addBurger(int burgerPrice){
        burgersPrices[burgersSize] = burgerPrice;
        burgersSize++;
    }

    public void addWorker(int workerSalary){
        workersSalary[workersSize] = workerSalary;
        workersSize++;
    }

    @Override
    public double getTotalIncome() {
        int sum = 0;
        for (int i = 0; i < burgersPrices.length; i++) {
            sum += burgersPrices[i];
        };
        return sum;
    }

    @Override
    public double getTotalOutcome() {
        int sum = 0;
        for (int i = 0; i < workersSalary.length; i++) {
            sum += workersSalary[i];
        }
        return sum;
    }
}
