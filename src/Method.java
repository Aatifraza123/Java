
import java.util.*;
 class Sum {
    int add(int a, int b){

        return  a + b;
    }
}
     public class Method{
    public static void main(String[] args) {
        Sum obj = new Sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: " );
        int x = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int y = sc.nextInt();
        System.out.println("Sum of input number is: ");
        int ans = obj.add(x, y);
        System.out.println(ans);
    }

}