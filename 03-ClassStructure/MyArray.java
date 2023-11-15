import java.util.Arrays;

public class MyArray {
    int[] array;
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
    public static String reverse(int[] array){
        int len = array.length;
        int[] reversedArray= new int[len];
        for (int i=0 ; i < len;i++){
            reversedArray[i]=array[len-1-i];
        }
        return Arrays.toString(reversedArray);
    }
    public static boolean compare(int[] array1, int[] array2){
        boolean wartosc = false;
        if (array1.length==array2.length){
            wartosc = false;
            for (int i = 0; i<array1.length;i++){
                if (array1[i]==array2[i]){
                    wartosc= true;
                } else{
                    return false;
                }
            }
        } else {
            return false;
        }
        return wartosc;
    }
    public static boolean different(int[] array1, int[] array2){
        
    }
    public static boolean exists(int number, int[] array){
        int len = array.length;
        int wartosc = 0;
        for (int i = 0;i<len;i++){
            if (array[i]==number){
                wartosc++;
            }else{
                wartosc+=0;
            }
        }
        return len==wartosc;
    }
    public static int secondMax(int[] array){
        int firstMax= -2137;
        int secondMax= -2137;
        int len = array.length;
        for (int i = 0;i<len;i++){
            if (array[i]>firstMax){
                firstMax= array[i];
            }
        }
        for (int i = 0;i<len;i++){
            if (array[i]>secondMax && secondMax<firstMax){
                secondMax= array[i];
            }
        }
        return secondMax;
    }
    public static int lastColumn(int[][] array1){
        
    }
    public static int[][] swap(int[][] array1){
        
    }
    public static int[] twoToOne(int[][] array){

    }
    
}