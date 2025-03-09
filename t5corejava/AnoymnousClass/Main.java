package t5corejava.AnoymnousClass;
class Main{
    public static void main(String[] args) {

        //Anonymous class implementation
        //this means we are creating a class that extends Lock class
        //and overriding the getcode method
        if(new Lock().getcode().equals("123456")){//cmd line argument
            System.out.println("Lock is open");
        }
        else{
            System.out.println("Lock is closed");
        }
    }
}