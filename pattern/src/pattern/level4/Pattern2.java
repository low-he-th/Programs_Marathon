package pattern.level4;
//$$$$$***** 
//$$$$$***** 
//$$$$$***** 
//$$$$$***** 
//$$$$$***** 
public class Pattern2 {
public static void main(String[] args) {
	for(int k=1;k<=5;k++) {
		for (int i=0;i<5;i++) {
			System.out.print("$");
		}
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}

