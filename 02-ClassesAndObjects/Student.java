public class Student {
    public String name;
    public int age;
    public int id;
    public boolean valid;
    public int semester;
    public float average;
    
    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public void displayStudentData() {
        System.out.println("Name: " + name + " Semester: " + " Average grade: " + average);

    }


    public void changeStatus(boolean status){
        valid = status;
    }
    public void displayDetails(){
        String status = valid ? "Valid Student Card" : "Invalid Student Card";
        System.out.println(status + name + age + id );
    }

}
