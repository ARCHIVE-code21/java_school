import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {

	private JLabel la = new JLabel("Hello, Press Button!");
	
	NullContainerEx() {
		this.setTitle("Null Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(null);
		
		la.setBounds(130, 50, 200, 20);
		this.add(la);
		
		for(int i = 1; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setBounds(i*15, i*15, 50, 20);
			this.add(b);
		}
	
	}
	
	public void eventHandler() {
	
	}

	public static void main(String[] args) {
		new NullContainerEx();

	}

}