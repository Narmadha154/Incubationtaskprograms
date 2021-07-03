package program;
import java.util.Arrays;
import java.util.Scanner;
public class Index {
    public void findIndex() {
        int r,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        System.out.println("enter the element for which you want the index:");
        r = sc.nextInt();
        System.out.println("Index position is:"+ Arrays.binarySearch(array,r));
    }
}


