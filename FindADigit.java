/* Find a Number in an digit 

DECLARE num AS INTEGER
DECLARE target AS INTEGER
DECLARE found AS BOOLEAN
SET found := FALSE
READ num
READ target
WHILE num > 0
    IF num MOD 10 == target THEN
        SET found := TRUE
        BREAK
    END IF
    SET num := num / 10
END WHILE
IF found THEN
    PRINT "Number " + target + " is found in the number."
ELSE
    PRINT "Number " + target + " is not found in the number."
END IF

*/
public class FindADigit {
    public static void main(String[] args) {
        int num = 12345; // Example number
        int target = 3; // Number to find
        boolean found = false;
        while(num != 0){
            if(num % 10 == target){
                found = true;
                break;
            }
            num /= 10;
        }
        if(found){
            System.out.println("Number " + target + " is found in the number.");
        } else {
            System.out.println("Number " + target + " is not found in the number.");
        }
    }
}