package t5corejava.InnerClass;

public class Main {
    public static void main(String[] args) {
        Shop s1=new Shop();
        s1.shopStatus();
        s1.getLock().setLocking(false);
        s1.shopStatus();
    }
}
