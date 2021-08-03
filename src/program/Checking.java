package program;
import java.util.Arrays;
import java.util.Scanner;
public class Checking {
    public void containsThevalue(){
        int n,element;
        boolean test=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        System.out.println("enter the element to be checked:");
        element=sc.nextInt();
        for(int i=0;i<n;i++){
            if(array[i]==element){
               test=true;
               break;
            }
        }
        if(test){
            System.out.println(element + " is present in the given array");
        }
        else{
            System.out.println(element +" is not present in the given array");
        }
    }
}
