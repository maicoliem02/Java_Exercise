package Buoi06;


public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Cho 3 điểm A, B, C trong hệ trục tọa độ Oxy hãy tính chu vi và diện tích của tam giác ABC
		 */
//		int xA, yA, xB, yB, xC, yC;
//		xA = 1;
//		yA = 1;
//		xB = 1;
//		yB = 4;
//		xC = 5;
//		yC = 1;
//		int[] vAB = new int[] {xB - xA, yB - yA};  // x1, y1
//		int[] vAC = new int[] {xC - xA, yC - yA};  // x2, y2
//		if(vAB[0]*vAC[1] == vAC[0]*vAB[1]) {
//			System.out.println("3 điểm không hợp lệ!");
//		}else {
//			double AB = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
//			double BC = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
//			double CA = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
//			double C = AB + BC + CA;
//			double p = C/2;
//			double S = Math.sqrt(p*(p - AB)*(p - BC)*(p - CA));
//			System.out.println("Chu vi: " + C);
//			System.out.println("Diện tích: " + S);
//		}
//		
		/*
		 * Cho một chuỗi số, hãy tính tổng các chữ số có trong chuỗi số
		 */
//		String a = "918745";
//		int sum = 0;
//		for(int i = 0; i < a.length(); i++) {
////			sum = sum + Integer.parseInt(a.charAt(i) + "");
//			sum = sum + (a.charAt(i) - '0');
//		}
//		System.out.println(sum);
		
		/*
		 * Cho một chuỗi, hãy kiểm tra xem chuỗi này có phải là chuỗi đối xứng hay không
		 */
//		String str = "abccca";
//		String newStr = "";
//		for(int i = str.length() - 1; i >= 0; i--) {
//			newStr = newStr + str.charAt(i);
//		}
//		System.out.println(newStr.equals(str));
//		for(int i = 0; i < str.length()/2; i++) {
//			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//				System.out.println(false);
//				return;
//			}
//		}
//		System.out.println(true);
		
//		boolean result = MyFunction.checkPalindrome("abccba");
//		System.out.println(result);
		
	}

}
