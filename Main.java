
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. Enter 1 for inserting a record");
            System.out.println("2. Enter 2 for viewing all records");
            System.out.println("3. Enter 3 for deleting a record");
            System.out.println("4. Enter 4 for updating a record");
            System.out.println("5. Enter 5 for exiting the App.");
            System.out.println("--------------------------------------");
            int option = sc.nextInt();
            
            switch (option) {
                case 1:
                    service.addStudent();
                    break;
                case 2:
                    service.showStudent();
                    break;
                case 3:
                    service.delStudent(); 
                    break;
                case 4:
                    service.updateStudent();
                    break;
                case 5:
                    System.out.println("--------------------------------------");
                    System.out.println("Thanks for using the App.");
                    System.out.println("--------------------------------------");
                    System.exit(0);
                    break;
                default:
                System.out.println("--------------------------------------");
                    System.out.println("ENter a valid option");
                    System.out.println("--------------------------------------");
                    break;
            }
            
        }
    }
}
