package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedEmployee {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\Serializable.txt";
		File file = new File(path);
		
		file.createNewFile();
		
		Employee employee = new Employee(1,"Shreyanshi",20000.00);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employee);
		oos.flush();
		oos.close();
		fos.close();
	}
}
