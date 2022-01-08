//10
public class Main
{
	public static void main(String[] args)
	{
		interInput input = new classInput();
		interProcess process = new classProcess();

		double[] arr1 = input.readOneDimArr("input/one.txt");	
		System.out.println(process.calcOne(arr1));

		double[][] arr2 = input.readTwoDimArr("input/two.txt");
		System.out.println(process.calcTwo(arr2));
	}

}