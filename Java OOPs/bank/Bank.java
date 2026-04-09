package bank;

class Account {
   public String name;
   protected String email;
   private String password;

   //getters and setters 
   public String getPassword(){
    return this.password;
   }
   public void setPassword(String pass){
    this.password=pass;
   }
}
public class Bank {
    public static void main(String[] args) {
        Account A1=new Account();
        A1.name="Apna";
        A1.email="something@gmail.com";
        A1.setPassword("abcd");
        System.out.println(A1.getPassword());
    }
}
