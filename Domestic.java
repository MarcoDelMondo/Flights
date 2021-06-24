public class Domestic extends Commercial {
	private static double airportFee;

	public Domestic(String dl, String dest, Time departTime, Time duration, Double sF, Double aF) {
		super(dl, dest, departTime, duration, sF);
		status = "On Time";
		flightNumber += "-D";
	}

	public double getAirportFee() {
		return airportFee;
	}

	public void setAirportFee(double aF) {
		airportFee = aF;
	}

	@Override
	public String toString() {
		return super.toString() + "\n";
	}

}
