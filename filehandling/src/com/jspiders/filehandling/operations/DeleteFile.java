package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
			File file=new File("Demo.txt");
			boolean status=file.delete();
			if (status) {
				System.out.println("file is deleted");
			}
			else {
				System.out.println("file is not deleted");
			}
	}
}
