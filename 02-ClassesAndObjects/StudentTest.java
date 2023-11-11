
public class StudentTest {
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        s1.name = "John";
        s1.age= 22;
        s2.name = "Robert";
        s2.age = 23;
        System.out.println(s1.name + " " + s2.age);
        System.out.println(s2.name + " " + s2.age);

        s1.sayHello();
        s.sayHello();
        s2.sayHello();
    }
    

}
