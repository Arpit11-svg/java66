package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class studentObject {
    public static void main(String[] args) {
        ArrayList<student> stObj=new ArrayList<>();
        stObj.add(new student(20,"Alice",11));
        stObj.add(new student(21,"Bob",22));
        stObj.add(new student(19,"Charle",1));
        stObj.add(new student(25,"David",99));
        stObj.add(new student(16,"Elish",69));
        Collections.sort(stObj);
        for(student st:stObj){
            System.out.println("Name is " + st.name + " with roll number "+st.roll_no+ " and age is "+ st.age);
        }
    }
}
