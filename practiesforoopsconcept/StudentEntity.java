package practiesforoopsconcept;

public class StudentEntity {

	// Encapsulation

	private int stdrollnumber;
	private String stdfirstname;
	private String stdlastname;
	private String stdAddress;
	private int stdstandard;
	private long stdphonenumber;
	private String stddvision;

	public StudentEntity(int stdrollnumber, String stdfirstname, String stdlastname, String stdAddress, int stdstandard,
			long stdphonenumber, String stddvision) {

		this.stdrollnumber = stdrollnumber;
		this.stdfirstname = stdfirstname;
		this.stdlastname = stdlastname;
		this.stdAddress = stdAddress;
		this.stdstandard = stdstandard;
		this.stdphonenumber = stdphonenumber;
		this.stddvision = stddvision;
	}

	public int getStdrollnumber() {
		return stdrollnumber;
	}

	public void setStdrollnumber(int stdrollnumber) {
		this.stdrollnumber = stdrollnumber;
	}

	public String getStdfirstname() {
		return stdfirstname;
	}

	public void setStdfirstname(String stdfirstname) {
		this.stdfirstname = stdfirstname;
	}

	public String getStdlastname() {
		return stdlastname;
	}

	public void setStdlastname(String stdlastname) {
		this.stdlastname = stdlastname;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public int getStdstandard() {
		return stdstandard;
	}

	public void setStdstandard(int stdstandard) {
		this.stdstandard = stdstandard;
	}

	public long getStdphonenumber() {
		return stdphonenumber;
	}

	public void setStdphonenumber(long stdphonenumber) {
		this.stdphonenumber = stdphonenumber;
	}

	public String getStddvision() {
		return stddvision;
	}

	public void setStddvision(String stddvision) {
		this.stddvision = stddvision;
	}

}
