package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Write {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\stiudentData.csv";
		File file = new File(path);
		file.createNewFile();
		
		try (FileWriter writer = new FileWriter(file)){
			writer.append("id,name,age\n");
			writer.append("1,Ram,22\n");  // we can use .write  also but it will replace the data otherwise inside fileRiter constructor we need to mention file and true
			writer.append("2,Raj,21\n");
			writer.append("3,Rai,23\n");
			System.out.println("CSV file written successfully!");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
