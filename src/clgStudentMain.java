public class clgStudentMain extends collegeStudent{
    public clgStudentMain(int rollNo, String address) {
        super(rollNo, address);
    }

    public static void main(String[] args) {
        collegeStudent student1=new clgStudentMain(66,"Ghaziabad");
        student1.showRoll();
    }


}
