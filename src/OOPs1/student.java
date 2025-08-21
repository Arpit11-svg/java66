package OOPs1;

public class student {
    public int rollNo;
    public String name;
    private String grade;

    public student(String grade, String name, int rollNo) {
        this.grade = grade;
        this.name = name;
        this.rollNo = rollNo;
    }

    public student(int rollNo, String name) {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}


