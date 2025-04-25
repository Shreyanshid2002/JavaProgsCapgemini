package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CSV_Read {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\stiudentData.csv";
		File file = new File(path);
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line; //used to read a single row
			boolean isHeader = true; //donot want to read the headers of the coloumn
			
			while((line=reader.readLine())!=null) {
				if(isHeader) {
					isHeader = false; //Skip header
					continue;
				}
				
				String[] values = line.split(",");
				int id = Integer.parseInt(values[0]);
				String name = values[1];
				int age = Integer.parseInt(values[2]);
				
				System.out.println("ID: "+id+", Name: "+name+", Age: "+age);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
}
	
