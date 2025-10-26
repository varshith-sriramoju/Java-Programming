package t4oops.Encapsulation;

public class Person {
    private String name = "Varshith";
    private int age = 21;
    private String gender = "male";

    public Person() {
        // defaults are provided at field declarations
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    //to avoid wrong age
    public boolean setAge(int age){
        if(age>0 && age<100){
        this.age=age;
        return true;
        }
        else{
            return false;
        }
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "my name is " + name + '\n' +
                "my age is " + age + " years old" + '\n' +
                "and i am " + gender;
    }
}
