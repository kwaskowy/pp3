public class TimeCount {
    public static void main(String[] args) {
        int hours = 1;
        int minute = 5;
        int minutes = hours * 60 + minute;
        int seconds = minutes * 60;

        System.out.printf("Time: %02d:%02d\nMinutes from midnight: %d\nSeconds from midnight: %d", hours, minute, minutes, seconds);
    }
}
