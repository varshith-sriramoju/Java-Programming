/*breaks,no seq,code block{} is optional 
 all swith can be written in if else but not
 vice versa
 -->float cant be used
*/
package t2decision;
public class _3Switch {
    public static void main(String[] args) {
     /*    char x = 'S';
        switch (x) { // can have multiple cases in switch

            case 's':
            case 'S':
                System.out.println("the value of x is 1");
                break;
            case 'b':
                System.out.println("the value of x is 2");
                break;
            case 'c':
                System.out.println("the value of x is 3");
                break;
            default:
                System.out.println("the value of x is 1,2,3");
*/
                String name = "team";
                switch (name) {
                    case "Author":
                        System.out.println("Varsh");
                        break;
                    case "team":
                        System.out.println("Udemy");
                        break;
                    default:
                        System.out.println("invalid");
                }
        }

    }

