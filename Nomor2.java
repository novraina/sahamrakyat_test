package main;

public class Nomor2 {
    public static void main(String[] args) {
        Nomor2 nomor2 = new Nomor2();
        nomor2.palindrome("aku suka makan nasi");
    }

    private void palindrome(String sentence) {
        String[] word = sentence.split(" ");
        for (int i = 0; i < word.length - 1; i++) {
            String palindrome = (word[i] + word[i+1]).toLowerCase();
            boolean pals = true;
            int l = palindrome.length() - 1;
            for (int k = 0; k < l; k++) {
                if (palindrome.charAt(k) != palindrome.charAt(l)) {
                    pals = false;
                }
                l--;
            }
            if (pals){
                System.out.println(word[i] + " " + word[i+1]);
            }
        }
    }
}
