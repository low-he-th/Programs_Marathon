package TypeCasting;

public class TC {
		    public static void main(String[] args) {
		        // Casting between integer types
		        int num1 = 10;
		        long num2 = num1; // Implicit casting from int to long
		        byte num3 = (byte) num1; // Explicit casting from int to byte
		        short num4 = (short) num1; // Explicit casting from int to short
		        char char2=(char) num1;
		        System.out.println("Casting between integer types:");
		        System.out.println("num1 (int): " + num1);
		        System.out.println("num2 (long): " + num2);
		        System.out.println("num3 (byte): " + num3);
		        System.out.println("num4 (short): " + num4);
		        System.out.println("char(2)(int)"+ char2);

		        // Casting between floating-point types
		        double num5 = 10.5;
		        float num6 = (float) num5; // Explicit casting from double to float
		        System.out.println("\nCasting between floating-point types:");
		        System.out.println("num5 (double): " + num5);
		        System.out.println("num6 (float): " + num6);

		        // Casting with characters
		        char char1 = 'A';
		        int num7 = (int) char1; // Explicit casting from char to int
		        System.out.println("\nCasting with characters:");
		        System.out.println("char1 (char): " + char1);
		        System.out.println("num7 (int): " + num7);

		        // Casting with booleans
		        boolean bool1 = true;
		        // int num8 = (int) bool1; // Error: Cannot cast boolean to int
		        System.out.println("\nCasting with booleans:");
		        System.out.println("bool1 (boolean): " + bool1);
		        // System.out.println("num8 (int): " + num8);

		        // Casting with Strings
		        String str1 = "123";
		        int num9 = Integer.parseInt(str1); // Casting from String to int using parsing
		        System.out.println("\nCasting with Strings:");
		        System.out.println("str1 (String): " + str1);
		        System.out.println("num9 (int): " + num9);
		    }
	

	}
