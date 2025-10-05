public class removeNumbers {
    public static void main(String[] args) {
        String input = "Hello983714567Goo097898Morning";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!Character.isDigit(ch)) {
                result += ch;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Output: " + result);
    }
}
