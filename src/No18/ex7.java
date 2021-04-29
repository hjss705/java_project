package No18;

public class ex7 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
		
		return output;
	}
	public static void main(String[] args) {
		String result= numbering(2,5);
		System.out.println(result);
	}

}
