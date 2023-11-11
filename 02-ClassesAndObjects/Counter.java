public class Counter {
    int value=0;
    public void incBy1(){
        value+=1;
    }
    public void decBy1(){
        value-=1;
    }
    public void incBy10(){
        value+=10;
    }
    public void decBy10(){
        value-=10;
    }
    public void display(){
        System.out.println("Counter status: "+value);
    }
}
