public class Numbers {
    int a;
    int b;
    int c;
    int d;
    int e;
    public Numbers(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    public boolean different(){
        if (a!=b && a!=c && a!=d && a!=e && b!=c && b!=d && b!=e && c!=d && c!=e ){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(3,4,2,1,6);
        Numbers n2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(n1.different());
        System.out.println(n2.different());


    }
}