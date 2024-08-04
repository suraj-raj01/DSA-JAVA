package Design.Specification2;

public class Employee {
    private String name;
    private String email;
    private String panCardNumber;
    private String mobile;
    private String permanentAddress;
    private String presentAddress;
    private String communicationAddress;

    public Employee(String name, String email, String panCardNumber, String mobile, String permanentAddress, String presentAddress, String communicationAddress) {
        this.name = name;
        this.email = email;
        this.panCardNumber = panCardNumber;
        this.mobile = mobile;
        this.permanentAddress = permanentAddress;
        this.presentAddress = presentAddress;
        this.communicationAddress = communicationAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String localAddress) {
        this.presentAddress = presentAddress;
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }
    public String EmplyeeDetails()
    {
        String response = null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(", ");
        stringBuilder.append(email);
        stringBuilder.append(", ");
        stringBuilder.append(panCardNumber);
        stringBuilder.append(", ");
        stringBuilder.append(mobile);
        stringBuilder.append(", ");
        stringBuilder.append(permanentAddress);
        stringBuilder.append(", ");
        stringBuilder.append(presentAddress);
        stringBuilder.append(", ");
        stringBuilder.append(communicationAddress);
        response = stringBuilder.toString();
        return response;
    }
}
