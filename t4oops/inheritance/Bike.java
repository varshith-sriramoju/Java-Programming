package t4oops.inheritance;
public class Bike extends _4Vechile{
    public String handle;

    /*
     * super() is used to call the constructor of the parent class.
     * If super() is not used, the default constructor of the parent class is called.
     * If super() is used, the constructor with the matching parameters is called.
     * super() should be the first statement in the constructor.
     * super() can be used only in constructors.
     * super() is used to call the constructor of the parent class.
     */
     public Bike(){
        super();
        this.handle="short";
     }
    public Bike(String handle) {
        super();
        this.handle = handle;
    }
    public String getHandle() {
        return handle;
    }

     
}
