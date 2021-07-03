package program;
import java.util.Scanner;
public class Task1Runner {
    public static void main(String [] args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the program number");
        number=sc.nextInt();
        switch(number) {
            case 1:
                Index b = new Index();
                b.findIndex();
                break;
            case 2:
                SumValues values = new SumValues();
                values.sumofvalues();
                break;
            case 3:
                Removal element = new Removal();
                element.removeTheElement();
                break;
            case 4:
                Inserting newvalue = new Inserting();
                newvalue.insertTheElement();
                break;
            case 5:
                Checking theelement = new Checking();
                theelement.containsThevalue();
                break;
            case 6:
                Maxmin num = new Maxmin();
                num.findmaximini();
                break;
            case 7:
                CommonStringValues strings=new CommonStringValues();
                strings.findcommonstrings();
                break;
            case 8:
                Common commonone = new Common();
                commonone.findcommonelements();
                break;
            case 9:
                RemoveDuplicate elementsofarray = new RemoveDuplicate();
                elementsofarray.removeDuplicateElements();
                break;
            case 10:
                EvenOdd integers = new EvenOdd();
                integers.findevenodd();
                break;
            case 11:
                Average avg = new Average();
                avg.findaverage();
                break;
            case 12:
                TargetValue sum=new TargetValue();
                sum.sumoftwoelements();
                break;
            case 13:
                Reversing arrayofintegers = new Reversing();
                arrayofintegers.reversingthearray();
                break;
            case 14:
                Separate evenandodd = new Separate();
                evenandodd.separateEvenOdd();
                break;
            case 15:
                Sorting sort = new Sorting();
                sort.sortingofarray();
                break;
            case 16:
                Leaders lead=new Leaders();
                lead.findleaders();
                break;
        }
    }
}
