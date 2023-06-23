
public class Student{
    private int rollNo;
    private String Name;
    private int fees;
    public Student(int rollNo, String name, int fees) {
        this.rollNo = rollNo;
        Name = name;
        this.fees = fees;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getFees() {
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", Name=" + Name + ", fees=" + fees + "]";
    }
}