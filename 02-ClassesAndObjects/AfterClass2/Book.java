public class Book {
    
    String title;
    String author;
    String PublicationDate;
    String genre;
    int pages;
    int OnPage;
    boolean IsOpen;
    
    public void Info(){
        System.out.println("Hello! This is \""+title+"\" of author "+author+
        " was published in "+PublicationDate+". The genre of the book is "
        +genre);
    };
    public void InfoPage(){
        System.out.println("You're on page "+OnPage);
    };
    public void TurnOn(){
        OnPage+=1;
        System.out.println("You've turned the page on "+OnPage);
    };
    public void isOpen(){
        if (IsOpen){
            System.out.println("The book is opened");    
        }
        else {
            System.out.println("The book is closed");  
        }
    };
    public void Close(){
        IsOpen = !IsOpen;
    };
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The Great Gatsby";
        b1.author = "F. Scott-Fitzgerald";
        b1.PublicationDate = "1925";
        b1.genre = "tragedy";
        b1.pages = 315;
        b1.IsOpen = true;
        b1.OnPage = 24;
        
        
        b1.Info();
        b1.isOpen();
        b1.InfoPage();
        b1.TurnOn();
        b1.Close();
        b1.isOpen();
    };
}
