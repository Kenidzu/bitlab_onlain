public class Library {
    private String name;
    private String city;
    private String country;
    private Book[]books = new Book[100];
    private int sizeOfBooks = 0;

    public Library(){

    }

    public Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public void addBook(Book b){
        books[sizeOfBooks] = b;
        sizeOfBooks++;
    }
    public void printLibraryData(){
        for (int i = 0; i < sizeOfBooks ; i++) {
            System.out.println(books[i].getBookData());
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSizeOfBooks() {
        return sizeOfBooks;
    }

    public void setSizeOfBooks(int sizeOfBooks) {
        this.sizeOfBooks = sizeOfBooks;
    }
}
