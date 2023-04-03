public class Alphabet {

    public static void alphabetCodes() {

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++) {
            char counter = alphabet.charAt(i);
            System.out.println(alphabet.charAt(i) + " - код " + (int) alphabet.charAt(i));
        }
    }
}
