public class Employee {
    private String firstName;
    private String lastName;
    private String telephone;
    static int numberOfEmployees;

    public Employee(String firstName, String lastName, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        numberOfEmployees++;
    }
}
