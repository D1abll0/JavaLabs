import java.time.LocalTime;
import java.util.Objects;


public class Train
{
	String destination;
	int trainNumber;
	LocalTime dispatch;
	int seatsCount;
	int seatsGeneral;
	int seatsCompartment;
	int seatsReserved;
	int seatsLux;

	public Train(String destination, int trainNumber, LocalTime dispatch, int seatsGeneral,	int seatsCompartment, int seatsReserved, int seatsLux)
	{
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.dispatch = dispatch;
		this.seatsGeneral = seatsGeneral;
		this.seatsCompartment = seatsCompartment;
		this.seatsReserved = seatsReserved;
		this.seatsLux = seatsLux;
		this.seatsCount = seatsGeneral + seatsCompartment + seatsReserved + seatsLux;
	}

	public String getDestination(){return destination;}
	public void setDestination(String destination){this.destination = destination;}

	public int getTrainNumber(){return trainNumber;}
	public void setTrainNumber(int trainNumber){this.destination = destination;}

	public LocalTime getDispatch(){return dispatch;}
	public void setDispatch(LocalTime dispatch){this.dispatch = dispatch;}

	public int getSeatsGeneral(){return seatsGeneral;}
	public void setSeatsGeneral(int seatsGeneral){this.seatsGeneral = seatsGeneral;}

	public int getSeatsCompartment(){return seatsCompartment;}
	public void setSeatsCompartment(int seatsCompartment){this.seatsCompartment = seatsCompartment;}

	public int getSeatsReserved(){return seatsReserved;}
	public void setSeatsReserved(int seatsReserved){this.seatsReserved = seatsReserved;}

	public int getSeatsLux(){return seatsLux;}
	public void setSeatsLux(int seatsLux){this.seatsLux = seatsLux;}

	@Override
	public String toString()
	{
		return "Train{\n destination: " + destination + "\n trainNumber: " + trainNumber + "\n dispatch: " + dispatch + "\n seatsCount: " + seatsCount +"\n}";
	}

}