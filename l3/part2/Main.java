//10
import java.time.LocalTime;
public class Main {

	LocalTime dispatch;

	public static void main(String[] args){new Main().run();}

	private void run() 
	{
		Train[] train = fill();
		toFinalDestination(train);
		toFinalDestinationAndAfterTime(train);
		toFinalDestinationAndHaveGeneralSpots(train);
	}

	private void toFinalDestination(Train[] trains)
	{
		System.out.println("toFinalDestination");
		for(Train train : trains)
		{
			if(train.destination == "station1") System.out.println(train);
		}
		System.out.println("\n");
	}

	private void toFinalDestinationAndAfterTime(Train[] trains)
	{
		System.out.println("toFinalDestinationAndAfterTime");
		LocalTime time = LocalTime.parse("20:00");
		for(Train train : trains)
		{
			if(train.destination == "station1" && train.dispatch.compareTo(time) == 1) System.out.println(train);
		}
		System.out.println("\n");
	}

	private void toFinalDestinationAndHaveGeneralSpots(Train[] trains)
	{
		System.out.println("toFinalDestinationAndHaveGeneralSpots");
		for(Train train : trains)
		{
			if(train.destination == "station1" && train.seatsGeneral > 0) System.out.println(train);
		}
		System.out.println("\n");		
	}

	private Train[] fill()
	{
		return new Train[]
		{
			new Train("station1", 1, dispatch = LocalTime.parse("20:01"), 0,0,0,1),
			new Train("station1", 1, dispatch = LocalTime.parse("20:02"), 1,3,2,1)
		};
	}
}