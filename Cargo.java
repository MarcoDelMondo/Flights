public class Cargo extends Flight {

	private String freightDescription;

	public Cargo(String dl, String dest, Time departTime, Time duration, String fD) {
		super(dl, dest, departTime, duration);
		freightDescription = fD;
		flightNumber += "-C";
		
	}

	public String getFreightDescription() {
		return freightDescription;
	} 
	@Override
	public String toString() {
		return super.toString() + " Freight: " + freightDescription + "\n";
	}
}
