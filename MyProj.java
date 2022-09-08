
import java.util.Scanner;

public class MyProj {

	public static void main(String[] args) {
		
	
	
		Scanner scanner=new Scanner(System.in);
		int i,first_position,last_position;
        System.out.println("Enter your credit card number");
        String credit=scanner.next();
        char[] array=new char[credit.length()];
        for(i=0;i<credit.length();i++)
        	array[i]=credit.charAt(i);
        first_position=credit.indexOf("-");
        last_position=credit.lastIndexOf("-");
        for(i=0;i<credit.length();i++)
        {
        	if(i<first_position || i>last_position)
        		System.out.print(array[i]);
        	else
        		if(array[i]=='-')
        		System.out.print("-");
        		else
        			System.out.print("*");
        }
		
	}
}
