package No39;

import java.io.IOException;

class E3 {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	
	void throwIOException() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void throwIOException2() throws IOException{
		throw new IOException();
	}
}