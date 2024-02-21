package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class charStreamRead {
	public static void main(String[] args) throws Exception {
		File file=new File("E:/new/demo2.txt");
		if (file.exists()) {
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			fileReader.close();
			Scanner scanner=new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
			System.out.println("data is fetched from the file");
		}else {
			System.out.println("file does not exist");
		}
	}
}
