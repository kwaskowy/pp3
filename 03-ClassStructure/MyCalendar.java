public class MyCalendar {
    static int year = 2023;
    static int month = 9;
    static int day = 11;
    static String[] name= {"Styczen", "Luty", "Marzec", "Kwiecien", "Maj", "Czerwiec", "Lipiec", "Sierpien", "Wrzesien", "Pazdziernik", "Listopad", "Grudzien"};
    static int[] len= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
    static String myDate(){
        return String.format("%d-%02d-%02d", MyCalendar.year, MyCalendar.month, MyCalendar.day);
    }

    /*
     * Returns the number of days
     * from the beginning of year
     * 
     */
    static int days(){
        int sumDni= day;
        for (int i = 0; i<(month-1); i++){
            sumDni+= len[i];
        }
        return sumDni;
    }
    static String monthName(){
        return name[month-1];
    }
    public static void main(String[] args) {
        System.out.println(MyCalendar.myDate());
        System.out.println(MyCalendar.days());
        System.out.println(MyCalendar.monthName());
    }
}
