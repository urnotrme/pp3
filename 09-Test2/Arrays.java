public class Arrays {
    private static int[] arr1, arr2;

    public static int[] getArr1() {
        return arr1;
    }
    public static void setArr1(int[] arr1) {
        Arrays.arr1 = arr1;
    }
    public static int[] getArr2() {
        return arr2;
    }
    public static void setArr2(int[] arr2) {
        Arrays.arr2 = arr2;
    }
    static boolean arr(int[] arr1, int[] arr2){
        int count1 = 0;
        for (int i=0; i<arr1.length; i++){
            if (arr1[i]>=10 && arr1[i]<=99){
                count1++;
            }
        }
        int count2 = 0;
        for (int x=0; x<arr2.length; x++){
            if (arr2[x]>=10 && arr2[x]<=99){
                count2++;
            }    
        }
        return count1==count2;
    }
    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,90,5};
        System.out.println(arr(arr1,arr2));

    }
}
