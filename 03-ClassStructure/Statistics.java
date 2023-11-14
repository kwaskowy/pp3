public class Statistics {
    public static int range(int x,int y){
        int num = 0;
        while (x-1<y){
            num++;
            x++;
        }
        return num;
    }
    public static int sum(int x, int y){
        int num = 0;
        while (x-1<y){
            num+=x;
            x++;
        }
        return num;
    }
    public static double mean(int x, int y){
        return (double) Statistics.sum(x, y)/Statistics.range(x, y);
    }
}