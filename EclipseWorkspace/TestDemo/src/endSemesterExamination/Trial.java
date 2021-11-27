package endSemesterExamination;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Trial{
	public static void main (String args[]) throws IOException {
	FileReader inputStream = null;
	FileWriter outputStream = null;
	try {
		inputStream = new FileReader("readFile.txt");
		outputStream = new FileWriter("writeFile.txt");
		int c;
		while((c = inputStream.read()) != -1) {
			outputStream.write(c);			
		}
		}finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
	}
}