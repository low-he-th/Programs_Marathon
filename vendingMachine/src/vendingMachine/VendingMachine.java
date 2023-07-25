package vendingMachine;

import java.util.Scanner;

public class VendingMachine {
public static void main(String[] args) {
	Scanner scan =new  Scanner(System.in);
	//MachineCode getcode =new MachineCode();
	System.out.println("enter the machine code");
	String code =scan.next();
	MachineCode.productCode(code);
	scan.close();
}
}
