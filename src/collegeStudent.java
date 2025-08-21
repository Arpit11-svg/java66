public class collegeStudent {
    public int rollNo;
    protected String address;

    public collegeStudent(int rollNo,String address) {
        this.rollNo = rollNo;
        this.address=address;
    }
    public void showRoll(){
        System.out.println("Roll number is : " + rollNo );
    }
    public void showAdd(){
        System.out.println("Address is " + address);
    }
}
