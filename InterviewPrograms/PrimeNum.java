package InterviewPrograms;

public class PrimeNum {
    public static void main(String[] args) {
        isPrime(20);
        isPrime(5);
    }
    static void isPrime(int num){
        int m = num / 2;
        if (num <= 1) {
            System.out.println("not prime");
            return;
        }
        int flag = 0; // 0 => assume prime until a divisor is found
        for (int i = 2; i <= m; i++) {
            if (num % i == 0) { // check divisibility by i (not just 2)
                System.out.println("not prime");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("prime");
        }
    }
}
