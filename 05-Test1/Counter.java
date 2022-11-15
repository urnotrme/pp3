public class Counter {
    int counter = 0;
    int n = 0;

    public void increase(){
        counter +=1;
    }    

    public void decrease(){
        counter -=1;
    }  

    public void increase(int n) {
        counter+=n;
    }

    public void decrease(int n) {
        counter-=n;
    }

    public void value() {
        System.out.println(counter);
    }

    public static void main (String[] args){
        Counter c = new Counter(); 
        c.value();// => 0 
        c.increase(); 
        c.increase(); 
        c.decrease(); 
        c.increase(5); 
        c.decrease(2); 
        c.value(); //=> 4
    }
}
