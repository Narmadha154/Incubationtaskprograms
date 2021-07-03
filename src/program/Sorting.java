package program;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public void sortingofarray(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted array is: "+Arrays.toString(array));
    }
}
