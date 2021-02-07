import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FunctionFile {
	GUI gui;
	String fileName;
	String fileAddress;
	public FunctionFile(GUI gui) {
		this.gui = gui;
	}
	//distorys current file without saving and clears the textArea
	public void newFile() {
		gui.textArea.setText("");
		gui.window.setTitle("New");
		fileName = null;
		fileAddress = null;
	}
	//open a new file to be edited in the application
	public void open() {
		FileDialog fd = new FileDialog(gui.window,"Open",FileDialog.LOAD);
		fd.setVisible(true);
		
		if(fd.getFile()!=null) {
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();
			gui.window.setTitle(fileName);
		}
		System.out.println("File address and file name"+fileAddress+fileName);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileAddress+fileName));
			gui.textArea.setText("");
			String line = null;
			while((line=br.readLine())!=null) {
				gui.textArea.append(line+"\n");
			}
			br.close();
		}catch(Exception e) {
			System.out.println("File not opened");
		}
	}
	//saves the file, if fileName is null i.e. file is not saved earlier calls saveAs function
	public void save() {
		if(fileName==null) {
			saveAs();
		}
		else {
			try {
				FileWriter fw = new FileWriter(fileAddress+fileName);
				fw.write(gui.textArea.getText());
				fw.close();
			}catch(Exception e) {
				System.out.println("Something is wrong!!");
			}
		}
	}
	//for saving the file 1st time
	public void saveAs() {
		FileDialog fd = new FileDialog(gui.window,"Save",FileDialog.SAVE);
		fd.setVisible(true);
		
		if(fd.getFile()!=null) {
			fileName = fd.getFile(); 
			fileAddress = fd.getDirectory();
			gui.window.setTitle(fileName);
		}
		try {
			FileWriter fw = new FileWriter(fileAddress+fileName);
			fw.write(gui.textArea.getText());
			gui.window.setTitle(fileName);
			fw.close();
		}catch(Exception e){
			System.out.println("SomeThing wrong!!!!");
		}
		
	}
	//exits the application without saving any progress
	public void exit() {
		System.exit(0);
	}
}
