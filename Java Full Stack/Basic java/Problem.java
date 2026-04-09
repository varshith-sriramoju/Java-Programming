public class Problem {
    public static void main(String[] args) {
        int a = 23;
        float b = 23.4f;
        double value = (a * a + 2 * (a * b) + b * b);
        System.out.println(value);
        int value1 = (int) value;
        System.out.println(value1);
        float value2 = (int) value;
        System.out.println(value2);

        // converting high to low explicting
        // if its double then to int or float
    }
}
