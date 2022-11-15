public class MyArrays {
    int[] array;

    public void even (int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
    
    public void positiveOdd(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if ((array[i]%2!=0) && array[i]>=0){
                count+=1;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        MyArrays my1 = new MyArrays();
        my1.even(new int [] {2,-6,5,8}); //=> 3 
        my1.positiveOdd(new int [] {3,2,-5,4,1,-7}); //=> 2
    }
}