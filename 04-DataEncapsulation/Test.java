public class Test {
    public static void main(String[] args) {
        DrivingLicense l1 = new DrivingLicense();
        l1.setName("Alina");
        l1.setSurname("Markina");
        l1.setAddress("Al. 29 Listopada, 48A");
        l1.setPostalCode("31-425");
        l1.setCity("Kraków");
        l1.setLicenseNumber("123456");
        l1.setYearOfIssue(2022);
        l1.setLicenseCategory("B");

        l1.toString();
        l1.display();
    }
}
