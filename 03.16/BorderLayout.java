import javax.swing.*;

public class BorderLayout extends JFrame{

    public static Object SOUTH;
    private JButton btn1 = new JButton("btn1");
    private JButton btn2 = new JButton("btn2");
    private JButton btn3 = new JButton("btn3");

    private JPanel p = new JPanel();

    BorderLayout() {
        this.setTitle("Layout예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.formDesign();
        this.eventHandler();
    
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void eventHandler() {
    }

    private void formDesign() {
        this.add(p, BorderLayout.SOUTH);


        p.add(btn1);
        p.add(btn2);
    }

    public static void main(String[] args) {
		new BorderLayout();

	}
}
