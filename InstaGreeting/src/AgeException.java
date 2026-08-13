import java.util.Scanner;

class Age extends Exception {

    
}

public class AgeException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        try {

            if(age > 18 && age < 60) {
                System.out.println("You are a younger person.");
                System.out.println("You are not a child or senior person.");
            }
            else {
                throw new Age();
            }

        }
        catch(Age e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program Closed");
        }
    }
}