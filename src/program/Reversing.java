package program;

import java.util.Arrays;
import java.util.Scanner;

public class Reversing {
    public void reversingthearray(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        for(int i=0;i<n/2;i++){
            int temp=array[i];
            array[i]=array[n-1-i];
            array[n-1-i]=temp;
        }
        System.out.println("Reversed array is: "+ Arrays.toString(array));
    }
}
