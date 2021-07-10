enum Rainbow{
    VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
    int Colorcode;
    Rainbow(int code){
      Colorcode=code;
    }
    public int getColorcode(){
        return Colorcode;
    }
    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
public class EnumDemo{
    public static void main (String [] args){
        System.out.println("color code of "+ Rainbow.VIOLET+" is "+ Rainbow.VIOLET.getColorcode());
        System.out.println("color code of "+ Rainbow.INDIGO +" is "+ Rainbow.INDIGO.getColorcode());
        System.out.println("color code of "+ Rainbow.BLUE +" is "+ Rainbow.BLUE.getColorcode());
        System.out.println("color code of "+ Rainbow.GREEN +" is "+ Rainbow.GREEN.getColorcode());
        System.out.println("color code of "+ Rainbow.YELLOW +" is "+ Rainbow.YELLOW.getColorcode());
        System.out.println("color code of "+ Rainbow.ORANGE +" is "+ Rainbow.ORANGE.getColorcode());
        System.out.println("color code of "+ Rainbow.RED +" is "+ Rainbow.RED.getColorcode());
    }
}
