package pattern.level4;
//     *****
//    ****
//   ***
//  **
// *
public class Pattern7 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=5;k>=i;k--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
