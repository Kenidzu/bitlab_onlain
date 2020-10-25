package Lesson5.Lab1;

import Lesson5.Prak1.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("PRESS 1 TO CREATE GAME\n PRESS 2 TO ADD PLAYER TO GAME\nPRESS 3 TO PLAY GAME\nRESS 0 TO EXIT");
            int number = in.nextInt();
            if (number == 1){
                System.out.println("GameName");
                String gamename = in.next();
                System.out.println("IPAdress");
                String ipadress = in.next();
                System.out.println("Port");
                int port = in.nextInt();
                Game gam = new Game(gamename,ipadress,port);
                saveGame(gam);
            }
            else if (number == 2){
                System.out.println("NickName");
                String nickname = in.next();
                System.out.println("Rating");
                double rating = in.nextDouble();
                Players player = new Players(nickname,rating);
                addPlayers(player);
            }
            else if (number == 3){
                ArrayList<Game>games = readgames();
                for (int i = 0; i < games.size(); i++) {
                    System.out.println((i + 1) + games.get(i).toString());
                }
            }
            else if (number == 0){
                System.exit(0);
            }
            else{
                System.out.println("Wrong Command");
            }
        }

    }
    public static void Savegames(ArrayList<Game>games){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("settings.txt"));
            outputStream.writeObject(games);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Game> readgames(){
        ArrayList<Game>games = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.txt"));
            games = (ArrayList<Game>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return games;
    }

    public static void saveGame(Game games){
        File game = new File("settings.data");
        ArrayList<Game>games1 = new ArrayList<>();
        if (game.length() !=0){
            games1 = readgames();
        }
        games1.add(games);
        Savegames(games1);
    }

    public static void addPlayers(Players player){
        Game game1 = new Game();
        game1.Players(player);
    }
}
