public class Main {
    static boolean isPalindromic(String str){
        int i = 0, j = str.length() - 1;
        while (i>j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindromic2(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        /*
        We are writing a program in Java that finds whether the word entered by the user is "palindromic".
         */
        System.out.println(isPalindromic("Appa"));
    }
}