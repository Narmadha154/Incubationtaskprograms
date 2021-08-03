import java.util.Scanner;
public class StringReverse {
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String [] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        str = sc.nextLine();
        str=reverse(str);
        System.out.println("reversed string is: "+str);
    }
}
