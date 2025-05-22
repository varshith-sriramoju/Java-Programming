package StarProgram;
import java.util.Scanner;
public class TrinagleStar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number of rows in triangle:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){//to print number of rows that form a triangle
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
