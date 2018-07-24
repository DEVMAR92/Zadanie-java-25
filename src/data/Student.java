package data;

public class Student extends Person {
    private double averageRating;

    public Student(String firstName, String lastName, int age, String city, String street, int homeNumber, double averageRating) {
        super(firstName, lastName, age, city, street, homeNumber);
        this.averageRating = averageRating;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public void showInfo() {
        System.out.println("STUDENT");
        super.showInfo();
        System.out.println("średnia ocena: " + averageRating + "\n");
    }
}
