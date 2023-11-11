public class Lamp {
    boolean isOn = false;
    public void switchOn(){
        isOn= true;
    }
    public void switchOff(){
        isOn= false;
    }
    public void displayInfo() {
        System.out.println(isOn ? "Lamp is on." : "Lamp is off.");
    }
}
