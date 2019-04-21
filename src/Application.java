import java.util.ArrayList;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            Random r = new Random();
            int low = 1;
            int high = 6;
            int result = r.nextInt(high-low) + low;

            Student student = new Student("Name" + i, "lastName" + i, result);

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
