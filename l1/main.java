//10
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.lang.Math.*;
import java.util.Scanner;

public class main 
{
	public static void main(String[] args) 
	{
		main prog = new main();
		prog.run();
	}

	private double funcW(double a, double b, double x) 
	{
		return sqrt(pow(x, 2) + b) - pow(b, 2) * pow(sin(x + a), 3) / x;
	}

	private double funcY(double a, double b, double x) 
	{
		return pow(cos(pow(x, 3)), 2) - x / (sqrt(pow(a, 2) + pow(b, 2)));
	}

	private void dspl(double a, double b, double x, double w, double y)
	{
		System.out.printf("a = %.2f\nb = %.2f\nx = %.2f\nw = %f\ny = %f\n", a, b, x, w, y);
	}

	private void dt() {System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm, dd MMMM uu")));}

	private void run() 
	{
		System.out.printf("Enter a, b, x\n");

		Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();

		dspl(a, b, x, funcW(a, b, x), funcY(a, b, x));
		dspl(0.1, 2.11, 0.1,0.5,1);
		dt();
	}
}
