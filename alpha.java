package alphabet;
import java.util.Scanner;
public class alpha {

	public static void main(String[] args) {
		char c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter something");
		c = s.next().charAt(0);
		if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
				System.out.println("The Entered thing is an Alphabet");
		}
		else
		{
			System.out.println("The Entered thing is not an Alphabet");
		}

	}

}
