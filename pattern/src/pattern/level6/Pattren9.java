package pattern.level6;

public class Pattren9 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
