package comtrade.domen;

import java.util.Scanner;

import javax.swing.JFileChooser;

public class OtvoriFajl {

	private JFileChooser fileChooser = new JFileChooser();
	public StringBuilder sb= new StringBuilder();
	public StringBuffer sbb= new StringBuffer();
	public void PickMe() throws Exception{
		if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			//get the file
			java.io.File file= fileChooser.getSelectedFile();
			
			//create a scanner for the file
			Scanner input = new Scanner(file);
			
			//read text from file
			while(input.hasNext()) {
				sbb.append(input.hasNext());
				sbb.append("\n");
			}
			input.close();
		}else {
			sbb.append("No file was selected");
		}
	}
}
