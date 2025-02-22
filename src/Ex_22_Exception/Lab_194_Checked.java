package Ex_22_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_194_Checked {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:\\atb.txt");//Checked exception
    }
}
