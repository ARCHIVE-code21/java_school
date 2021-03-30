import java.awt.Color;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//이벤트 리스너 구현 - 프레임 자체

public class keyEventEx extends JFrame implements KeyListener{
    private JPanel p = new JPanel();
    private JLabel[] keyMessage;

    keyEventEx() {
        this.setTitle("Key Event");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(300,200);
        this.setVisible(true);

        //패널이 키 이벤트를 받을 수 있도록 포커스를 가져가야한다.
        p.setFocusable(true);
        p.requestFocus();
    }

    private void eventHandler() {
        // 1) 이벤트소스 -> p
        p.addKeyListener(this);
    }

    private void formDesign() {
        this.add(p);
        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel ("   getKeyCode()   ");
        keyMessage[1] = new JLabel ("   getKeyChar()   ");
        keyMessage[2] = new JLabel ("   getKeyText()   ");

        for(int i = 0; i < keyMessage.length; i++) {
            p.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] e) {
        new keyEventEx();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();
        keyMessage[0].setText(Integer.toString(keyCode));
        keyMessage[1].setText(Character.toString(keyChar));
        keyMessage[2].setText(KeyEvent.getKeyText(keyCode));

        System.out.println("KeyPressed...");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyReleased...");    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("KeyType...");
        
    }
}
