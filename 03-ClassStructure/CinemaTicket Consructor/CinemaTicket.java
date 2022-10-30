public class CinemaTicket {
    
    static String cinemaName = "Morning Star Cinema";
    String filmTitle ;
    int row;
    int seat;
    double price;
    
    CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if (this.row <=2){
            this.price = 10;
        }
        else {
            this.price = 25;
        }   
    }
    
    public void showInfo(){
        System.out.println(cinemaName);
        System.out.println("Film title: \""+filmTitle+"\". Row №: "+row+
        ". Seat №: "+seat+". Total price: "+price);
    }
    
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("Gladiator",2,6);
        CinemaTicket t2 = new CinemaTicket("Gladiator",7,16);
               
        t1.showInfo();
        t2.showInfo();    
    }
   
}