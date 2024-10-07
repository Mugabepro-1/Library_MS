package library.people;

public class Person {
    private String fullName;
    private String address;
    private String email;


    public Person() {
    }
    public Person(String fullName, String address, String email) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
