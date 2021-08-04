package program;
import java.util.Arrays;
import java.util.Scanner;
public class EvenOdd {
    public void findEvenOdd(){
        int n,even=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array));
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            }
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + (array.length-even));
    }
}
