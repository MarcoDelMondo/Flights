public class Commercial extends Flight {

	protected String status;
	protected Double securityFee;

	public Commercial(String dl, String dest, Time departTime, Time duration, Double sF) {
		super(dl, dest, departTime, duration);
		status = "On Time";
	}

	public String getStatus() {
		return status;
	}

	public Double getSecurityFee() {
		return securityFee;
	}
	public void setSecurityFee(Double sF) {
		securityFee = sF;
	}

	public void setStatus(String s) {
		status = s;
	}

	@Override
	public String toString() {
		return super.toString() + " Status: " + status + "\n";
	}

}
