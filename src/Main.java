import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //INITIALIZE String Array
        String info[] = {"Hello world","\nHello again", "\nHello Iverson", "\n90 degrees", "\nHello Jerick", "\nThank you", "\nBrother", "\nThank you", "\nEnding"};
        //INITIALIZE Int Array
        int ascending[] = new int[100];
        for (int i = 0; i < ascending.length; i++) {
            ascending[i] = i+1;
        }

        //FILE WRITER
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/text-file.txt"));
//            for (int i = 0; i< info.length; i++){
//                writer.write(info[i]);
//            }

            for (int i = 0; i< ascending.length; i++){
                writer.write(String.valueOf(ascending[i]+"\n"));
            }
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("\n\nWriting done >>\n\n");
        }

        //FILE READER
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/text-file.txt"));
            String line;
            do {
                line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }while (line != null);
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("\n\nReading done >>\n\n");
        }
    }
}
