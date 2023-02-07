import fileUtil.CustomFileReader;
import fileUtil.CustomFileWriter;
import fileUtil.Student;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("---------Write in file zone------------");
        CustomFileWriter.writeStringFile();
        CustomFileWriter.writeFileByte();
        CustomFileWriter.writeFileObj();

        System.out.println("---------Read in file zone------------");
        CustomFileReader.readFileString();
        CustomFileReader.readFileByte();
        CustomFileReader.readObj();


    }
}
