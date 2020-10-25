import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MCDonalds mac = new MCDonalds();
        MCDonalds mac2 = new MCDonalds();
        KFC krilya = new KFC();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму за бургер");
        mac.addBurger(in.nextInt());
        System.out.println("Введите Зарплату");
        mac.addWorker(in.nextInt());

        System.out.println("Введите суммму");
        krilya.addBasket(in.nextInt());

        City almaty = new City("Almaty");
        almaty.addRestaurant(mac);
        almaty.addRestaurant(mac2);
        almaty.addRestaurant(krilya);

        System.out.println(almaty.getTotalTax());

    }
}
