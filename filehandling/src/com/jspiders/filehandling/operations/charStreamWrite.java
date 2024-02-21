package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class charStreamWrite {
	public static void main(String[] args) throws IOException {
		File file=new File("E:/new/domo2.txt");
		if (file.exists()) {
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("java is pro lang");
			System.out.println("data is written to the file");
			fileWriter.close();
		}else {
			boolean status=file.createNewFile();
			if (status) {
				System.out.println("file is created");
				FileWriter fileWriter=new FileWriter(file);
				fileWriter.write("java is pro lang");
				System.out.println("data is written to the file");
				fileWriter.close();
			}
			else {
				System.out.println("file is not created");
			}
		}
	}
}
