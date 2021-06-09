//0.0부터 1.0까지 0.001 단위로 증가시키면서 해당 값의 제곱을 표시하시오.
package exampletest;

public class Num60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x=0; x <=1000; x++) {
			float b =(float)x /1000;
			System.out.printf("%5.3f      %10.7\n", b, b*b);
		}

	}

}


// ??????????????잘모르겠음