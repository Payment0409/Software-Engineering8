import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] a=new int[input.nextInt()];
        for (int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        System.out.println(a.length);
        tool tool1=new tool();
        tool1.MaxSubSumOfSequence(a);
    }
}
