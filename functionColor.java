import java.awt.Color;

public class functionColor {
	GUI gui;
	public functionColor(GUI gui) {
		this.gui = gui;
	}
	//i hope the code is self explanatory btw this is theme option
	public void changeColor(String color) {
		switch(color) {
		case "White" : 
			gui.window.getContentPane().setBackground(Color.white);
			gui.textArea.setBackground(Color.white);
			gui.textArea.setForeground(Color.black);
			break;
		case "Black" : 
			gui.window.getContentPane().setBackground(Color.black);
			gui.textArea.setBackground(Color.black);
			gui.textArea.setForeground(Color.white);
			break;
		case "Grey" : 
			gui.window.getContentPane().setBackground(Color.DARK_GRAY);
			gui.textArea.setBackground(Color.DARK_GRAY);
			gui.textArea.setForeground(Color.white);
			break;
		}
	}
}
