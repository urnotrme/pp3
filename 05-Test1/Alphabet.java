import java.util.Arrays;

public class Alphabet {
    String t;

    public void isAlphabet(String t){
        char[] chars = t.toCharArray();
        Arrays.sort(chars);
        String Sortedt = new String(chars);
        if (Sortedt.equals(t)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args){
        Alphabet alp = new Alphabet();
        alp.isAlphabet("abegsw");
        alp.isAlphabet("abcmhsw");
    }
}
