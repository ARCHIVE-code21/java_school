import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyEventEx1 extends JFrame{

private JPanel p = new JPanel();
private JLabel lb = new JLabel("AAA");

KeyEventEx1() {
    this.setTitle("KeyAdapterEx 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.formDesign();
    this.eventHandler();
    this.setSize(300, 300);
    this.setVisible(true);
    
    p.setFocusable(true);
    p.requestFocus();
}

public void formDesign() {
    this.add(p);
    p.setLayout(new BorderLayout());
    p.add(lb);

}

public void eventHandler() {
    p.addKeyListener(new MyAdapter());
}

public static void main(String[] args) {
    new KeyEventEx1();
}

class MyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
        lb.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키 눌러짐");
        if(e.getKeyChar() == 'a') {
            p.setBackground(Color.green);
        }else if(e.getKeyCode() == KeyEvent.VK_F1) {
            p.setBackground(Color.blue);
        }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
        }

        @Override
        public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
        }
        
}
}



