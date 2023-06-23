
import java.util.*;

public class DB {
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    public void addRecord(Student student) {
        list.add(student);
    }

    public void showRecord() {
        if(list.isEmpty()){
            System.out.println("--------------------------------------");
            System.out.println("NO Records to display.");
            System.out.println("--------------------------------------");
            return;
        }
        System.out.println("--------------------------------------");
        for(Student stud : list){
            System.out.println(stud);
        }
        System.out.println("--------------------------------------");
    }

    
    public void editRoll(int roll) {
        for (Student student : list) {
            if (student.getRollNo()==roll) {
                System.out.println("Enter new roll number: ");
                int newRoll = sc.nextInt();
                student.setRollNo(newRoll);
                System.out.println("Updated Successfully!");
                return;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Record not Found!!");
        System.out.println("--------------------------------------");
    }

    public void editName(String name) {
        for (Student student : list) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Enter new Name: ");
                String newName = sc.next();
                student.setName(newName);
                System.out.println("Updated Successfully!");
                return;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Record not Found!!");
        System.out.println("--------------------------------------");
    }

    public void editFees(int fees) {
        for (Student student : list) {
            if (student.getFees()==fees) {
                System.out.println("Enter new Fees: ");
                int newFees = sc.nextInt();
                student.setRollNo(newFees);
                System.out.println("Updated Successfully!");
                return;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Record not Found!!");
        System.out.println("--------------------------------------");
    }

    public void delRecord(int roll) {
        for (Student student : list) {
            if (student.getRollNo()==roll) {
                list.remove(student);
                System.out.println("Deleted Successfully!");
                return;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Record not Found!!");
        System.out.println("--------------------------------------");
    }
    
}
