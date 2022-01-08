import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class classInput implements interInput
{
	String[] arrayStrOne;
	double[] arrayIntOne;
	double[][] arrayIntTwo;
	@Override
	public double[] readOneDimArr(String filename)
	{
		StringBuilder sb = new StringBuilder();
		try (Scanner scan = new Scanner(new File(filename)))
		{
			while (scan.hasNextLine())
			{
				sb.append(scan.nextLine()).append("\n");
			}
		
			arrayStrOne = sb.toString().split(" ");
			arrayIntOne = new double[arrayStrOne.length];
			for (int i = 0; i < arrayIntOne.length-1; ++i) 
			{
				arrayIntOne[i] = Integer.parseInt(arrayStrOne[i]);
				// System.out.println(arrayInt[i]);
			}
		}
		catch (FileNotFoundException e)
		{
			// return 0;
			System.out.println(e);
		}
		return arrayIntOne;
	}

	@Override
	public double[][] readTwoDimArr(String filename)
	{
		try (Scanner scan = new Scanner(new File(filename)))
		{
			Scanner size = new Scanner(new File(filename));
			arrayIntTwo = new double[size.nextLine().toString().split(" ").length][size.nextLine().toString().split(" ").length];

			for (int i = 0; i < arrayIntTwo.length; i++)
			{
				String temp = scan.nextLine();
				for (int j = 0; j < arrayIntTwo.length; j++)
				{
					arrayIntTwo[i][j] = Integer.parseInt(temp.toString().split(" ")[j]);
				}
			}
		}
		catch (FileNotFoundException e)
		{
			// return 0;
			System.out.println(e);
		}
		return arrayIntTwo;
	}
}