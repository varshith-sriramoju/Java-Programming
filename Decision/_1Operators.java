package Decision;

/* 
 Operators are entity perform operations
 1.assignment oper:= += -= *= /= %= and as it is 
 2.arthmatic oper:+ - * / % ++ --(unary)
 3.comparision oper:== != >= <= > < 
 4.Logical oper: &&(true and true) || !
*/
public class _1Operators {
    public static void main(String[] args) {
        int x = 1 + 2;
        String s = "hello" + " world"; // cancatnate
        int y = 5 - x;
        System.out.println(s);
        System.out.println(x);

        int a=11;                //    (direct)pre<--a-->post(print again)
        System.out.println(a++); // here still 11 as 
        System.out.println(a); // now a = 12
        System.out.println(a--); 
        System.out.println(--a); 

    }
}
