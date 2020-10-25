package Lesson2.Lab1;

public class Library {
    private String name;
    private String city;
    private Book books[] = new Book[5];
    private int index = 0;



    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public boolean addbook(Book book){
        boolean f;
        try {
            books[index] = book;
            index++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
            return f = true;
        }
        return f = false;
    }

    public void printBooks(){
        for (int i = 0; i < books.length; i++) {
            try {
                System.out.println(books[i].getName());
            } catch (NullPointerException e) {
                System.out.println("The book is empty");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
