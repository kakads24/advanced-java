package com.jspiders.filehandling.operations;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File file=new File("E:/new/demo.txt");
		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			if (file.canWrite()) {
				System.out.println("file is writable");
			}else {
				System.out.println("fileis not writable");
			}
			if (file.canExecute()) {
				System.out.println("file is executable");
			}
			else {
				System.out.println("file is not executable");
			}
		}
		else {
			System.out.println("file does not exist");
		}
	}
}
