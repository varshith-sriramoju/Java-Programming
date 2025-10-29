package InterviewPrograms;

public class LargestEleArray {
    public static void main(String[] args) {
        int[] arr={1,2,33,44,11,23};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];//update largest
            }
        }
        System.out.println("largest element is:"+largest);
    }
}
