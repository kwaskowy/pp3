public class Product {
    private String name;
    private boolean veg;
    public String getName() {
        return name;
    }
    public boolean isVeg() {
        return veg;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVeg(boolean veg) {
        this.veg = veg;
    }
    

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Jarmuż");
        p1.setVeg(true);
        Product p2 = new Product();
        p2.setName("Futomaki");
        p2.setVeg(false);
        System.out.println(p1.getName());
        System.out.println(p1.isVeg());
        System.out.println(p2.getName());
        System.out.println(p2.isVeg());
    }
}
