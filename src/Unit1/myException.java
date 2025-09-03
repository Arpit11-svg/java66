package Unit1;

public class myException {
    public static void main(String[] args) {
        userDefinedException udf=new userDefinedException();
        try{
            udf.validate(19);
            udf.validate(12);
        } catch(invalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
