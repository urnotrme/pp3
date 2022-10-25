public class Rectangle{
    int width;
    int height; 
    
    public void dispalyInfo(){
        System.out.println("The width of the rectangle is "+width+", height is "
        +height);
    }
    public void dispalyP(){
        System.out.println("The perimeter is "+2*(width+height));
    }
    
    public void dispalyS(){
        System.out.println("The square is "+width * height);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        
        r1.width = 4;
        r1.height = 3;
        r1.dispalyInfo();
        r1.dispalyP();
        r1.dispalyS();
        
        r2.width = 7;
        r2.height = 2;
        r2.dispalyInfo();
        r2.dispalyP();
        r2.dispalyS();

    };
}