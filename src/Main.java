import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("Blount", "Malika", LocalDate.of(1993, 9,24), "F");

        System.out.println(patient.getLastName());
        System.out.println(patient.getFirstName());
        System.out.println(patient.getDateOfBirth());
        System.out.println(patient.getSex());
    }
}
