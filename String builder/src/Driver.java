import java.util.Scanner;

public class Driver {
	public static void main(String[]args) {
		Scanner scanner= new Scanner (System.in);
		//String userInput=scanner.nextLine();
		//System.out.println(userInput);
		
		StringBuffer buffer =new StringBuffer();
		System.out.print("adınız");

		buffer.append(scanner.nextLine());
		System.out.print("soyadınız");
		buffer.append(scanner.nextLine());
		
		System.out.println(buffer.toString());

		
	}

}
