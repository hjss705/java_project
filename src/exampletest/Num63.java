//요소 개수가 5개인 int형 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램을 작성하시오
package exampletest;

public class Num63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [5];
		
		for(int i = 0; i <a.length;i++) {
			a[i] = 5-i;
		}
		
		for(int i = 0; i <a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		
		

	}

}
