import java.util.*;

public class Remote{
	
/**
 * @param args
 */
public static void main(String[]args)
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter any button on remote :");
	int a=sc.nextInt();
	
	switch(a) {
	
	case 1: System.out.println("hello");
    break;
	
	
	case 2: System.out.println("Namaste ");
    break;
	
	case 3: System.out.println("Bonjour");
    break;
	
	default: System.out.println("please enter it again");
	
	
}

}
}