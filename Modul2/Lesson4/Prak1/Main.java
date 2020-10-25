package Lesson4.Prak1;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] TO ADD USERS\n PRESS [2] TO LIST USERS\nPRESS [3] TO DELETE USERS\nPRESS [4] TO EXIT");
            int number = in.nextInt();
            if (number == 1){
                System.out.println("Insert login");
                String login = in.next();
                System.out.println("Insert password");
                String password = in.next();
                System.out.println("Введите номер студента");
                int index = in.nextInt();
                User user1 = new User(index,login,password);
                ArrayList<User> users = getUserList();
                users.add(user1);
                saveUsersList(users);
            }
            else if (number == 2){
                ArrayList<User> users = getUserList();
                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + " " + users.get(i));
                }
            }
            else if (number == 3){
                ArrayList<User> users = getUserList();
                for (int i = 0; i < users.size(); i++) {
                    System.out.println((i + 1) + " " + users.get(i));
                }
                System.out.println("Insert index of player to delete: ");
                int num = in.nextInt();
                users.remove(num - 1);

                saveUsersList(users);
            }
            else if (number == 4){
                System.exit(0);
            }
            else {
                System.out.println("Wrong command!!!");
            }
        }
    }
    public static void saveUsersList(ArrayList<User> users){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt"));
            for (User u: users){
                bw.write(u.getId() + "\n");
                bw.write(u.getLogin() + "\n");
                bw.write(u.getPassword() + "\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String line = br.readLine();
            while (!line.equals("")){
                int id = Integer.parseInt(line);
                String login = br.readLine();
                String password = br.readLine();
                users.add(new User(id,login,password));
                line = br.readLine();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }
}

