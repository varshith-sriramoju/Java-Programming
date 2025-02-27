package t4oops.inheritance.test;
import t4oops.inheritance.test.Animal;
public class Reptile extends Animal{
    private String skinType;
    private boolean Backbone;
    private String eggs;

    public Reptile(){
        super();
        this.skinType="null";
        this.Backbone=false;
        this.eggs="null";

    }
    public Reptile(int height,int weight,String animalType,String bloodType,String skinType,boolean Backbone,String eggs){
        super(height,weight,animalType,bloodType);
        this.eggs=eggs;
        this.Backbone=Backbone;
        this.skinType=skinType;
        
    }

    public String showInfo(){
        return "Animnal has "+getheight()+"ft height,weight about "+getweight()+"kgs,"+
        "with animal of type "+getanimalType()+" and with blood group "+getbloodType()+
        "with skin type "+skinType+" and with backbone "+Backbone+" and with eggs "+eggs;
    }


    
}
