
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    DB db = new DB();
    
    public void addStudent() {
        System.out.println("Enter Roll number:");
        int roll = sc.nextInt();
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter amount of Fees: ");
        int fee = sc.nextInt();
        db.addRecord(new Student(roll, name, fee));
    }

    public void updateStudent() {
        System.out.println("--------------------------------------");
        System.out.println("What do you want to update:");
        System.out.println("1. press 1 to edit Roll Number.");
        System.out.println("2. press 2 to edit Name.");
        System.out.println("3. press 3 to edit Fees.");
        System.out.println("--------------------------------------");
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("ENter roll number: ");
                int roll = sc.nextInt();
                db.editRoll(roll);
                System.out.println("called");
                break;
            case 2:
                System.out.println("ENter Name: ");
                String name = sc.next();
                db.editName(name);
                break;
            case 3:
                System.out.println("ENter Fees: ");
                int fees = sc.nextInt();
                db.editFees(fees);
                break;
            default:
            System.out.println("--------------------------------------");
                System.out.println("Enter a valid option");
                System.out.println("--------------------------------------");
        }
    }

    public void delStudent() {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter roll number of student you want to delete: ");
        int roll = sc.nextInt();
        System.out.println("------------------------------------------------------");
        db.delRecord(roll);
    }

    public void showStudent() {
        db.showRecord();
    }

}
