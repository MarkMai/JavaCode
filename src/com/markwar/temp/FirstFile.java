package com.markwar.temp;

import java.io.*;
import java.net.*;

public class FirstFile {
	private final static String path = "D:\\test\\test.jpg";
	
	public static void main(String[] args) throws Exception {
		File file = new File(path);
		if(!file.exists())
			file.createNewFile();
		
		
		FileOutputStream fos = new FileOutputStream(file);
		
		URL url = new URL("http://www.scholat.com/images/mailLogo.png");
		
		InputStream is = url.openStream();
		
		byte[] buff = new byte[1024];
		int hasRead = 0;
		while((hasRead=is.read(buff))>0) {
			fos.write(buff,0,hasRead);
		}
		
		is.close();
		fos.close();
	}
}
