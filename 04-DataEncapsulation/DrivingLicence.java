public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String birthDate;
    private String city;
    private String zipCode;
    private String type;
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getCity() {
        return city;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getType() {
        return type;
    }
    
    public String display(){
        return getName(); 
    }

    
}
