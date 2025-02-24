package t1basic;
/*type casting:
1 implicit is done by java (widening) 
 i.e converting low to high 
byte->short->int>-long>-float->double
8     16     32  64   32   64
double cant be stored in float 

2 explicit typecating narowing
  i.e converting high to low data loss
byte<-short<-int<-long<-float<-double
by user
*/
public class _2Tpecasting {
  public static void main(String[] args) {
    int y = 10;
    short x = (byte) y;
    System.out.println(y);

    float v1 = 10.01111f; // end f and d for double
    double v2 = (double) v1;
    System.out.println("double value is "+v1);

    // High to low data loss
    double v3 = 20.11233d;
    float v4 = (float) v3;
    System.out.println("float value is "+v4);

    // no string to int nd reverse
    // String s = "10";
    // int d = (int)s;
    //not possible


    float f = 10.00f;
    long l = (long) f;
    System.out.println(l);

  }
}
// why programmers prefer implicit int to long
// as no data loss

