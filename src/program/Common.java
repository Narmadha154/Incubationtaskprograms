package program;
import java.util.Arrays;
import java.util.Scanner;
public class Common {
    public void findcommonelements() {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        System.out.println("enter the array size:");
        m = sc.nextInt();
        int[] array2 = new int[m];
        System.out.println("enter the elements:");
        for (int i = 0; i < m; i++)
            array2[i] = sc.nextInt();
        System.out.println("second Array elements are :" + Arrays.toString(array2));
        for (int k : array) {
            for (int i : array2) {
                if (k == i) {
                    System.out.println("common element is :" + k);
                    break;
                }
            }
        }
    }
}
