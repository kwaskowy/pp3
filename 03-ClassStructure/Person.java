public class Person {
    String name;
    int weight;
    double height;
    double bmi;
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public void setWeightAndHeight(int weight, double height) {
        this.weight=weight;
        this.height=height;
    }
    public String calculateBMI(){
        bmi = weight/(height*height);
        if (bmi<18.5){
            return "BMI too low"+"\nYour BMI is:"+bmi;
        } else if(bmi>24.9){
            return "BMI too high"+"\nYour BMI is:"+bmi;
        } else {
            return "BMI correct"+"\nYour BMI is:"+bmi;
        }
    }
    public void displayRecord(){
        System.out.printf("Name: %s  \nWeight: %d \nHeight: %.1fm \nBMI: %.2f ",name,weight,height,bmi);
    }

}