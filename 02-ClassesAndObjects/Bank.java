public class Bank {
    public static void main(String[] args) {
        float buy = 4.5940f;
        float sell = 4.6250f;
        float spread = sell - buy;
        System.out.printf("Bank buys EUR: %.4f\nBank sells EUR: %.4f\nSpread: %.4f", buy, sell, spread);
    }
}
