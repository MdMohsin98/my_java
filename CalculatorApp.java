import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class CalculatorApp {
    public static void main(String[] args) {
        // Calculator App GUI.
        Frame fm = new Frame();
        Button bt = new Button();
        bt.setVisible(true);
        // bt.setForeground(Color.GRAY);
        bt.setBounds(25, 35, 50, 50);
        fm.add(bt);
        fm.setTitle("Calculator");
        fm.setBackground(Color.GREEN);
        fm.setVisible(true);
        fm.setSize(500, 500);
        
    }
    
}
