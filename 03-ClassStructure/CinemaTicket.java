public class CinemaTicket {
    static String cinemaName= "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    private int price;
    
    public CinemaTicket(int row) {
        this.row = row;
        if (row <= 2){
            price = 10;
        } else{
            price = 20;
            }
        
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "-----------------------------------------------------\nKino " + cinemaName + "\nzaprasza na film pt. " +'"' +filmTitle +'"' +"\nrzad: " + row + "      miejsce: " + seat + "\ncena biletu: " + price +"zl" + "\nDziekujemy za ogladanie filmow z legalnego zrodla.\nZyczymy milego seansu :)\n-----------------------------------------------------";
    }
}
