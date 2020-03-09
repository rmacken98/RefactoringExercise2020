import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JFrameMenuSuper {
JFrame f;
	
public JButton button(String text) {
	JButton button = new JButton(text);
	button.setPreferredSize(new Dimension(250, 20));
	return button;
}

public JRadioButton rd(String text) {
	JRadioButton bt = new JRadioButton(text);
	bt.setActionCommand(text);
	return bt;
}

public JFrame menuFrame(String type, int height, int width) {
	f = new JFrame(type);
	f.setSize(height, width);
	f.setLocation(200, 200);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
	return f;

}
	
	
	
	
	
}
