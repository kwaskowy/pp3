public class MyArrayTest {
    public static void main(String[] args) {
        int[] mojaTablica = {-1,-3,1, 2, 3, 4, 5, 6, 7,66, 8, 9, 10,11,12,14,16,23,24};
        int[] mojaTablica2 = {-1,-3,1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,14,16,23};
        int[][] mojaTablica3 ={
            {1, 2, 2},
            {4, 5, 3},
            {7, 8, 5},
            {7, 8, 3}
        };
        System.out.println("even: "+MyArray.even(mojaTablica));
        System.out.println("positive odd: "+MyArray.positiveOdd(mojaTablica));
        System.out.println("reverse: "+MyArray.reverse(mojaTablica));
        System.out.println("compare: "+MyArray.compare(mojaTablica,mojaTablica2));
        System.out.println("exists: "+MyArray.exists(16,mojaTablica2));
        System.out.println("secondMax: "+MyArray.secondMax(mojaTablica));
        System.out.println("last column:  "+MyArray.lastColumn(mojaTablica3));
    }
}
