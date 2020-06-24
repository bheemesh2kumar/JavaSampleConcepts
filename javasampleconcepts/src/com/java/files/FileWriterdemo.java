package com.java.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterdemo {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("E:\\TestDir\\test.txt");
		fw.write("Hello \n hi \n  how are you ganga");
		fw.close();
		
		
		System.out.println("written  file successfully");
		

	}

}
