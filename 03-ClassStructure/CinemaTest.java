public class CinemaTest {
    public static void main(String[] args) {
        CinemaTicket t =  new CinemaTicket(7);
        t.filmTitle= "Gladiator";
        t.seat= 5;
        CinemaTicket t1 = new CinemaTicket(2);
        t1.filmTitle= "Gladiator";
        t1.seat= 4;
        System.out.println(t);
        System.out.println(t1);

    }
}
