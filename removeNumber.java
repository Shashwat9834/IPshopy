public class removeNumber {
    public static void main (String[] args) {
        String str  = "Hello983714567Goo097898Morning"; 
        String out = " "; 
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                out += ch;
            }

        System.out.println("String after removing numbers: " +  " " + out + " ");

            

        }
    }
}
