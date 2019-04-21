import java.util.ArrayList;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        for (int k = 0; k < 10; k++) {
            Ticket ticket = new Ticket(k, "Question " + k);
            tickets.add(ticket);
        }
        //group cycle
        for (int l = 0; l < 2; l++) {
            ArrayList<Student> students = new ArrayList<>();
            Student bestStudent = new Student("", "", 0, new Ticket(0, ""));
            Student worthStudent = new Student("", "", 0, new Ticket(0, ""));

            //this is students' cycle
            for (int i = 0; i < 5; i++) {
                Random r = new Random();
                int result = r.nextInt(6-1) + 1;
                int randomTicketIndex = r.nextInt(10-1) + 1;

                Student student = new Student("Name" + i + l, "lastName" + i + l, result, tickets.get(randomTicketIndex));
                    if (student.result < worthStudent.result || i == 0) {
                        worthStudent = student;
                    }
                    if (student.result > bestStudent.result || i == 0) {
                        bestStudent = student;
                    }
                students.add(student);
                results.add(result);
            }

            Group group = new Group("Group" + l, students);
            groups.add(group);
            int sum = 0;
            for (int element : results) {
                sum += element;
            }

            System.out.println(group);
            System.out.println(students);
            double averageResult = (double) sum / results.size();
            System.out.println("Average result: " + averageResult);
            System.out.println("Worth result: " + worthStudent);
            System.out.println("Best result: " + bestStudent);
        }
    }
}
