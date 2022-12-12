import java.util.Arrays;

public class Score {
    public static double arithmeticMean;

    public static int sum(int[] array) {
        int sum=0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    public static int showHighestScore(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static int showLowestScore(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static double average(int[] array){
        Arrays.sort(array);
        double sum = sum(array);
        sum = sum - (array[0] + array[array.length-1]);

        double score = sum/3;
        return score;
    }

    public static void main(String[] args){
        System.out.println(average(new int[] {1,2,3,4,5}));
        System.out.println(average(new int[] {2,2,5,4,5}));
        System.out.println(average(new int[] {1,2,2,4,5}));

        System.out.println(showHighestScore(new int[] {1,2,2,4,5}));
        System.out.println(showLowestScore(new int[] {1,2,2,4,5}));
    }
}