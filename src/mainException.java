import java.util.Scanner;

public class mainException {
    public static void main(String[] args) throws lowMarksException,negativeMarksException {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Please enter marks: ");
            int marks=sc.nextInt();
             if(marks<0){
                throw new negativeMarksException("Marks are negative so please work hard.");
            }
            else if (marks<10){
                throw new lowMarksException("Marks are less than 10 please try next time.");
            }

            System.out.println("Nice man! You have achieved good marks.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
