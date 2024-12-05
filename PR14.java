// Write a Java program “FileCopy.java” to copy contents (binary/text) of one file to 
// another and display appropriate message. The names of the files and copy mode 
// (binary/text) are getting through command line.
import java.io.*;
public class PR14 {

    public static void main(String[] args) {
        try{
        FileInputStream fs=new FileInputStream(args[0]);
        FileOutputStream fos=new FileOutputStream(args[1]);
        int data=fs.read();
        while (data !=-1) {
            fos.write(data);
            data=fs.read();
        }
        fs.close();
        fos.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
}