package program;
import java.util.Arrays;
import java.util.Scanner;
public class Insert {
    public void insertTheElement(){
        int n,value,index;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted array is : " + Arrays.toString(array));
        System.out.println("enter the index:");
        index=sc.nextInt();
        System.out.println("index is:"+ index);
        System.out.println("enter the value:");
        value=sc.nextInt();
        System.out.println("value is:"+ value);
        int [] newArray=new int[n+1];
        for(int i=0,j=0;i<n&j<=n;i++,j++){
            if (index == j) {
                newArray[j] = value;
                i--;
            }
            if(index!=j){
                newArray[j]=array[i];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println("new array is :" + newArray[i]);
        }
    }

}
