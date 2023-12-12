public class Arrays {
    static int numArr1=0;
    static int numArr2=0;
    public static boolean arr(int[] arr1,int[] arr2){
        for (int i=0;i<(arr1.length);i++){
            if (arr1[i]>=10 && arr1[i]<=99){
                numArr1++;
            }
        }
        for (int i=0;i<(arr2.length);i++){
            if (arr2[i]>=10 && arr2[i]<=99){
                numArr2++;
            }
        }
        System.out.println("Log: numArr1: "+ numArr1);
        System.out.println("Log: numArr2: "+ numArr2);
        return numArr1==numArr2;
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 8, 2, 37, 49, 117};
        int[] arr2 = {9, 6, 7, 12, 48, 4, 6, 90, 5};
        System.out.println(Arrays.arr(arr1, arr2));
    }
}
