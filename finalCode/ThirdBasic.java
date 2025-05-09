package finalCode;

class Point{
    int x,y;
}
public class ThirdBasic {
    public static void main(String[] args) {
        fun();
        Point p= new Point();
        p.x=10;
        p.y=20;
        fun2(p);//method
        System.out.println(p.x+" "+p.y); //local

        for(int i=0;i<5;i=i+2){
            System.out.println("hello"+i);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.print(num);
        }

        int[] a={1,2,1,3,2};
        int max=a[0]; //1
        for(int i:a){
            if(i>max)
                max=i;
        }
        System.out.println("max is "+max);



    }


    static void fun2(Point p){
        p=new Point();
        p.x=11;
        p.y=12;
        System.out.println(p.x+" "+p.y);
    }

    public static void fun(){
        System.out.println("basic function");
        fun1();
    }
    static void fun1(){
        System.out.println("function inside fun()");
    }



}
