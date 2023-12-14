public class Clock {
    private int hour;
    private int minute;
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setHour(int hour) {
        if (hour>=0 && hour<=23){
            this.hour = hour;
        }
        
    }
    public void setMinute(int minute) {
        if (minute>=0 && minute <=59){
            this.minute = minute;
        }
        
    }
    public Clock(int hour, int minute) {
        this.setHour(hour);
        this.setMinute(minute);
    }
    
    public void addMinute(){
        minute++;
        if (minute==60){
            minute=0;
            hour++;
        }
        if (hour==24){
            hour=0;
        }
    }
    

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59);
        clock.addMinute();
        clock.addMinute();
        System.out.println(clock.getHour());
        System.out.println(clock.getMinute());
    }
}
