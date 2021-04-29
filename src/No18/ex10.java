package No18;

public class ex10 {
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

//파일에 기록해 저장하는내용 책참조할것!