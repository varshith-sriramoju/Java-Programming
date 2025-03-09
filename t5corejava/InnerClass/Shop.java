package t5corejava.InnerClass;

/*
 * An inner class in Java is a class that is declared inside another class.
 * It helps in logically grouping related classes together and provides better encapsulation.
 */
//outer class
public class Shop {
    Lock lock =new Lock();
    public void shopStatus(){
        if(lock.isLocking()){
            System.out.println("Shop is closed");
        }
        else{
            System.out.println("Shop is open");
        }
    }
    /*
     * This method is a getter that provides controlled access to the private inner class Lock.

     Since Lock is an inner class, it cannot be accessed directly from outside the Shop class.

     The getLock() method returns the Lock instance, allowing external code to interact with it.
     */
    public Lock getLock(){
        return lock;
    }
    //if inner class is private, it can be accessed only within the outer class not outside the class
    //inner class
    class Lock{
        private boolean locking= true;

        public boolean isLocking(){
            return locking;
        }
        public void setLocking(boolean locking){
            this.locking=locking;
        }
    }
}
