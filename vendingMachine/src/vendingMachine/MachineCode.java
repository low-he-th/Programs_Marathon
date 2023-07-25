package vendingMachine;

public class MachineCode {
public static void  productCode(String code)
{
	switch(code) {
	case "P10":
		System.out.println("coca-cola");
		break;
	case "S01":
		System.out.println("pepsi");
		break;
	case "T05":
		System.out.println("ticket vending machine ");
		break;
	case "B30":
		System.out.println("biscuit vending machine");
		break;
	}
}

}
