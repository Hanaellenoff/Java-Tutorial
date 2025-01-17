import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File file = new File("/Users/Student/Desktop/sample.txt");
      Scanner scan = new Scanner(file);
    
      String fileContent = ""; 
      while(scan.hasNextLine()) {
      fileContent = fileContent.concat(scan.nextLine() + "\n");
       
	}

      FileWriter writer = new FileWriter("/Users/Student/Desktop/newfile.txt");
      writer.write(fileContent);
      writer.close();
	}
}
