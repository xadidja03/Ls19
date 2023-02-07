package fileUtil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class CustomFileReader {

    public static void readFileString() throws IOException {

        Path fileName = Path.of("C:\\Users\\user\\Documents\\java_lesson\\ls19\\Lesson19\\src\\fileUtil\\files\\file1.txt");
        String str = Files.readString(fileName);// stringle oxumaq
        System.out.println(str);
    }

    /////////////////byte
    public static void readFileByte() {
        InputStream read = null;
        File obj = new File("C:\\Users\\user\\Documents\\java_lesson\\ls19\\Lesson19\\src\\fileUtil\\files\\file2.txt");
        try {
            read = new FileInputStream(obj);
            byte[] bytes = new byte[(int) obj.length()];
            read.read(bytes);
            String data = new String(bytes);
            System.out.println(data);
        } catch (Exception exception) {
            System.out.println("Exception");
        } finally {
            try {
                read.close();
            } catch (Exception exception) {
                exception.getStackTrace();
            }
        }
    }
    public static void readObj(){
        File yol=new File("C:\\Users\\user\\Documents\\java_lesson\\ls19\\Lesson19\\src\\fileUtil\\files\\file3.txt");
        ObjectInputStream oxu=null;
        try {
            oxu=new ObjectInputStream(new FileInputStream(yol));
            Student s=(Student)oxu.readObject();
            System.out.println(s.getName()+s.getSurName());
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            try {
                oxu.close();
            }catch (Exception e) {
                System.out.println("xeta");
            }
            }
}

}

