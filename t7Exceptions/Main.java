package t7Exceptions;

public class Main {
    public static void main(String[] args) {
        Main m1= new Main();
        m1.case1(10,0); //normal
        m1.case2(10,0); //exception rised using try catch
    }
    public void case1(int x,int y){
        if(y!=0){
            System.out.println("x/y="+x/y);
        }else {
            System.out.println("the value y is 0 a possible exception");
        }
    }
    public void case2(int x,int y){
        try{
            System.out.println("x/y="+x/y);
        }
        catch (Exception e){
            System.out.println("the value y is 0 a possible exception:"+e); //gives 'e' exception
        }
    }
}
