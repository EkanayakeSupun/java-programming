import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomAlgorithm {

    public static void main(String[] args) {

        String  server[]=new String[4];

        server[0]="192.168.8.1"; // Server 1
        server[1]="192.168.8.2"; // Server 2
        server[2]="192.168.8.3"; // Server 3
        server[3]="192.168.8.4"; // Server 4

        for (int i = 0; i < 10; i++) { // Request count
            Random r=new Random(); // Random function
           int serverNo= r.nextInt(4); // Random function
            System.out.println(server[serverNo]); // obtaining to the server
        }

    }
}
