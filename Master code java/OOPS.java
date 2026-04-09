//even after swaping origial values wont change
//static vari can be changed using static methods

import java.util.Scanner;

class Bike{
    String engine;
    static String brand="Honda";
    int lights;
    int seats;

    Bike(String engine,int lights){
        this.engine=engine;
        this.lights=lights;
       }
      

    Bike(String engine,int lights,int seats){
        this.engine=engine;
        this.lights=lights;
        this.seats=seats;
       }
    
    Bike(Bike b){
        engine=b.engine;
        lights=b.lights;
        seats=b.seats;
    }
      void onEng(){
        System.out.println("Engine is turned "+this.engine);
        System.out.println("No. of lights are "+this.lights);
        System.out.println("No. of seats are "+this.seats);
        System.out.println("Bike brand "+brand);
       }
       
}
public class OOPS {
    public static void main(String[] args){
    Bike b1=new Bike("on",2);
    Bike b2=new Bike("off",4);
    Bike b3 =new Bike("on",2,4);
    b1.onEng();
    b2.onEng();
    b3.onEng();
    Bike b4=new Bike(b3); 
    }
}      