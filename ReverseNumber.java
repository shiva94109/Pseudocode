/* Reverse Number 

DECLARE num, rem, rev AS INTEGER
READ num
SET rev := 0
WHILE num > 0
    rem := num MOD 10
    rev := rev * 10 + rem
    num := num / 10
END WHILE
PRINT "Reverse of the number is : " + rev

*/
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding Reverse Number : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of the number is : "+ rev);
        sc.close();
    }
}