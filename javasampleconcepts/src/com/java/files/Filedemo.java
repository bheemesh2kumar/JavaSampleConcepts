package com.java.files;

import java.io.File;

public class Filedemo {

	public static void main(String[] args) {

		File f1 = new File("E:\\TestDir");
		System.out.println(f1.exists());

		String files[] = f1.list();

		int filecount = 0;
		int dircount = 0;

		for (String file : files)

		{

			File f2 = new File(file);

			if (f2.isFile()) {
				filecount++;
			}

		}

		System.out.println("total files count" + filecount);
		// System.out.println("total dir count" + dircount);
	}

}
