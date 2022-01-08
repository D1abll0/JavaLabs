//10
import static java.lang.Math.*;

public class Main
{ double eps=0.00001;
    public static void main(String[] args)
    {
        Main prog = new Main();
        prog.run();
    }

    public double func(double x, double t)
    {
        if(x <= 0.9+eps)
            return (log(x) * log(x) * log(x) + x * x) / sqrt(x + t);

            return cos(x) + t * sin(x) * sin(x);
    }




    public int sizeArr(double x1, double x2, double dx)
    {
        return (int)((x2 - x1) / dx +1);
    }


    public void run()
    {
        double x1 = 0.2;
        double x2 = 2;
        double dx = 0.004;
        double t = 2.2;

       double[] x=fillArrX(x1, x2, dx);

       double [] y=fillArrY(x,t);
        printArrays(x,y);



    }

    public void printArrays(double[] x,double [] y) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("i=%d, x=%24.22f y=%24.22f\n", i, x[i], y[i]);
        }
    }

    public double[] fillArrX(double x1, double x2, double dx)
    {
        double arrayX[] = new double[sizeArr(x1, x2, dx)];
        for (int i = 0;i<arrayX.length; i++)
        {
           arrayX[i]=x1+i*dx;
            //
        }
        return arrayX;
    }
    public double[] fillArrY(double [] x,double t)
    {
        double arrayY[] = new double[x.length];
        for (int i = 0;i<arrayY.length; i++)
        {
            arrayY[i]=func(x[i],t);
        }
        return arrayY;
    }
}