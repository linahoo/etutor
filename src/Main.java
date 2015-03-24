import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s;
        int [] array = new int [2];
        int x, y,z;
        while(cin.hasNextInt()) {
            s = cin.nextLine();
             
            x = Integer.parseInt(s.split(" ")[0]);
            y = Integer.parseInt(s.split(" ")[1]);
            z = x+y; 
            System.out.println(x*y/2);
            
        }
    }
}