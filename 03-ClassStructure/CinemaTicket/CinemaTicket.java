public class CinemaTicket {
    static String cinemaName = "IMAX Kraków";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public void Ticket(){
        System.out.println(cinemaName);
        System.out.println("Film title: \""+filmTitle+"\". Row №: "+row+
        ". Seat №: "+seat+". Total price: "+price);
    }
    
    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket();
        CinemaTicket t2 = new CinemaTicket();
        
        t1.filmTitle = "The Great Gatsby";
        t1.row = 5;
        t1.seat = 6;
        t1.price = 9.57;
        
        t2.filmTitle = "War and Peace";
        t2.row = 10;
        t2.seat = 8;
        t2.price = 10.0;
        
        t1.Ticket();
        t2.Ticket();
    };
}