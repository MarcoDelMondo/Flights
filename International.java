public class International extends Commercial {
	private String country;

	public International(String dl, String dest, Time departTime, Time duration, Double sF, String ct) {
		super(dl, dest, departTime, duration, sF);
		status = "On Time";
		country = ct;
		flightNumber += "-I";
	}
	@Override
	public String toString() {
		return super.toString() + "Country: " + country + "\n";

	}
}
