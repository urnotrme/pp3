import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<Book>();

    public void getShelf() {
        for (Book book : shelf){
            book.display();
        }
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public void addBook(Book book) {
        shelf.add(book);
    }
/* 
    public String toString() {
        return 
    }*/

    public static void main(String[] args) {
        Library l1 = new Library();
        Ebook e1 = new Ebook("How To Make Friends With the Dark",  2019,"ebook1.png", new Writer("Olivia", "Paulizzo", "comedy"));
        l1.addBook(e1);
        l1.getShelf();
    }
}