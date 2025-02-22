/*default else wil be executed */
package Decision;

public class _2Decision {
    public static void main(String[] args) {
        /*
         * int x = 6, y = 4;
         * if (x == 5) {
         * System.out.println("value is 6");
         * } else {
         * System.out.println("value is not 6");
         * }
         * 
         * boolean a = true;
         * boolean b = false;
         * if (a && b) {
         * System.out.println("condition is true");
         * } else {
         * System.out.println("comdition is false");
         * }
         * boolean z = !(4 > 5);// unary oper has 2 operands
         * System.out.println(z);
         * 
         * boolean d;
         * d = (5 > 4) ? true : false; // ternary oper has 3 operands
         * System.out.println(d);
         */

        int x = 1;
        if (x == 3) {
            System.out.println("x equals to 3");
        } else if (x > 2) {
            System.out.println("x is lesser than 2");
        } else if (x <= 1) {
            System.out.println("x is equal to 1");
        } else {
            System.out.println("nooo");
        }
    }
}
