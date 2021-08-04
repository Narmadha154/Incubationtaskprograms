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
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array));
        for (int item : array) {
            if (item % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        int [] evenArray=new int[even];
        int [] oddArray=new int[odd];
        int j=0,k=0;
        for (int value : array) {
            if (value % 2 == 0) {
                evenArray[j] = value;
                j++;
            } else {
                oddArray[k] = value;
                k++;
            }
        }
        int [] newArray=new int[n];
        int l=0,m=0,p=0;
        while(l<even){
                newArray[p]=evenArray[l];
                p++;
                l++;
        }
        while(m<odd){
                newArray[p]=oddArray[m];
                p++;
                m++;
        }
        System.out.println("new array is :" + Arrays.toString(newArray));
    }
}
