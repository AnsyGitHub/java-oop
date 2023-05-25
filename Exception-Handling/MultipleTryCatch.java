package MultipleTryCatch;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String [] args)
	{
		System.out.println("Enter size of array");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		try {
		if(num < 3 || num > 10)
		{
		throw new IOException("Numbers less than 3 and greater than 10 not allowed");	
		}
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++)
		{
			 int randomValue = (int) (Math.random() * 100 + 1);
			 arr[i] = randomValue; 
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Value at index " + (i+1) + " is " + arr[i]);
		}
		try {
			System.out.println("Dividing values: Value at index 3 = " + arr[2] + "and value at index" + (num-2) + "is " + arr[num-2]);
			int check = arr[2]/arr[num-2];
			System.out.println("Value after division is " + check);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught");
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception found");
			
		}
		try {
			System.out.println(arr[num+1]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index not in bound");
			System.out.println((num+1) + " index not possible for array sized " + num);
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception found");
			
		}		
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
	}	
}
