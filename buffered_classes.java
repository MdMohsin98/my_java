import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class buffered_classes {
    public static void main(String[] args) throws Exception {
        // Buffered Classes
        FileWriter fw = new FileWriter("newFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Welcome to Java.\n");
        bw.write("This is new Line.\n");
        bw.write("This is another line.\n");
        bw.write("This is last line.");
        bw.close();

        FileReader fr = new FileReader("newFile.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        while ((line = br.readLine())!=null) {
            System.out.println(line);
            
        }
        // System.out.println(br.readLine());
        br.close();
    }
    
}
