
import java.util.Scanner;

public class areaofCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float radius=sc.nextFloat();
        float area= (float) (3.14*radius*radius);
        System.out.println(area);
    }
}
