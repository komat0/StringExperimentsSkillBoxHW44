public class Phones {


    public static void phoneFormat() {
        String phone = "8-905-12345672342";
        StringBuilder str = new StringBuilder(phone.replaceAll("\\D", "").trim());
        String clearNumbers;
        System.out.println(str.length());
        if (str.length() == 11 && str.charAt(0) == '7') {
            System.out.println(str);
        } else if (str.length() == 11 && str.charAt(0) == '8') {
            str.replace(0, 1, "7");
            System.out.println(str);
        } else if (str.length() == 10)  {
            str.insert(0,'7');
            System.out.println(str);
        }  else {
            System.out.println("Номер укаазан неверно");
        }
    }

}
