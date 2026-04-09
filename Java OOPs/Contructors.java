 class parametrized {
    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    parametrized(String name, int age) {
        this.name = name;
        this.age = age;
    }

   }
class Copy_con {
        String name;
        int age;

        public void info() {
            System.out.println(this.name);
            System.out.println(this.age);
        }

Copy_con(Copy_con s2) {
            this.name = s2.name;
            this.age = s2.age;
        }
    }

public class Contructors {
    public static void main(String[] args) {
        parametrized s1=new parametrized("varsh",19);
        s1.info();

        Student s2=new Student();
        s2.name="Pav";
        s2.age=18;
        Copy_con  c1 = new Copy_con(); 
          

    }
}
