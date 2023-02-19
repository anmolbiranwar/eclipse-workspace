package testpackage;

public class ForLoops {

	public static void main(String[] args) {

//		for(int i=-1 ; i < 9; i++) {
//			System.out.println("ABC");
//		}
//		
//
//		for(int i=0 ; i < 10; i++) {
//			System.out.println("Employee"+i);
//		}
//		
		//continue ==> SKIP particular iterations in loop
		//break ==> break the loop
		
		for(int i=0 ; i < 10; i++) {
			
			if(i>5 && i < 8)
				break;
			System.out.println("Employee"+i);
		}
		
		
//		for(int i=0 ; i < 10; i++) {
//			
//			if(i>5 && i < 8)
//				break;
//			System.out.println("Employee"+i);
//		}
	}

}
