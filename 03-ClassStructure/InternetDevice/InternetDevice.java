public class InternetDevice{
    
    String name;
    boolean isConnected;
    String Connected;
    static int connectedDevices = 2;
    
    InternetDevice(String name, boolean isConnected){
        this.name = name;
        this.isConnected = isConnected;
    }
    
    public void connect(){
        if (!isConnected){
            isConnected = !isConnected;
            Connected = "connected";
        }
        else {
            System.out.println("Your device is already connected");
        }
    }
    
    public void disconnect(){
        if (isConnected){
            isConnected = !isConnected;
            Connected = "disconnected";
        }
        else {
            System.out.println("Your device is already disconnected");
        }
    }
    
    public void isConnected(){
        if (isConnected){
            Connected = "connected";
        }
        else {
            Connected = "disconnected";
        }
    }
    
    public void displayStatus(){
        System.out.println("Your device "+name+" is "+Connected);
    }
    
    public void displayConnections(){
        System.out.println("The number of connected devices: "+ 
        connectedDevices);
    }

    public static void main(String[] args){
        InternetDevice id1 = new InternetDevice("Internet Radio", true);
        InternetDevice id2 = new InternetDevice("Tablet", true);
        InternetDevice id3 = new InternetDevice("Smartphone", true);
        InternetDevice id4 = new InternetDevice("TV", false);
        InternetDevice id5 = new InternetDevice("Laptop", false);
        
        id1.isConnected();
        id2.isConnected();
        id3.isConnected();
        id4.isConnected();
        id5.isConnected();
        
        id1.displayStatus();
        id2.displayStatus();
        id3.displayStatus();
        id4.displayStatus();
        id5.displayStatus();
        
        id1.displayConnections();
        id2.displayConnections();
        id3.displayConnections();
        id4.displayConnections();
        id5.displayConnections();
    }
}