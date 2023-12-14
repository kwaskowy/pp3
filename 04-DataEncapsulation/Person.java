public class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAdult(){
        if (age>=18){
            return true;
        } else{ return false;
        }
    }



    
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    @Override
    public String toString() {
        return String.format("%s,%d", name,age);
    }

    public static void main(String[] args) {
        Person p = new Person("Anna",21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p.toString());
    }





}
