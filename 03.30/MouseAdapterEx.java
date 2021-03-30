import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;

public class MouseAdapterEx extends JFrame {
    
    private JLabel la = new JLabel("Java");
    private JPanel p = new JPanel();
    
    MouseAdapterEx() {
        this.setTitle("Mouse Adapter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(400,400);
        this.setVisible(true);
    }

    private void eventHandler() {
        // 3) 리스너 구현
        p.addMouseListener(new MyAdapter());
    }

    private void formDesign() {
        this.add(p);
        p.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        p.add(la);
    }

    public static void main(String[] args) {
        new MouseAdapterEx();
    }

    //이벤트 리스너 구현 - 내부클래스로 Adapter클래스
    class MyAdapter extends MouseApdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);

        }
    }
}
