import java.awt.LayoutManager;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
    private JLabel [] keyMessage;

    public KeyListenerEx() {
        setTitle("KeyListener 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        java.awt.Container c = getContentPane();
        c.setLayout(new LayoutManager());
        c.addKeyListener(new KeyListener());

        keyMessage = new JLabel [3];
        keyMessage[0] = new JLabel("getKeyCode()");
        keyMessage[1] = new JLabel("getKeyChar()");
        keyMessage[2] = new JLabel("getKeyText()");

        for(int i = 0; i < keyMessage.length; i++) {
            p.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.YELLOW);
    }

    setSize(300,150);
    setVisible(true);

    c.setFocusable(true);
    c.requestFocus();

    class MyKeyListener extents KeyAdapter {

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();
        keyMessage[0].setText(Integer.toString(keyCode));
        keyMessage[1].setText(Character.toString(keyChar));
        keyMessage[2].setText(KeyEvent.getKeyText(keyCode));

        System.out.println("KeyPressed...");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("KeyReleased...");    
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("KeyTyped...");
        
    }
    }
    
}
