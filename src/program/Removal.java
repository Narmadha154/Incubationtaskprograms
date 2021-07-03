package program;
import java.util.Arrays;
import java.util.Scanner;
public class Removal {
    public void removeTheElement() {
        int n,index;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        System.out.println("enter the index to be removed:");
        index = sc.nextInt();
        if (n - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, n - 1 - index);
        n=n-1;
        int [] array1=Arrays.copyOf(array,n);
        System.out.println("Resultant array is" + Arrays.toString(array1));
    }
}