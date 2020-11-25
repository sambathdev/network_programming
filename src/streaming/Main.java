package streaming;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream("./student.txt");
			
			System.out.println("hello");
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	public static void readDataAsString(String filePath) {
		try {
			InputStream inputStream = new FileInputStream(filePath);
			Scanner scanner = new Scanner(inputStream);
			while((dataByte))
		}catch(){
			
		}
	}

}
