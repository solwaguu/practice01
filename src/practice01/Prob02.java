package practice01;

public class Prob02 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 1 + i; j < 11 + i; j++) {
				System.out.print(j + "\t");				
			}
			System.out.println();
		}
	}

}
