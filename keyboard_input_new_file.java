import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class keyboard_input_new_file {
    public static void main(String[] args) throws Exception {
        // Create a new file and Insert the text by 
        // keyboard input
        // From InputStreamReader we can only take input of 
        // String data type

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);
        System.out.println("Enter name, age, phy. and chem. score and college: ");
        String name = br1.readLine();
        String age = br1.readLine();
        String phy = br1.readLine();
        String chem = br1.readLine();
        String college = br1.readLine();

        // File Writer
        FileWriter fw = new FileWriter("newFile3.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Name: \t"+name+"\n");
        bw.write("Age: \t"+age+"\n");
        bw.write("Phy: \t"+phy+"\n");
        bw.write("Chem: \t"+chem+"\n");
        double score = (Double.parseDouble(phy)+Double.parseDouble(chem));
        Double.toString(score);
        bw.write("Total Score: \t"+score+"\n");
        bw.write("College: \t"+college+"\n");
        bw.close();
        System.out.printf("Score: %.2f\n",score);

        // File Reading

        FileReader fr = new FileReader("newFile3.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("-----------------------");
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }
        br.close();
    }
}
