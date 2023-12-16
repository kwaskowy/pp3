public class Triangle extends Shape {
    double a;
    double b;
    double c;
    double p=0;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public double perimeter() {
        return a+b+c;
    }
    
 
}
