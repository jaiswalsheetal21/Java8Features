package LambdaExpressionEx;

public class Alphabets {
    public static boolean isStringOnlyAlphabet(String str)
    {
        return (
                (str != null) && (!str.equals(""))
                        && (str.chars().allMatch(Character::isLetter)));
    }

    public static void main(String[] args)
    {

        System.out.println("Test Case 1:");

        String str1 = "GeeksforGeeks";
        System.out.println("Input: " + str1);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str1));

        System.out.println("\nTest Case 2:");

        String str2 = "Geeks4Geeks";
        System.out.println("Input: " + str2);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str2));

        System.out.println("\nTest Case 3:");
        String str3 = null;
        System.out.println("Input: " + str3);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str3));

        System.out.println("\nTest Case 4:");
        String str4 = "";
        System.out.println("Input: " + str4);

        System.out.println("Output: "
                + isStringOnlyAlphabet(str4));
    }
}
