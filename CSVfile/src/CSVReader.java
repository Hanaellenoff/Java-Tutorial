import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "/Users/Student/Desktop/SacramentocrimeJanuary2006.csv";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader( new FileReader(path));
			
			while((line =  br.readLine()) != null) {
				String[] values = line.split(",");
				System.out.println("DATE:" + values[0]);
				System.out.println("Crime Description:" + values[5]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
