import java.time.LocalDate;

public class Patient {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String sex;
    private String location;
    private String dx;
    private int id;

    public Patient(String lastName, String firstName, LocalDate dateOfBirth, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDx(String dx) {
         this.dx = dx;
    }

}
