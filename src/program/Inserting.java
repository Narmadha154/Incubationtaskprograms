package program;
import java.util.Arrays;
import java.util.Scanner;
public class Inserting {
    public void insertTheElement(){
        int n,position,value;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        System.out.println("enter the index where new element to be inserted:");
        position=sc.nextInt();
        System.out.println("enter the value to be inserted:");
        value=sc.nextInt();
        int [] resultantarray=new int[array.length+1];
        System.arraycopy(array,0,resultantarray,0,position);
        resultantarray[position]=value;
        System.arraycopy(array,position,resultantarray,position+1,array.length-position);
        System.out.println("new array is " + Arrays.toString(resultantarray));
    }
}
