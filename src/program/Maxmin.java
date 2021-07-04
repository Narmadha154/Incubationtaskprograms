package program;
import java.util.Arrays;
import java.util.Scanner;

public class Maxmin {
    public void findmaximini(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
       int maximum= Arrays.stream(array).min().getAsInt();
       int minimum= Arrays.stream(array).max().getAsInt();
       System.out.println("Minimum value is " + maximum);
       System.out.println("Maximum value is " + minimum);
    }
}
