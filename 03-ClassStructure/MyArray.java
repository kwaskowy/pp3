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
    public static boolean exists(int number, int[] array){
        int len = array.length;
        for (int i = 0;i<len;i++){
            if (array[i]==number){
                return true;
            }
            }
        return false;
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
            if (array[i]>secondMax && array[i]!=firstMax){
                secondMax= array[i];
            } 
            
        }
        return secondMax;
    }
    public static int lastColumn(int[][] array) {
        int ostatniaKolumnaIndex = array[0].length - 1;
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i][ostatniaKolumnaIndex];
        }

        return suma;
    }
}