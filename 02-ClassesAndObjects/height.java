    public class height {
    public static void main(String[] args) {
        int cm = 185;
        float foot = cm * 0.032808f;
        int footRounded = Math.round(foot);

        float inch = (foot - footRounded) * 12;
        int inchRounded = Math.round(inch);

        
        System.out.println("I am " + cm + "cm tall, i.e. " + footRounded + " foot and " + inchRounded + " inches");
    }
    
}

