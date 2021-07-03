package program;

import java.util.Arrays;
import java.util.Scanner;

public class SumValues {
    public void sumofvalues(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        int sum= Arrays.stream(array).sum();
        System.out.println(" sum of values in a numeric array is " + sum);
    }
}
