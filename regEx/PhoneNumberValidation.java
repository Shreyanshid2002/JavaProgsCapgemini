 package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
	public static void main(String[] args) {
		String regex = "[6789]\\d{9}";
		String text ="6289820189,9564305871,7890765432,8907654321";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			System.out.println(matcher.group()+" "+matcher.start()+" "+matcher.end());
		}
	}
}
