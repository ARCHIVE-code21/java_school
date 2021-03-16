import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContentPaneEx extends JFrame {

    private JButton btn_ok = new JButton("OK");
    private JButton btn_Cancel = new JButton("Cancel");
    private JButton btn_ignore = new JButton("ignore");
    private JPanel p = new JPanel();
	
	ContentPaneEx() {
		this.setTitle("CotentPane & JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.setBackground(Color.yellow);
	    p.setLayout(new FlowLayout());
		p.add(new JButton("OK"));
		p.add(new JButton("Cancel"));
		p.add(new JButton("Ignore"));
	}
	
	public void eventHandler() {
	
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}