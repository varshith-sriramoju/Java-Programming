package t4oops.Encapsulation;
public class _2Hello {
    public static void main(String[] args){
        _2CarCon car=new _2CarCon("closed","on","seated",10);
        _2CarCon car1=new _2CarCon();
         System.out.println(car.run());
         System.out.println(car1.run());
        }
}
/*if custom constructor created then no default constructor */