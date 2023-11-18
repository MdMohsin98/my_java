import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
import java.io.InputStreamReader;


public class inputstream_keyboard {
    public static void main(String[] args) throws Exception {
        // new file using keyboard input

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter name, age and height");
        String name1 = br.readLine();
        int age = Integer.parseInt(br.readLine());
        double height = Integer.parseInt(br.readLine());

        System.out.printf("Name: %s\n",name1);
        System.out.printf("Age: %d\n",age);
        System.out.printf("Height: %.2f\n",height);

        br.close();
            
        System.out.println("Done");

        // File reading

        // FileReader fr = new FileReader("newFile2.txt");
        // BufferedReader br = new BufferedReader(fr);
        // System.out.println("------------------------");
        // String line;
        // while ((line = br.readLine())!=null) {
        //     System.out.println(line);
        // }
        // br.close();
    }
}
