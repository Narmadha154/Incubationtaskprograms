package program;
import java.util.Scanner;
public class TaskRunner {
    public static void main(String [] args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the program number");
        number=sc.nextInt();
        switch(number) {
            case 1:
                Index index = new Index();
                index.findIndex();
                break;
            case 2:
                SumValues values = new SumValues();
                values.sumOfValues();
                break;
            case 3:
                Remove element = new Remove();
                element.removeTheElement();
                break;
            case 4:
                Insert newValue = new Insert();
                newValue.insertTheElement();
                break;
            case 5:
                Check theElement = new Check();
                theElement.containsTheValue();
                break;
            case 6:
                Maxmin num = new Maxmin();
                num.findMaxiMini();
                break;
            case 7:
                CommonStringValues strings=new CommonStringValues();
                strings.findCommonStrings();
                break;
            case 8:
                Common commonOne = new Common();
                commonOne.findCommonElements();
                break;
            case 9:
                RemoveDuplicate elementsOfArray = new RemoveDuplicate();
                elementsOfArray.removeDuplicateElements();
                break;
            case 10:
                EvenOdd integers = new EvenOdd();
                integers.findEvenOdd();
                break;
            case 11:
                Average average= new Average();
                average.findAverage();
                break;
            case 12:
                TargetValue sum=new TargetValue();
                sum.sumOfTwoElements();
                break;
            case 13:
                Reverse arrayOfIntegers = new Reverse();
                arrayOfIntegers.reversingTheArray();
                break;
            case 14:
                Separate evenAndOdd = new Separate();
                evenAndOdd.separateEvenOdd();
                break;
            case 15:
                Sort sort = new Sort();
                sort.sortingOfArray();
                break;
            case 16:
                Leaders lead=new Leaders();
                lead.findLeaders();
                break;
            default:
                System.out.println("no program");
                break;
        }
    }
}
