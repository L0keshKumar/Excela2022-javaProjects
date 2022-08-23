package Collectiontask;

public class Patient {
	private long patientId;
	private String patientName;
	private String location;
	private long mobileNumber;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(long patientId, String patientName, String location, long mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.location = location;
		this.mobileNumber = mobileNumber;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "\nPatient [patientId=" + patientId + ", patientName=" + patientName + ", location=" + location
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
		result = prime * result + (int) (patientId ^ (patientId >>> 32));
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (mobileNumber != other.mobileNumber)
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	
}
