
public class Statistics{
    int x;
    int y;
    
    public void NumOfItems(){
        int count = 0;
        for (int i = x; i < y; i++){
            count +=1;
        }
        System.out.println("The number of items is: "+count);
    }
    
    public void SumOfNum(){
        int count = 0;
        for (int i = x; i < y; i++){
            count +=i;
        }
        System.out.println("The sum of numbers is: "+count);
    }
    
    public void ArythMean(){
        int count1 = 0;
        int count2 = 0;
        for (int i = x; i < y; i++){
            count1 +=i;
            count2 +=1;
        }
        System.out.println("The arithmetic mean of the numbers is:  "+
        (count1/count2));
    }
    
    public static void main (String[] args){
         Statistics s1 = new Statistics();
         s1.x = 5;
         s1.y = 10;
         
         s1.NumOfItems();
         s1.SumOfNum();
         s1.ArythMean();
    }
}
