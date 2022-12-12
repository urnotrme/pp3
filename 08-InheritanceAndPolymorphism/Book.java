public class Book {
    private String title, author;
    private int publication;
    private Writer writer;

    public Book(String title, int publication, Writer writer) {
        this.title = title;
        this.publication = publication;
        this.writer = writer;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String display() {
        return "Title: " + title +"\nAuthor: " + writer.getFirstName()+" "+writer.getLastName()+"\nGenre: "+writer.getGenre();
    }

    public static void main(String[] args) {
        Book b1 = new Book("How To Make Friends With the Dark", 2019, new Writer("Olivia", "Paulizzo", "comedy"));
        System.out.println(b1.display());
    }
    
}