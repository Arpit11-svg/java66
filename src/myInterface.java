public class myInterface implements showable{
    public void show(){
        System.out.println("I am in show method.");
    }

    public static void main(String[] args) {
        myInterface obj=new myInterface();
        obj.show();

    }
}
