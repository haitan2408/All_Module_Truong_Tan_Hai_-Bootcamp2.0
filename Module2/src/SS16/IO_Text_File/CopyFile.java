package SS16.IO_Text_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

    public static void writeFile(FileWriter fw, String str) {
        try {
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

    public static String readFile(FileReader fr) throws Exception {
        int i;
        String result="";
        while ((i = fr.read()) != -1) {
           result+=(char)i;
        }
        fr.close();
        return result;
    }

    public static void main(String[] args) throws Exception {
        String result=readFile(new FileReader("D:\\testout.txt"));
        writeFile(new FileWriter("D:\\testIn.txt"),result);

    }
}
