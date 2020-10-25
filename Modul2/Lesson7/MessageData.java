package Lesson7;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.net.ServerSocket;
import java.util.Date;

public class MessageData implements Serializable {
    private String username;
    private String messageText;
    private Date sendDate;

    public MessageData() {
    }


    public MessageData(String username, String messageText) {
        this.username = username;
        this.messageText = messageText;
        this.sendDate =  new Date();
    }

    @Override
    public String toString() {
        return "MessageData{" +
                 username + '\'' +
                 messageText + '\'' +
                sendDate +
                '}';
    }


}
