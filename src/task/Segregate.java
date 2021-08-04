package task;

import java.util.Scanner;
import java.util.Arrays;
public class Segregate {
    public static void main(String [] args) {
        int n, zero = 0, one = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are :" + Arrays.toString(array));
        for (int item : array) {
            if (item == 0) {
                zero++;
            }
            else {
                one++;
            }
        }
        int[] zeroArray = new int[zero];
        int[] oneArray = new int[one];
        int j = 0, k = 0;
        for (int value : array) {
            if (value == 0) {
                zeroArray[j] = value;
                j++;
            } else if(value==1){
                oneArray[k] = value;
                k++;
            }
        }
        int[] newArray = new int[n];
        int l = 0, m = 0, p = 0;
        while (l < zero) {
            newArray[p] = zeroArray[l];
            p++;
            l++;
        }
        while (m < one) {
            newArray[p] = oneArray[m];
            p++;
            m++;
        }
        for(int i=0;i<j+k;i++) {
            System.out.println("new array is :" + newArray[i]);
        }
    }
}
