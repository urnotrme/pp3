public class Room{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room (int number) {
        this.number = number;
        this.beds = 2;
    }
    
    Room (int number, int beds) {
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String guestName){
        this.guestName = guestName;
        this.occupied = true;
    }
    
    public void checkout(){
        this.occupied = false;
        this.guestName = "";
    }
    
    public String isOccupied(){
        if (occupied){
            return "The room is occupied.";
        } else {
            return "The room is not occupied.";
        }
    }
    
    /* public void displayStatus(){
        System.out.println("The room number "+number+" with "+beds+" beds");
        this.isOccupied();
    } */
    
    public String toString(){
        return "The room number "+number+" with "+beds+" beds. Is it occupied? "+occupied;

    }
    
    public static void DisplayReport(Room[] rooms) {
        for (Room room : rooms) {
            //room.DisplayStatus(); /*task 22 */
            System.out.println(room.toString());
        }
    }

    public static void DisplayReportSpecBeds(Room[] rooms, int beds) {
        for (Room room : rooms) {
            if (room.beds == beds) {
                //room.DisplayStatus(); /*task 22 */
                System.out.println(room.toString());
            }
        }
    }
    
    public static void DisplayReportVacantAndOccupied(Room[] rooms) {
        int vacant = 0;
        int occupied = 0;
        for (Room room : rooms) {
            if (room.occupied == true) {
                occupied += 1;
            } else {
                vacant += 1;
            }
        }

        System.out.println("Number of vacant rooms: " + vacant);
        System.out.println("Number of occupied rooms: " + occupied);
    }
    
    public static void DisplayReportVacantBeds(Room[] rooms) {
        int vacantBeds=0;
        for (Room room : rooms) {
            if (room.occupied == false) {
                vacantBeds += room.beds;
            }
        }

        System.out.println("There are " + vacantBeds + " beds available.");
    }
    
    public static void main(String[] args) {
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4,3);
        Room r5 = new Room(5,3);
        Room r6 = new Room(6,1);

        Room[] rooms = {r1, r2, r3, r4, r5, r6};

        //rooms[3].DisplayStatus(); /* task 22 */
        System.out.println(rooms[3].toString());
        DisplayReport(rooms);
        DisplayReportSpecBeds(rooms, 2);
        DisplayReportVacantAndOccupied(rooms);
        DisplayReportVacantBeds(rooms);
    }
}