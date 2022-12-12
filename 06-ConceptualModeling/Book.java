public class Book{
    private String title;
    private String year;
    private String type;
    private int countOfPages;
    private double price;
    private int page;

    Book(String title, String year, String type, int countOfPages, double price){
        this.title = title;
        this.year = year;
        this.type = type;
        this.countOfPages = countOfPages;
        this.price = price;
        this.page = 1;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void nextPage(){
        if(page >= countOfPages){
            System.out.println("It is the last page");
        } else {
            page +=1;
            System.out.println("Page: " + page);
        }
    }
    public void setPage(int page) {
        this.page = page;
    }

    public void prevPage(){
        if(page == 1){
            System.out.println("It is the first page");
        } else {
            page -=1;
            System.out.println("You're on page: " + page);
        }
    }

    public void dispalyInfo(){
        System.out.println("Nazwa: " + title);
        System.out.println("Rok wydania: " + year);
        System.out.println("Typ: " + type);
        System.out.println("Liczba stron: " + countOfPages);
        System.out.println("Cena: " + price + "$");
    }

    public static void main(String[] args){
        Book b1 = new Book("Name of Love", "2022", "drama", 120, 28.11);
        b1.nextPage();
        b1.nextPage();
        b1.nextPage();
        b1.nextPage();
        b1.dispalyInfo();
    }
}
