class King {
    public static void main(String[] args) {
     
        String str = "Hello Good Morning";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
             rev += rev.charAt(i);
        System.out.println("Reversed: " + rev);
    }
}