
public class Address {

	private int addressId;
	private String plotNo;
	private String city;
	private String state;
	private String country;

	private Place place;

	public Address() {
	}

	public Address(int addressId, String plotNo, String city, String state, String country, Place place) {
		this.addressId = addressId;
		this.plotNo = plotNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.place = place;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", plotNo=" + plotNo + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", place=" + place + "]";
	}

}
