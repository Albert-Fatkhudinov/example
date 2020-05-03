package palindrom;

public class Palindrome {

    public void checkPalindrome(String word) {
        word = word.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String palindromeWord = word.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        StringBuilder builder = new StringBuilder(palindromeWord).reverse();
        if (builder.toString().equals(word)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
