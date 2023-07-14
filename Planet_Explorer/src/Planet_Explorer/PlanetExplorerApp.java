package Planet_Explorer;

import java.util.Scanner;

public class PlanetExplorerApp {
public static void main(String[] args) {
	Scanner  scan =new Scanner(System.in);
	System.out.println("enter the raduis");
	double radius=scan.nextDouble();
	PlanetExplorer px=new PlanetExplorer();
	System.out.println(px.calculateSurfaceArea(radius));

}
}
