package program;
import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public void findaverage(){
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        Arrays.sort(array);
        int maximum=array[n-1];
        int minimum= array[0];
        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        int newsum=sum-(maximum+minimum);
        int averageofintegers= newsum/(array.length-2);
        System.out.println("average of integers except largest and smallest values: " +averageofintegers);
    }
}
