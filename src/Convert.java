import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Convert {
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of strings you want :");
        String [] string= new String[sc.nextInt()];
        sc.nextLine();
        for(int i=0;i< string.length;i++){
            string[i]=sc.nextLine();
        }
        List<String> str=new ArrayList<String>(Arrays.asList(string));
        System.out.println(str);
    }
}
