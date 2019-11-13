package practice01;

public class Prob05 {

	public static void main(String[] args) {
		
//		int number = 99;
//		String strNumber = String.valueOf(number);
//
//		char c = strNumber.charAt(0);
//		System.out.println(c); //9
	
		for(int n = 1; n < 100; n++) {
			System.out.print(n + "\t");
			
			String str = String.valueOf(n);
			
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				switch(c) {
				case '3':
				case '6':
				case '9':
					System.out.print("짝");
					break;
				default:
					break;
				}
				
			}
			System.out.println();
		}
	}

}
