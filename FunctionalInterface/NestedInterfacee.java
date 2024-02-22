package FunctionalInterface;

public class NestedInterfacee {
    public interface NestedInterface {
        public void nestedMethod();
    }

    public static void main(String[] args)
    {
        // Implement nested interface
        NestedInterface nested = new NestedInterface() {
            public void nestedMethod()
            {
                System.out.println(
                        "Hello from nested interface!");
            }
        };

        // Call nested interface method
        nested.nestedMethod();
    }
}

