import java.util.Arrays;

public class StringManipulation{
    public static void main(String[] args) {
        String text = "Have a nice day!";

        int numOfChar = text.length();
        System.out.println(numOfChar);

        String firstNine = text.substring(0,9);
        System.out.println(firstNine);

        boolean endsWith = text.endsWith("day!");
        System.out.println(endsWith);

        boolean isEmpty = text.isEmpty();
        System.out.println(isEmpty);

        int lastInd = text.lastIndexOf("e");
        System.out.println(lastInd);

        String replaceSpace = text.replace(" ","-");
        System.out.println(replaceSpace);

        String toUpper = text.toUpperCase();
        System.out.println(toUpper);

        String toLower = text.toLowerCase();
        System.out.println(toLower);

        char[] test = text.toCharArray();
        System.out.println(Arrays.toString(test));
    }
}