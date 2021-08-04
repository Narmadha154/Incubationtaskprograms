package task;

enum Rainbow{
    VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
    private int colorCode;
    Rainbow(int ColorCode){
      this.colorCode =ColorCode;
    }
    public int getColorCode(){
        return this.colorCode;
    }
}
public class EnumDemo{
    public static void main (String [] args){
        for(Rainbow color:Rainbow.values()) {
            System.out.println("color code of " +color+ " is " + color.getColorCode());
        }
    }
}
