package t5corejava.localInnerCLass;

public class Main {
    public static void main(String[] args) {
    //     if (args.length == 0) {
    //         System.out.println("Please provide a key as an argument.");
    //         return;
    //     }

        Door d1 = new Door();
        if (d1.isLocked(args[0])) {
            System.out.println("door is locked");
        } else {
            System.out.println("Door is open");
        }
    }
}