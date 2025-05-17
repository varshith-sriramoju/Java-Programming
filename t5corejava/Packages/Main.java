package t5corejava.Packages;//current class
//package is to tell where from "this" class
import t5corejava.Packages.Pack1.Home;//using other class
//import for those who need "other" class in "this" class

public class Main {
    public static void main(String[] args) {
        Home h1= new Home();
        h1.message();

        t5corejava.Packages.Pack2.Home h2=new t5corejava.Packages.Pack2.Home();
        h2.message();

    }
}
