package fileHandling;

import java.io.File;
import java.io.IOException;

public class FIleDemo {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\Demo";
		String renamepath = "C:\\Users\\User\\Desktop\\FileHandling\\Test"; //only can rename last folder 
		File file = new File(path);
		File rename = new File(renamepath);
//		file.mkdirs();
//		file.mkdirs();
		System.out.println(file.renameTo(rename));
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParentFile());
		System.out.println(file.getName());
//		rename.delete();
//		
		rename.createNewFile();
		String [] arr = rename.list(); 
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println(rename.canRead());
		System.out.println(rename.canWrite());
	}
}
