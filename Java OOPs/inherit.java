class Shape{
    public void area(){
        System.out.println("Displays area");
    }

class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println((1/2)*b*h);
    }
class Equi extends Triangle{
    int side; 
    System.out.println(side*side);

}

}
}
public class inherit {
    public static void main(String[] args) {
        Equi t1=new Equi();
        t1.side=10

    }
    
}
