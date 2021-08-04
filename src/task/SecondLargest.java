package task;

import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array));
        Arrays.sort(array);
        int index=n-1;
        while(array[index]==array[n-1]){
            index--;
        }
        System.out.println("second largest element is " + array[index]);
    }
}
