public class MyArray {
    public static int even(int[] array) {
        int num=0; 
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                num += 1;
            }
        }
        return num; 
    }
    public static int positiveOdd(int[] array){
        int num=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 && array[i]>0 ) {
                num += 1;
            }
        }
        return num; 
    }
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
    
        for (int i = 0; i < array.length; i++) {
            reversedArray[i]=0;
        }
        
        return reversedArray;
    }
    
    
}