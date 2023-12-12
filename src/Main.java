import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //FILE WRITER
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/text-file"));
            writer.write("Hello world");
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        //FILE READER
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/text-file"));
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
