public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1 = new Counter();

        c.incBy10();
        c.incBy10();
        c.incBy1();
        c.incBy1();
        c.incBy1();
        c.display();

        c1.decBy10();
        c1.decBy10();
        c1.decBy10();
        c1.decBy10();
        c1.decBy10();
        c1.incBy1();
        c1.incBy1();
        c1.incBy1();
        c1.display();
    }
}
