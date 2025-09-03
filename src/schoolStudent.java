import OOPs1.student;

public class schoolStudent extends student {
    schoolStudent(int rollNo,String name){
        super(rollNo,name);
    }
    public void attendClass(){
        System.out.println(name+ " is attending the class.");
    }
    public void giveExam(){
        System.out.println(name + " is giving the exam.");
    }
}
