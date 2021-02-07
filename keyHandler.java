import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyHandler implements KeyListener {
	
	GUI gui;
	
	public keyHandler(GUI gui) {
		this.gui = gui;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//file keyboard controls
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_A) {
			gui.file.save();
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_E) {
			gui.file.exit();
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_N) {
			gui.file.open();
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_S) {
			gui.file.saveAs();
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_F) {
			gui.file.newFile();
		}
		//edit keyboard controls
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_Z) {
			gui.edit.undo();
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_Y) {
			gui.edit.redo();
		}
		//theme keyboard controls
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_G) {
			gui.color.changeColor("Grey");
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_W) {
			gui.color.changeColor("White");
		}
		if(e.isControlDown() &&  e.getKeyCode()==KeyEvent.VK_B) {
			gui.color.changeColor("Black");
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
