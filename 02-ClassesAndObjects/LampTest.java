public class LampTest {
    public static void main(String[] args) {
        Lamp l = new Lamp();
        Lamp l1 = new Lamp();

        l.switchOn();
        l1.switchOff();
        l.displayInfo();
        l1.displayInfo();
    }
    
}
