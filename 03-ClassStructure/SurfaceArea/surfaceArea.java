public class surfaceArea {
    
    public static double areaCircle(int r){
        return 3.14*(r*r);
    }
    
    public static double areaRect(int width, int length){
        return width*length;
    }
    
    public static double areaTri(int base, int height){
        return 0.5*base*height;
    }

    public static void main (String[] args) {
        
        double areaRectangle = areaRect(4,5);
        double areaCircle = areaCircle(3);
        double areaTriangle = areaTri(3,4);
        
        System.out.println(areaRectangle);
        System.out.println(areaCircle);
        System.out.println(areaTriangle);
        
        
    }
    
    
}