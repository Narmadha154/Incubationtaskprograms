package program;
import java.util.Arrays;
import java.util.Scanner;
public class Common {
    public void findCommonElements() {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array1=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array1));
        System.out.println("enter the array size:");
        m = sc.nextInt();
        int[] array2 = new int[m];
        System.out.println("enter the elements:");
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("second Array elements are :" + Arrays.toString(array2));
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    System.out.println("common element is :" + k);
                    break;
                }
            }
        }
    }
}
