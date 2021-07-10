
class Construct {
    int num1,num2;
    String str;
    public Construct(){
        num1=5;
        num2=0;
        str="Nothing";
    }
    public Construct(int i){
        num1=i;
        num2=3;
        str="Nothing";
    }
    public Construct(int i, int j){
        num1=i;
        num2=j;
        str="Hello";
    }
    public Construct(int i, int j, String s){
        num1=i;
        num2=j;
        str=s;
    }
}
public class ConstructorOverloading{
    public static void main(String [] args){
        Construct obj1=new Construct();
        Construct obj2=new Construct(9);
        Construct obj3=new Construct(2,7);
        Construct obj4=new Construct(3,1,"Incubation");
        System.out.println("values in first constructor:" + obj1.num1+" "+obj1.num2+" "+obj1.str);
        System.out.println("values in second constructor:" + obj2.num1+" "+obj2.num2+" "+obj2.str);
        System.out.println("values in third constructor :" + obj3.num1+" "+obj3.num2+" "+obj3.str);
        System.out.println("values in fourth constructor:" + obj4.num1+" "+obj4.num2+" "+obj4.str);
    }
}
