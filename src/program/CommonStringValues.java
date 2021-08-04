package program;

import java.util.Arrays;
import java.util.Scanner;

public class CommonStringValues {
    public void findCommonStrings(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of strings for first array:");
        String[]string1=new String[sc.nextInt()];
        sc.nextLine();
        for(int i=0;i<string1.length;i++){
            string1[i]=sc.nextLine();
        }
        System.out.println("first string array is :" + Arrays.toString(string1));
        System.out.println("enter the number of strings for second array:");
        String[]string2=new String[sc.nextInt()];
        sc.nextLine();
        for(int i=0;i<string2.length;i++){
            string2[i]=sc.nextLine();
        }
        System.out.println("second string array is :" + Arrays.toString(string2));
        for (String s : string1) {
            for (String value : string2) {
                if (s.equals(value)) {
                    System.out.println("common string is :" + s);
                    break;
                }
            }
        }
    }


}
