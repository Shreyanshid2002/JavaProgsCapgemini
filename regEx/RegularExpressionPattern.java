package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionPattern {
	public static void main(String[] args) {
		
		String str = "2Hello World\nToday ,is 22\n _bye .";
		String str1 = "It is a good day";
		String str2 = "Hello World\nToday is, 22, _bye .";
		String regex = ".";
		String regex1 ="[abc]";
		String rg = "[^abc]";
		String rg1 = "[a-z]";
		String rg2 = "[a-z\\d]";
		String rg3 ="[A-Z\\d]";
		String rg4 = "[\\w\\s]";
		String rg5 = "^2";
		String rg6 ="^[A-Z]";
		String s = "adam plucked an apple and gave to aaron";
		String rg7 = "a*";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
		System.out.println();
		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(str1);
		while(m1.find()) {
			System.out.print(m1.group());
		}
		System.out.println();
		Pattern p2 = Pattern.compile(rg);
		Matcher m2 = p2.matcher(str1);
		while(m2.find()) {
			System.out.print(m2.group());
			
		}
		System.out.println();
		Pattern p3 = Pattern.compile(rg1);
		Matcher m3 = p3.matcher(str);
		while(m3.find()) {
			System.out.print(m3.group());
		}
		System.out.println();
		Pattern p4 = Pattern.compile(rg2);
		Matcher m4 = p4.matcher(str);
		while(m4.find()) {
			System.out.print(m4.group());
		}
		System.out.println();
		Pattern p5 = Pattern.compile(rg3);
		Matcher m5 = p5.matcher(str);
		while(m5.find()) {
			System.out.print(m5.group());
		}
		System.out.println();
		Pattern p6 = Pattern.compile(rg4);
		Matcher m6 = p6.matcher(str);
		while(m6.find()) {
			System.out.print(m6.group());
		}
		System.out.println();
		System.out.println();
		Pattern p7 = Pattern.compile(rg4);
		Matcher m7 = p7.matcher(str);
		while(m7.find()) {
			System.out.print(m7.group());
		}
		System.out.println();
		System.out.println();
		Pattern p8 = Pattern.compile(rg5);
		Matcher m8 = p8.matcher(str);
		while(m8.find()) {
			System.out.print(m8.group());
		}
		System.out.println();
		System.out.println();
		Pattern p9 = Pattern.compile(rg6);
		Matcher m9 = p9.matcher(str2);
		while(m9.find()) {
			System.out.print(m9.group());
		}
		System.out.println();
		System.out.println();
		Pattern p10 = Pattern.compile(rg7);
		Matcher m10 = p10.matcher(s);
		while(m10.find()) {
			System.out.print(m10.group());
		}
	}
}
