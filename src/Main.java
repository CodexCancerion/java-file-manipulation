import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //FILE WRITER
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/text-file"));
            writer.write("Hello world");
            writer.write("\nHello again");
            writer.write("\nHello Iverson");
            writer.write("\n90 degrees");
            writer.write("\nHello Jerick");
            writer.write("\nThank you");
            writer.write("\nBrother");
            writer.write("\nThank you");
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        //FILE READER
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/text-file"));
            String line;
            do {
                line = reader.readLine();
                System.out.println(line);
            }while (line != null);
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
