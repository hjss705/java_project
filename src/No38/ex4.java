package No38;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B3{
	void run() {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
	}
class C3{
	void run() {
		B3 b = new B3();
		b.run();
	}
}

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3 c = new C3();
		c.run();

	}
}
