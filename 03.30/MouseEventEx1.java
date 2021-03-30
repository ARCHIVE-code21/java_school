import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventEx1 extends JFrame implements MouseListener{
    private JLabel la = new JLabel("Hello");
    private JPanel p = new JPanel();
    MouseEventEx1() {
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
        p.addMouseListener(this);
    }

    private void formDesign() {
        this.add(p);
        p.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);;
        p.add(la);
    }

    public static void main(String[] args) {
        new MouseEventEx1();
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

        int x = e.getX();
        int y = e.getY();
        la.setLocation(x, y);
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }
}