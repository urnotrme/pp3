import java.util.ArrayList;

public class Numbers {
    private int num1, num2, num3, num4, num5;

    public Numbers(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public boolean different(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        return numbers.stream().distinct().count() >= 5;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(3, 4, 2, 1, 6);
        System.out.println(n1.different());
        Numbers n2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(n2.different());
    }
}
