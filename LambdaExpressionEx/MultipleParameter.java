package LambdaExpressionEx;


    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }
public class MultipleParameter {
    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String args[])
    {
        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = (int x, int y) -> x + y;

        // lambda expression multiplication for two
        // parameters This expression also implements
        // 'FuncInter1' interface
        FuncInter1 multiply = (int x, int y) -> x * y;

        // Creating an object of Test to call operate using
        // different implementations using lambda
        // Expressions
        MultipleParameter tobj = new MultipleParameter();

        // Add two numbers using lambda expression
        System.out.println("Addition is "
                + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is "
                + tobj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 fobj = message
                -> System.out.println("Hello " + message);
        fobj.sayMessage("Geek");
    }
}
