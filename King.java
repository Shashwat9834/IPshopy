public class King {
    public static void main(String[] args) {
        String input = "Hello Good Morning";
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Input : " + input);
        System.out.println("Reversed: " + reverse);
    }
}
