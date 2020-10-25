package Lesson5.Lab1;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private String gameName;
    private String ipAdress;
    private int port;
    private ArrayList<Players> players = new ArrayList<Players>();


    public Game() {
    }


    public Game(String gameName, String ipAdress, int port) {
        this.gameName = gameName;
        this.ipAdress = ipAdress;
        this.port = port;
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAdress='" + ipAdress + '\'' +
                ", port=" + port +
                ", players=" + players +
                '}';
    }

    public void Players (Players player){
        players.add(player);

    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
