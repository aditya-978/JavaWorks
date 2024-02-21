import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AdvancedJavaPracticeSet {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList();
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i<10;i++){
//            System.out.println("Enter "+(i+1)+" student name");
//            studentName.add(i, sc.nextLine());
//        }
//        for(String name: studentName){
//            System.out.println(name);
//        }

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        String date = dt.format(df);
        System.out.println(date);

        Calendar gc = Calendar.getInstance();
        System.out.println(gc);


    }
}
