package chapter11;

import java.net.URLEncoder;
import java.util.Date;

public class FomatEx {

	public static void main(String[] args) throws Exception {
		String str = "æ»≥Á«œººø‰";
		String str2 = URLEncoder.encode(str , "UTF-8");
		System.out.println(str2);
		
		Date now = new Date();
		System.out.println(now);
	}

}

