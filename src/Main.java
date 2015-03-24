import java.util.Scanner;
import java.util.Arrays;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s;
        int [] array = new int [2];
//        int x, y,z;
        double x,xx;
        
        while(cin.hasNextDouble()) {
            x = cin.nextDouble();
//            y = cin.nextInt();
//            z = cin.nextInt();
             
            
//            double x1 =(double) x;
//            double y1 =(double) y;
//            double z1 =(double) z;
            xx =x*x;
            BigDecimal bd= new BigDecimal(xx);
            bd=bd.setScale(1, BigDecimal.ROUND_HALF_UP);
            System.out.println(bd.doubleValue()); 
            
        }
    }
}