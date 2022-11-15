public class DrivingLicense {

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Address: " + getAddress());
        System.out.println("Postal code: " + getPostalCode());
        System.out.println("City: " + getCity());
        System.out.println("License number: " + getLicenseNumber());
        System.out.println("Year of issue: " + getYearOfIssue());
        System.out.println("License category: " + getLicenseCategory());
    };

    public String getName() {
        return name;
    };
    public void setName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    };

    public String getSurname() {
        return surname;
    };
    public void setSurname(String surname) {
        this.surname = surname;
    };

    public String getAddress() {
        return address;
    };
    public void setAddress(String address) {
        this.address = address;
    };

    public String getPostalCode() {
        return postalCode;
    };
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    };

    public String getCity() {
        return city;
    };
    public void setCity(String city) {
        this.city = city;
    };

    public String getLicenseNumber() {
        return licenseNumber;
    };
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    };

    public int getYearOfIssue() {
        return yearOfIssue;
    };
    public void setYearOfIssue(int yearOfIssue) {
        if ((yearOfIssue >= 1980) | (yearOfIssue <= 2022)) {
            this.yearOfIssue = yearOfIssue;
        }
    };

    public String getLicenseCategory() {
        return licenseCategory;
    };
    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    };

    public String toString() {
        return name + surname + address + postalCode + city + licenseNumber + yearOfIssue + licenseCategory;
    };

}