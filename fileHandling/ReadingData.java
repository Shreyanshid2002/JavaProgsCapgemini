package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingData {
	public static void main(String[] args) throws IOException{
	
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\Test\\d2";
		File file = new File(path);
//		FileInputStream fis = new FileInputStream(file);
//		
//		int x;
//		while((x=fis.read())!=-1) {
//			System.out.print((char)x);
//		}
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int x;
		while((x=br.read())!=-1) {
			System.out.print((char)x);
		}
	}
}
