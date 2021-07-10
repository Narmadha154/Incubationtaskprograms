import java.util.Scanner;
public class ReverseMessage{
    public static StringBuilder reverse_words(String s){
        StringBuilder output=new StringBuilder();
        String [] str=s.split("\\s");
        for(int i=str.length-1;i>=0;i--){
            output.append(str[i]);
            output.append(" ");
        }
        return output;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String string=sc.nextLine();
        StringBuilder output1=reverse_words(string);
        System.out.println("reversed string is:"+ output1);
    }
}
