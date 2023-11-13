public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Jan");
        p.setWeightAndHeight(70, 1.7);
        p.calculateBMI();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Person p1 = new Person("Maciej", 170, 2.0);
        p1.calculateBMI();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Person p2 = new Person("Zbigniew", 70, 1.85);
        p2.calculateBMI();
        System.out.println();
        System.out.println();
        p1.displayRecord();
        System.out.println();
        System.out.println();
        p2.displayRecord();
        System.out.println();
        System.out.println();
        p.displayRecord();

    }
}
