public class SuperCounter extends Counter{

    public SuperCounter (int counter) {
        super(counter);
    }

    public int addN(int n){
        return super.getCounter() +n;
    }

    public static void main(String[] args) {
        SuperCounter s1 = new SuperCounter(160);
        System.out.println(s1.addN(150));
        System.out.println(s1.addN(150));
    }
    
}
