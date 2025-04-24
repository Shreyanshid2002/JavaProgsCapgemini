package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\d2";
		File file = new File(path);
//		FileOutputStream fos = new FileOutputStream(file,true);
		FileWriter fw = new FileWriter(file,true);
//		String message = "Welcome Home";
		String message = " , Switch off the light";
//		byte[] arr = message.getBytes();
//		fos.write(arr);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<message.length();i++) {
			bw.write(message.charAt(i));
		}
		bw.flush();
//		fw.close();
	}
}
