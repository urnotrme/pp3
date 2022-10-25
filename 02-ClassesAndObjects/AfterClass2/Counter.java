public class Counter {
    int value = 0;
    
    
    public void add1(){
        System.out.println(value +=1);
    }
    public void add10(){
        System.out.println(value +=10);
        
    }
    public void sub1(){
        System.out.println(value -=1);
        
    }
    public void sub10(){
        System.out.println(value -=10);
        
    }
    
    public void start(){
        System.out.println(value = 0);
        
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        c1.add10();
        c1.add10();
        c1.add1();
        c1.add1();
        c1.add1();
            
        c2.sub10();
        c2.sub10();
        c2.sub10();
        c2.sub10();
        c2.sub10();
        c2.add1();
        c2.add1();
        c2.add1();
            
        System.out.println(c1.value);
        System.out.println(c2.value);

    };
}