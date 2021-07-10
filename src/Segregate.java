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
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        System.out.println("Array elements are :" + Arrays.toString(array));
        for (int item : array) {
            if (item == 0)
                zero++;
            else
                one++;
        }
        int[] zeroarray = new int[zero];
        int[] onearray = new int[one];
        int j = 0, k = 0;
        for (int value : array) {
            if (value == 0) {
                zeroarray[j] = value;
                j++;
            } else {
                onearray[k] = value;
                k++;
            }
        }
        int[] newarray = new int[n];
        int l = 0, m = 0, p = 0;
        while (l < zero) {
            newarray[p] = zeroarray[l];
            p++;
            l++;
        }
        while (m < one) {
            newarray[p] = onearray[m];
            p++;
            m++;
        }
        System.out.println("new array is :" + Arrays.toString(newarray));
    }
}
