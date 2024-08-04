package Design.Specification2;

public class Address {
    private int flatNumber;
    private String buildingName;
    private String locality;
    private String city;
    private String district;
    private String state;
    private String country;
    private int pinCode;

    public Address(int flatNumber, String buildingName, String locality, String city, String district, String state, String country, int pinCode) {
        this.flatNumber = flatNumber;
        this.buildingName = buildingName;
        this.locality = locality;
        this.city = city;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public int getPincode() {
        return pinCode;
    }

    public void setPincode(int pincode) {
        this.pinCode = pincode;
    }

    public String fullAddress()
    {
        String response = null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(flatNumber);
        stringBuilder.append(", ");
        stringBuilder.append(buildingName);
        stringBuilder.append(", ");
        stringBuilder.append(locality);
        stringBuilder.append(", ");
        stringBuilder.append(city);
        stringBuilder.append(", ");
        stringBuilder.append("district - ");
        stringBuilder.append(district);
        stringBuilder.append(", ");
        stringBuilder.append(state);
        stringBuilder.append(", ");
        stringBuilder.append(country);
        stringBuilder.append(", ");
        stringBuilder.append("Pincode - ");
        stringBuilder.append(pinCode);
        response = stringBuilder.toString();
        return response;
    }
}
