package Lab;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Traffic Light Simulator");
		System.out.println("Select a Light: 1-red, 2-yellow, 3-Green");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		case 4:
			System.out.println("Invalid choice");
		}sc.close();
	}
	

}
