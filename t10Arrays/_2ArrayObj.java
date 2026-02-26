package t10Arrays;

class Student {
    public String name;
    public int roll_num;

    Student(int roll_num, String name) {
        this.roll_num = roll_num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{roll_num=" + roll_num + ", name='" + name + "'}";
    }
}

public class _2ArrayObj {
    public static void main(String[] args) {
        Student[] arr;// declare
        arr = new Student[3];// allocating
        arr[0] = new Student(1, "varshith");
        arr[1] = new Student(2, "varshi");
        arr[2] = new Student(3, "varshu");
        for (Student i : arr) {
            System.out.println(i);
        }
        Student[] arr1 = new Student[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Student(i + 1, "name" + (i + 1));
        }

    }
}
