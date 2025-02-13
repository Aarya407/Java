import java.util.Random;
class NumberGenereator extends Thread
{
	public void run()
	{
		Random rand=new Random();
		while(true)
		{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int num=rand.nextInt(100);
		if (num % 2==0)
		{
			System.out.println("Generated Number(Even):"+num);
			SquareCalculator squareThread=new SquareCalculator(num);
			squareThread.start();
		}
		else
		{
			System.out.println("Generated Number(odd):"+num);
			CubeCalculator cubeThread =new CubeCalculator(num);
			cubeThread.start();
		}
	}
}
}	
class SquareCalculator extends Thread
{
		private int number;
		public SquareCalculator(int number)
		{
			this.number=(number);
		}
		public void run()
		{
			System.out.println("Square of"+number+":"+(number *number));
		}
}
class CubeCalculator extends Thread
{
		private int number;
		public CubeCalculator(int number)
		{
			this.number=number;
		}
		public void run()
		{
			System.out.println("Cube of"+number+":"+(number*number*number));
		}
	}
	public class Slip7_1
	{
		public static void main(String args[])
		{
			NumberGenereator numberGeneratorThread= new NumberGenereator();
			numberGeneratorThread.start();
		}
	}
