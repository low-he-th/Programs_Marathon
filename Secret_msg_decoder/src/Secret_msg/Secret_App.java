package Secret_msg;

import java.util.Scanner;

public class Secret_App {
public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);

 System.out.println("enter the msg");
 char ch =scan.next().charAt(0);
 Secret_Msg_Decoder smd= new Secret_Msg_Decoder();
 System.out.println("the secret code is "+""+smd.decodeCharacter(ch));

}
}
