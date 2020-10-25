public class Main {
    public static void main(String[] args) {
        ScientificBook sciece1 = new ScientificBook("National","Alians",355,12000,"Pervaya");
        ScientificBook science2 = new ScientificBook("Geographic","Leksi",250,9000,"Tolkin");
        ScientificBook science3 = new ScientificBook("Supermen","Batman",190,7500,"Tolstoi");
        ScientificBook science4 = new ScientificBook("Batman","Superman",180,8000,"Tolkin");
        ScientificBook science5 = new ScientificBook("Frodo","Baggins",130,9000,"Vlastik");
        LiteratureBook literatira1 = new LiteratureBook("Voina i mir","1988",380,"Tolstoi",1988);
        LiteratureBook literatira2 = new LiteratureBook("Gordost","Predubezhedenie",490,"Koli",1905);
        LiteratureBook literatira3 = new LiteratureBook("Seki","Light",440,"Lermontov",1909);
        LiteratureBook literatira4 = new LiteratureBook("Lenin","Stalin",150,"Marks",1917);
        LiteratureBook literatira5 = new LiteratureBook("Tramp","Nato",190,"Usa",2010);
        Book []books = new Book[]{sciece1,science2,science3,science4,science5,literatira1,literatira2,literatira3,literatira4,literatira5};
        Library national = new Library();
        for (int i = 0; i < books.length; i++) {
            national.addBook(books[i]);
        }

        national.printLibraryData();

    }
}
