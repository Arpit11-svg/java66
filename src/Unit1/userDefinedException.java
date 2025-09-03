package Unit1;

//STEP 2 Continuous
public class userDefinedException {
    public void validate(int age) throws invalidAgeException {
        if(age<18){
            throw new invalidAgeException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
