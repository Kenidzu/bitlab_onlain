package Lesson9.Prak1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBmanager {
    private Connection connection;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lessonsql?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public   void disconnect() {
        try {

            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Item> getAllItem(){

        ArrayList<Item> items = new ArrayList<>();
        try{

            PreparedStatement st = connection.prepareStatement("SELECT * FROM items");


            ResultSet rs = ((PreparedStatement) st).executeQuery();


            while (rs.next()){

                Long id = rs.getLong("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");


                items.add(new Item(name,price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return items;
    }
    public void addItem(Item item){
        try{
            PreparedStatement st = connection.prepareStatement("INSERT INTO items(name, price) values(?,?)");
            st.setString(1,item.getName());
            st.setDouble(2,item.getPrice());
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void deleteitems(Long id){
        try{

            PreparedStatement st = connection.prepareStatement("DELETE FROM items where id = ?");
            st.setLong(1, id);
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
