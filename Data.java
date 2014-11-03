public class Data{
    public static int number = 0;
    Data(){
        number++;
    }
    public void show(){
	System.out.println("your number:" + number);
    }
}