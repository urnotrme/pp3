public class Writer {
    private String lastName;
    private String firstName;
    private String genre;
    
    public Writer(String lastName, String firstName, String genre) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.genre = genre;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String display(){
        return "First Name: " + getFirstName() + "\nLast Name: " + getLastName()
                            + "\nGenre: " + getGenre();
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Olivia", "Paulizzo", "comedy");
        System.out.println(w1.display());
    }
    
}
