package t8Collections;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        //if LinkedHashSet prints in given order
        //if TreeSet in sort
        set.add(45);
        set.add(4);
        set.add(5);
        System.out.println(set);
        set.add(4);
        set.add(4);
        set.add(4);
        set.remove(5);
        System.out.println(set);
        System.out.println(set.contains(4));//bool
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);


        Set<Student> StuSet=new HashSet<>();
        StuSet.add(new Student("varshith", 1));
        StuSet.add(new Student("varshi", 2));
        StuSet.add(new Student("varsh", 3));
        StuSet.add(new Student("varshith", 4));
        System.out.println(StuSet.toString());
    }
}

class Student{
    String name;
    int rollNo;
    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString(){
        return "Student{"+
        "name:'"+name+"'"+
        "rollNum:'"+rollNo+"'}\n";
    }

}
