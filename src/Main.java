import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //INITIALIZE String Array
        String info[] = {"Hello world","\nHello again", "\nHello Iverson", "\n90 degrees", "\nHello Jerick", "\nThank you", "\nBrother", "\nThank you", "\nEnding"};

        //FILE WRITER
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/text-file"));
            for (int i = 0; i< info.length; i++){
                writer.write(info[i]);
            }
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
                if (line == null) break;
                System.out.println(line);
            }while (line != null);
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
