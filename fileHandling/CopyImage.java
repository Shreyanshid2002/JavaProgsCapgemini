package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
	public static void main(String[] args) throws IOException{
		//Creating new png file
		String destinationPath = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\image.png";
		File destinationFile = new File(destinationPath);
		destinationFile.createNewFile();
		
		//Creating file object of source image
		String sourcePath = "C:\\Users\\User\\Downloads\\Java-Logo.png";
		File sourceFile = new File(sourcePath);
		
		//Reading data from source image
		FileInputStream fis = new FileInputStream(sourceFile);
		byte[] arr = new byte[(int)sourceFile.length()];//Getting the size of source file and creating a byte array of that
//		size to store image data in the form of byte
		fis.read(arr); //read data from source file and store in byte array
		
		//writing data
		FileOutputStream fos = new FileOutputStream(destinationFile);
		fos.write(arr);
		fos.close();
		fos.close();
	}
}
