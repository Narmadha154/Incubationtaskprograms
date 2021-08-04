package program;
import java.util.Arrays;
import java.util.Scanner;
public class Leaders {
    public void findLeaders(){
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
        int j;
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(array[i]<=array[j]) {
                    break;
                }
            }
            if(j==n) {
                System.out.println("leader element:" + array[i]);
            }
        }
    }
}
