public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }
    static double circle(double r){
        return Math.PI*r*r;
    }
    static double triangle(double base, double height){
        return 0.5*base*height;
    }
    static double cuboid(double width , double length, double height){
        return (2*length*width)+(2*length*height)+(2*width*height);
    }
    static double sphere(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    static double cone(double r, double l){
        return Math.PI*r*l;
    }
}
