package data;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private String street;
    private int homeNumber;

    public Person(String firstName, String lastName, int age, String city, String street, int homeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void showInfo(){
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Adres: ul." + street + " " + homeNumber + ", " + city);
    }
}
