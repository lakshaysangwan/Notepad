import java.awt.Font;

public class functionFormat {
	GUI gui;
	Font arial, comicSansMS, timesNewRoman, Monospace;
	String selectedFont;
	public functionFormat(GUI gui) {
		this.gui=gui;
	}
	//word wrap
	public void wordWrap() {
		if(gui.wordWrapON==false) {
			gui.wordWrapON=true;
			gui.textArea.setLineWrap(true);
			gui.textArea.setWrapStyleWord(true);
			gui.iWrap.setText("Word Wrap: On");
		}
		else if(gui.wordWrapON==true){
			gui.wordWrapON=false;
			gui.textArea.setLineWrap(false);
			gui.textArea.setWrapStyleWord(false);
			gui.iWrap.setText("Word Wrap: Off");
		}
	}
	//changing fonts
	public void createFont(int fontSize) { 
		arial = new Font("Arial",Font.PLAIN,fontSize);
		comicSansMS = new Font("Comic Sans MS",Font.PLAIN,fontSize);
		timesNewRoman = new Font("Times New Roman",Font.PLAIN,fontSize);
		Monospace = new Font("Monospace",Font.PLAIN,fontSize);
		
		setFont(selectedFont);
	}
	public void setFont(String font) {
		selectedFont = font;
		switch(selectedFont) {
		case "Arial" : gui.textArea.setFont(arial); break;
		case "Monospace" : gui.textArea.setFont(Monospace); break;
		case "Times New Roman" : gui.textArea.setFont(timesNewRoman); break;
		case "Comic Sans MS" : gui.textArea.setFont(comicSansMS); break;
		
		}
	}
}
