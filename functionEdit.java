
public class functionEdit {
	GUI gui;
	public functionEdit(GUI gui) {
		this.gui = gui;
	}
	//undofuntion starts here
	public void undo() {
		gui.um.undo();
	}
	//redofuntion starts here
	public void redo() {
		gui.um.redo();
	}
}
