public class Ebook extends Book{
    private String fileName;

    public Ebook(String title, int publication, String fileName, Writer writer) {
        super(title, publication, writer);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String display() {
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor()
                            + "\nFile name: " + fileName;
    }

    public static void main(String[] args) {
        Ebook e1 = new Ebook("How To Make Friends With the Dark", 2019, "ebook.pdf", new Writer("Olivia", "Paulizzo", "comedy"));
        System.out.println(e1.display());
    }
}