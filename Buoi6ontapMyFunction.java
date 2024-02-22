package Buoi06;

public class Buoi6ontapMyFunction {
	
	public static void greeting(String name) { // trong tên hàm không được kí tự đặt biệt 
	System.out.println("Hello " + name);
	}
	
	public static int sumOfArry(int[] arr) { // mãng
		int sum = 0;
		for (int element : arr) {
			sum += element;
		}
//		System.out.println("Sum of input array is: " + sum);// khong muon in ra gia tri nay nua, ma muon tra ve gia tri la sum
		return sum;// lúc này báo lỗi sữa void thành int đúng với giá trị của sum
	}
	
	public static void greaterThan(int[] arr, int n) {
		System.out.println("Element is greater than n: ");
		for(int element : arr) {
			if(element > n) {
				System.out.println(element);
			}
		}
	}
	
	public static double avgOfArray(int[] arr) { // tìm tổng của mãng trung bình cộng của mãng
//		int sum = 0;
//		for(int element : arr) {
//			sum += element;
//		}
//		int sum = Main.sumOfArry(arr);
//		double result = (double)sum/arr.lenght;
//		return result;
//		return (double)sum/arr.length;
		return (double)Buoi6ontapMyFunction.sumOfArry(arr)/arr.length;
	}
	public static int[] noise(int[] arr ) { //arr = myArr;
		int[] temp = arr.clone(); // thì ở trên không cần .clone()
		arr[1] = 100;
		return temp;
	}
	
	public static int sum(int ...myArgs) { // tính tổng của đa tham số
		int sum = 0;
		for(int i = 0; i < myArgs.length; i++) {
			sum += myArgs[i];
			
		}
		return sum;
	}
	
	// GHI CHONG HAM
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	
	public static void test() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			if(i == 3) {
				return;
			}
		}
		System.out.println("End of function!");
	}
		
	
}


