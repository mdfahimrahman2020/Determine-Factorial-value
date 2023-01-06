import java.util.Scanner;
public class factorial{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"Determine the Factorial value\"");
		Scanner input = new Scanner(System.in);
		int n, sum = 1;

		
		System.out.print("\nEnter the number : ");
		n = input.nextInt();

		for(int i = n; i >= 1; i--)
		{
			
			{
				sum = sum * i;
		        System.out.print(i+" ");

			}


		}



		System.out.print("\nThe factorial of " + n + " is : " +sum);







	}

}