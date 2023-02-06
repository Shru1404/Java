public class PolymorphismExample {

    public void add(int a, int b) {
        int z = a + b;
        System.out.println(z);
    }

    public void add(int a, int b, int c, int d) {
        int z = a + b + c + d;
        System.out.println(z);
    }

    public void add(double a, double b) {
        double z = a + b;
        System.out.println(z);
    }

    public static void main(String[] args) {
        PolymorphismExample pe = new PolymorphismExample();
        pe.add(2, 3);
        pe.add(2.5, 5.5);
        pe.add(2, 3, 5, 6);
    }
}