package task;

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
    void display(){
        System.out.println("values in constructor:" + num1+" "+num2+" "+str);
    }
}
public class ConstructorOverload{
    public static void main(String [] args){
        Construct obj1=new Construct();
        Construct obj2=new Construct(9);
        Construct obj3=new Construct(2,7);
        Construct obj4=new Construct(3,1,"Incubation");
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
