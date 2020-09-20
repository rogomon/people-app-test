package Rogomon;

public class JavaTester
{
    int num;
    JavaTester(){
        num = 3;
        System.out.println("Constructor invoked. num: " + num);
    }
    public void init(){
        num = 5;
        System.out.println("Method invoked. num: " + num);
    }
    public static void main(String[] args) {
        JavaTester tester = new JavaTester();
        tester.init();
    }
}
