//crate a popup menu attached to frame if you click within area of frame popup menu would be shown.similarly click on menu icon shown.similarly click on menu icon shows the message one item is selected.

import javax.swing.*;
import java.awt.event.*;
 
public class Popup implements ActionListener, MouseListener {
	JFrame f;
	JLabel l;
	JPopupMenu menu;
	JMenuItem one,two;
	public Popup() {
			f= new JFrame();
			f.setSize(400,500);
			l=new JLabel();
			l.setBounds(100,100,200,100);
			f.add(l);
			menu= new JPopupMenu();
			f.add(menu);
			one= new JMenuItem("one");
			two= new JMenuItem("two");
			menu.add(one);
			menu.add(two);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLayout(null);
			one.addActionListener(this);
			two.addActionListener(this);
			f.addMouseListener(this);
 
 
	}
	public void mouseClicked(MouseEvent e) {
		menu.show(f, e.getX(),e.getY());
	}
	public void actionPerformed(ActionEvent e) {
			String itm=e.getActionCommand();
			l.setText(itm+ "item is selected");
 
	}
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public static void main(String [] args) {
		new Popup();
	}
}
 