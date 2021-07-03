package program;

import java.util.Arrays;
import java.util.Scanner;

public class TargetValue {
    public void sumoftwoelements(){
        int n,count=0,target;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        System.out.println("enter the target value :");
        target=sc.nextInt();
        System.out.println("two elements whose sum is equal to the target value are:");
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j <n; j++) {
                if ((array[i] + array[j]) == target) {
                    count++;
                    System.out.println("("+ array[i] + "," + array[j]+")");
                }
            }
        }
        System.out.println("count of pairs is:" + count);
    }
}
