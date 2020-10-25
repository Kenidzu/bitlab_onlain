package Lesson3.Prak1;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<Players> player = new ArrayList<Players>();
        Players igrok1 = new Players("Messi",180.23,33);
        Players igrok2 = new Players("Kuanysh", 255.52, 32);
        Players igrok3 = new Players("Askar", 201.34, 25);
        Players igrok4 = new Players("Azamat", 314.23, 31);
        Players igrok5 = new Players("Maksat", 210.22, 27);
        Players igrok6 = new Players("Ronaldo", 120.25, 34);
        Players igrok7 = new Players("Ghabry", 175.23, 25);
        Players igrok8 = new Players("Kimmich", 153.89, 26);
        Players igrok9 = new Players("Sane", 52.45, 23);
        Players igrok10 = new Players("Lewandowski", 98.75, 31);
        player.add(igrok1);
        player.add(igrok2);
        player.add(igrok3);
        player.add(igrok4);
        player.add(igrok5);
        player.add(igrok6);
        player.add(igrok7);
        player.add(igrok8);
        player.add(igrok9);
        player.add(igrok10);

        int sumage = 0;
        for (int i = 0; i < player.size(); i++) {
            sumage += player.get(i).getAge();
        }
        int sum = 0;
        int index = 1;
        for (int i = 0; i < player.size(); i++) {
            sum += player.get(i).getPrice();
            index++;
        }
        System.out.println("Сумма возраста игроков в массиве " + sumage);
        System.out.println("Средняя цена игроков в массиве " + sum/index);

    }
}
