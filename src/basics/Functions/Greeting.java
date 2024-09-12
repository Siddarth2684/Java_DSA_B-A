package basics.Functions;

public class Greeting {
    public static void main(String[] args) {
        greet();
    }
    // not returning anything the function is of type void
    static void greet()
    {
        System.out.println("hii,I'm executed from function greet itself and not returning anything");
    }
}
