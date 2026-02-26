package t10Arrays;

public class _1create {
    public static void main(String[] args) {
        //primitive array
        int p_arr[]={1,2,3,4};
        int len=p_arr.length;
        System.out.println("primitive array");
        for(int i:p_arr){
            System.out.print(i);
        }
        //Non Primitive arrays
        String[] np_arr = new String[]{"varshi","tony","steve"};
        // or: String[] np_arr = {"varshi"};
        System.out.println("\nnon-primitive array");
        for (String s : np_arr) {
            System.out.print(s+" ");
        }
        int[] marks={95,85,70,99,65};
        int max_marks=marks[0];
        for(int i:marks){
            if(i>=max_marks){
                max_marks=i;
            }
        }
        System.out.println(max_marks);
        //operations
        //access and update
        System.out.println(marks[0]);
        marks[0]=100;
        System.out.println(marks[0]);
        //traverse
        for(int i:marks){
            System.out.print(i+" ");
        }
        System.out.println(marks.length);

    }
}
