package brackets_driver;
import brackets_service.CheckBalanced;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the string: ");
		String input= sc.nextLine();
		if(CheckBalanced.isBalanced(input))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}


}
