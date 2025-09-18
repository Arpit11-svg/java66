package Unit3;

public class student implements Comparable<student>{
    int age;
    String name;
    int roll_no;

    public student(int age, String name, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }

    public int compareTo(student st){
        if(age==st.age){
            return 0;
        }
        else if(age>st.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
