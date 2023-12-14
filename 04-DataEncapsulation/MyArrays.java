public class MyArrays {
    
    public static int odd(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>0 && array[i]%2==1){
                sum++;
            }
        }
        return sum;
    }
    public static int above(int[] array){
        int sum=0;
        int avg=0;
        for (int i=0; i<array.length;i++){
            sum+=array[i];
        }
        avg = sum/array.length;
        sum=0;
        for (int i=0; i<array.length;i++){
            if (array[i]>avg){
                sum+=array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
      int[] arr1 = {3,2,-5,4,1,-7};
      int[] arr2 = {5,2,7,4,2};
      System.out.println(MyArrays.odd(arr1));
      System.out.println(MyArrays.above(arr2));
    }


}
