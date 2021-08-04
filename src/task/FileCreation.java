package task;
import java.io.*;

public class FileCreation {
    public static void main(String [] args) {
        try (FileWriter writer = new FileWriter("sample.txt")) {
            writer.write("programmatically created file");
            writer.write('\n');
            writer.write("These lines were written progrmmatically");
            writer.write('\n');
            writer.write("All is well.Be happy & enjoy the moment");
            writer.write('\n');
        } catch (Exception e) {
            System.out.println("some exceptions are coming");
        }
    }
}
