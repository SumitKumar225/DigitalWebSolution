package utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		//FileReader fr=new FileReader("C:\\Users\\DWS\\DWS_Project\\TestDWSWebSite\\src\\test\\resources\\config\\config.properties");
		FileInputStream fr=new FileInputStream("C:\\\\Users\\\\DWS\\\\DWS_Project\\\\TestDWSWebSite\\\\src\\\\test\\\\resources\\\\config\\\\config.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
			System.out.println(p.getProperty("url"));
	}

}
