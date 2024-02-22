package Buoi06;

/*
 * - (Hàm tiếp theo)ĐỆ QUI  là một phương pháp chia công việc ra các phần nhỏ và gộp chúng lại thành một kết quả đầu ra. 
 */

public class Main1 {

	public static void main(String[] args) {
		
//		Main1.greeting(5);
		int result = Main1.f(5); // 5 + f4 + f3 + f2 + f1 + f0 == 5 +4 + 3 + 2 + 1+ 0
		System.out.println(result);
		
	}
	public static void greeting(int n) {
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Hello Liem!" + i);
//		}
		if(n == 0) {
			return;
		}else {
		Main1.greeting(n - 1);
		System.out.println("Hello World!" + n); // nếu để dòng này ở trên thì in ra sẽ bị ngược thành 54321
		}
	}
	public static int f(int n) {
//		int result = 0; // hàm tính tổng thông thường
//		for(int i = 1;i <= n; i++) {
//			result += i;
//		}
//		return result;
		
		if (n <= 0) { // hàm đệ quy
			return 0;
		}
		return n + Main1.f(n-1);
	}
	
}

