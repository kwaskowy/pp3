public class MyArrayTest {
    public static void main(String[] args) {
        int[] mojaTablica = {-1,-3,1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,14,16};
        int[] mojaTablica2 = {-1,-3,1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,14,16};
        System.out.println(MyArray.even(mojaTablica));
        System.out.println(MyArray.positiveOdd(mojaTablica));
        System.out.println(MyArray.reverse(mojaTablica));
        System.out.println(MyArray.compare(mojaTablica,mojaTablica2));
    }
}
