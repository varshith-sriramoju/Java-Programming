//using same method multiple times with differ parameters
public class _3MethodOver {
    public static void main(String[] args) {

        System.out.println(Area(22)); //sq
        System.out.println(Area(11, 11)); //re
    }

    public static double Area(double length, double breath) {
        return length * breath;
    }
    public static double Area(double side){
        return side*side;
        }
}
