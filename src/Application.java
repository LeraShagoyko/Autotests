import java.util.ArrayList;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        for (int k = 0; k < 10; k++) {
            Ticket ticket = new Ticket(k, "Question " + k);
            tickets.add(ticket);
        }
        for (int i = 0; i < 5; i++) {

            Random r = new Random();
            int result = r.nextInt(6-1) + 1;
            int randomTicketIndex = r.nextInt(11-1) + 1;

            Student student = new Student("Name" + i, "lastName" + i, result, tickets.get(randomTicketIndex));

            students.add(student);
            results.add(result);
        }
        int sum = 0;
        for (int element : results) {
            sum += element;
        }

        System.out.println(students);
        double averageResult = (double) sum / results.size();
        System.out.println("Average result: " + averageResult);
    }
}
