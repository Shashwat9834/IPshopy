public class King {
    public static void main(String[] args) {
        String input = "Hello Good Morning";
        String[] words = input.split(" "); 
        String result = "";

        for (String word : words) {
            String reverseWord = "";
           
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            result += reverseWord + " "; 
        }

        System.out.println("Input : " + input);
        System.out.println("Output: " + result.trim()); 
    }
}
