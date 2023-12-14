public class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        if (x==0){
            return true;
        } else {
            return false;
        }
    }
    public boolean isY(){
        if (y==0){
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String toString() {
        return String.format("P(%d,%d)", x,y);
    }

    public static void main(String[] args) {
        Point point = new Point(3,  0);
        System.out.println(point.isX());
        System.out.println(point.isY());
        System.out.println(point.toString());
    }


}
