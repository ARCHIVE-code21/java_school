import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    private JButton btn1 = new JButton("Btn1");
    private JButton btn2 = new JButton("Btn2");
    private JButton btn3 = new JButton("Btn3");
    private JButton btn4 = new JButton("Btn4");
    private JButton btn5 = new JButton("Btn5");
    FlowLayoutEx() {
        this.setTitle("FlowLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void formDesign() {
        this.setLayout(new FlowLayout());
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);

    }

    private void eventHandler() {
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }

}