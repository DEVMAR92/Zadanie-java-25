package data;

public class Teacher extends Person {

    private double payment;
    private String teachingSubject;

    public Teacher(String firstName, String lastName, int age, String city, String street, int homeNumber, double payment, String teachingSubject) {
        super(firstName, lastName, age, city, street, homeNumber);
        this.payment = payment;
        this.teachingSubject = teachingSubject;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public void showInfo() {
        System.out.println("NAUCZYCIEL");
        super.showInfo();
        System.out.println("Wysokość wynagrodzenia: " + payment);
        System.out.println("Przedmiot nauczania: " + teachingSubject + "\n");
    }
}
