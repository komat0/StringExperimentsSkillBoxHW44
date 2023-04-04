public class WordToWord {

    public static void wortToWord() {

        String gettingText = "Дорогие, блин, гости. Здравствуйте! Однако, не каждый " +
                "знает: где сидит физ-ра, а где культура и почему " +
                "пуля   - дура, а штык - нет; 222    -  ООО 'Ромашка' " +
                "Nemnogo ^ teksta : NA ANGLIYSKOM";
        String space = " ";
        String textOnly = gettingText.replaceAll("[^\\p{L}\\p{N}-\\s]|\\s+-+", "")
                .replaceAll("\\s+", " ").trim();
        for (int i = 0; i < textOnly.length(); i++) {
            String a = String.valueOf(textOnly.charAt(i));
            if (!a.equals(space)) {
                System.out.print(a);
            } else {
                System.out.println();
            }
        }
    }
}
