package program;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicate {
    public void removeDuplicateElements(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if (array[i] == array[j]) {
                    array[j] = array[n-1];
                    n--;
                    j--;
                }
            }
        }
        int [] array1=Arrays.copyOf(array,n);
        System.out.println("after removing duplicate elements new array is: " + Arrays.toString(array1));
    }
}
