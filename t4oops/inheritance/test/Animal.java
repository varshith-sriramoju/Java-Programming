package t4oops.inheritance.test;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    public Animal(){
        this.height=0;
        this.weight=0;
        this.animalType="null";
        this.bloodType="null";
    }
    public Animal(int height,int weight,String animalType,String bloodType){
        this.height=height;
        this.weight=weight;
        this.animalType=animalType;
        this.bloodType=bloodType;
    }

    public void setheight(int height){
        this.height=height;
    }
    public int getheight(){
        return height;
    }

    public void setweight(int weight){
        this.weight=weight;
    }
    public int getweight(){
        return weight;
    }

    public void setanimalType(String animaString){
        this.animalType=animaString;
    }
    public String getanimalType(){
        return animalType;
    }
    
    public void setbloodType(String bloodType){
        this.bloodType=bloodType;
    }
    public String getbloodType(){
        return bloodType;
    }

    public String showInfo(){
        return "Animnal has "+height+"ft height,weight about "+weight+"kgs,"+
        "with animal of type "+animalType+" and with blood group "+bloodType;
    }

    

}
