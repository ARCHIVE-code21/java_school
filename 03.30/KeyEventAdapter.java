import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class KeyEventAdapter extends JFrame{
   
   private JPanel p = new JPanel();
   private JLabel lb = new JLabel("HELLO");
   
   KeyEventAdapter() {
      this.setTitle("KeyEventEx 예제");
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
      new KeyEventAdapter();
   }

   class MyAdapter extends KeyAdapter{
      @Override
      public void keyPressed(KeyEvent e) {
         int keyCode = e.getKeyCode();
         
         switch(keyCode) {
         case KeyEvent.VK_UP:
            lb.setLocation(lb.getX(), lb.getY() - 10);
            break;
         case KeyEvent.VK_DOWN:
            lb.setLocation(lb.getX(), lb.getY() + 10);
            break;
         case KeyEvent.VK_LEFT:
            lb.setLocation(lb.getX() - 10, lb.getY());
            break;
         case KeyEvent.VK_RIGHT:
            lb.setLocation(lb.getX() + 10, lb.getY());
            break;
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