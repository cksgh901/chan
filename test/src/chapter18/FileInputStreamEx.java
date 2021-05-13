package chapter18;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:/java/workspeace/src/chapter18/FileEx.java");
			int data;
			while ( (data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
					
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
