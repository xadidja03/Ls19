package fileUtil;
import java.io.*;
import java.util.Scanner;
public class CustomFileWriter {
    public static void writeStringFile() throws IOException {
//////////////////stringle yazmaq
        File file = new File("C:\\Users\\user\\Documents\\java_lesson\\ls19\\Lesson19\\src\\fileUtil\\files\\file1.txt");
        if (!file.exists()) {
            System.out.println("file created");
            file.createNewFile();
        }
        Writer yaz = null;
        try {
            yaz = new FileWriter(file, false);
            String data = new Scanner(System.in).nextLine();
            System.out.println(data);
            char[] a = data.toCharArray();
            yaz.write(a);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                yaz.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
        //////////////////////////////byte-la yazmaq
    public  static void writeFileByte() {
        File book = new File("C:\\Users\\user\\Documents\\java_lesson\\ls19\\Lesson19\\src\\fileUtil\\files\\file2.txt");
        OutputStream write = null;
        String data = "write in file";
        try {
            write = new FileOutputStream(book, true);
            byte b[] = data.getBytes();
            write.write(b);
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            try {
                write.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
        ////////////////////object
    public static void writeFileObj(){
        File yol = new File("C:\\Users\\user\\Documents\\java_lesson\\ls19\\Lesson19\\src\\fileUtil\\files\\file3.txt");
        ObjectOutputStream num = null;
        try {
            num = new ObjectOutputStream(new FileOutputStream(yol));
            Student object = new Student();
            object.setAge(20);
            object.setName("Xedice");
            object.setSurName("Madnayeva");
            num.writeObject(object);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                num.close();
            } catch (Exception ex) {
                System.out.println("xeta");
            }
        }
    }
    }