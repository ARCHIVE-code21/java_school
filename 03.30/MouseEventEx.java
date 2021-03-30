import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyMouseEvent implements MouseListener {
    JLabel la = new JLabel();
    MyMouseEvent(JLabel la) {
        this.la = la;
    }

    public void mouseClicked(MouseEvent arg0) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        la.setLocation(x, y);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }
}

public class MouseEventEx extends JFrame {
    private JLabel la = new JLabel("Hello");
    private JPanel p = new JPanel();
    MouseEventEx() {
        this.setTitle("MouseEvent");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(400,400);
        this.setVisible(true);
    }

    private void eventHandler() {
        // 1) 이벤트 소스 -> p
        // 2) 이벤트 소스에 귀를 달아준다.
        // 3) 이벤트 리스너 구현 - 외부(독립클래스)클래스로 구현
        // 4) 이벤트 객체를 생성
        p.addMouseListener(new MyMouseEvent(la));
    }

    private void formDesign() {
        this.add(p);
        p.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);;
        p.add(la);
    }

    public static void main(String[] args) {
        new MouseEventEx();
    }
}