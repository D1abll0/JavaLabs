import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class classProcess implements interProcess
{
	@Override
	public double calcOne(double[] array)
	{
		double start = 0;
		double end = 0;
		for (int i = 0; i < array.length-1; i++)
		{
			if(array[i] > 0 && start == 0){start = array[i];}
			if(array[array.length-i-1] > 0 && end == 0){end = array[array.length-i-1];}
		}
		return Math.abs(start - end);
	}

	@Override
	public double calcTwo(double[][] array)
	{
		int iter = 0;
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(iter <= Math.round(array.length / 2))
			{
				for(int j = iter; j < array.length - iter; j++)
				{
					if(array[i][j] % 3 == 0) sum += array[i][j];
				}
				iter++;
			}
			if(iter > Math.round(array.length / 2))
			{
				for(int j = array.length - iter; j < iter; j++)
				{
					if(array[i][j] % 3 == 0) sum += array[i][j];
				}
				iter++;
			}
		}
		// System.out.println(sum);
		return sum;
	}
}