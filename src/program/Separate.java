package program;
import java.util.Arrays;
import java.util.Scanner;
public class Separate {
    public void separateEvenOdd(){
        int n,even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        for (int item : array) {
            if (item % 2 == 0)
                even++;
            else
                odd++;
        }
        int [] evenarray=new int[even];
        int [] oddarray=new int[odd];
        int j=0,k=0;
        for (int value : array) {
            if (value % 2 == 0) {
                evenarray[j] = value;
                j++;
            } else {
                oddarray[k] = value;
                k++;
            }
        }
        int [] newarray=new int[n];
        int l=0,m=0,p=0;
        while(l<even){
                newarray[p]=evenarray[l];
                p++;
                l++;
        }
        while(m<odd){
                newarray[p]=oddarray[m];
                p++;
                m++;
        }
        System.out.println("new array is :" + Arrays.toString(newarray));
    }
}
