package t9MulThred;

class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("hi");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}
public class MulThred{
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        System.out.println("Priority:"+t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        try{
                Thread.sleep(5000);
            }catch(InterruptedException e){}
        t2.start();
    }
}
