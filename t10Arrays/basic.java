package t10Arrays;

public class basic {
    public static void main(String[] args) {
        int nn[]={1,2,3};
        System.out.println(nn[2]);
        int n[]=new int[2];
        for(int i:n){
            System.out.print(n[i]);
        }

        System.out.println();
        //Mul dim array 2D
        int nums[][]=new int[3][4];

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i[]:nums){
            for(int j:n){
                System.out.print(j+' ');
            }
            System.out.println();
        }
        /*
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }*/

        //3D
        int num[][]=new int[3][];
        num[0]=new int[4];
        num[1]=new int[2];
        num[2]=new int[3];

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i[]:num){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}
