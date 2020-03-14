package SS16.IO_Text_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String csvFile = "E:\\WorkSpace\\CodeGym\\Training\\TrainningAllModule\\Truong_Tan_Hai\\Module2\\src\\SS16\\IO_Text_File\\country.csv";
        String line;
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
