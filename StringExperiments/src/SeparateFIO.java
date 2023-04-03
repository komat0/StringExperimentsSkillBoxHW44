import java.util.Scanner;

public class SeparateFIO {

    public static void separateFIO() {
        String firstName;
        String fatherName;
        System.out.println("Введите Фамилию Имя и Отчество через пробел.");
        Scanner scan = new Scanner(System.in);
        String fio = scan.nextLine();

        StringBuilder fioBuild = new StringBuilder(fio);
        // В переменную Отчества присваиваю значение диапазона строки от последнего пробела до
        // конца строки, затем удаляю этот фрагмент из строки что бы повторить процедуру с
        // именем. Также сохраняю в переменную Имени подстроку по индексам от последнего пробела
        // до конца строки (по ее длине). Затем удаляю скопированный в переменную кусок, таким
        // образом в строке остается только фамилия, а имя и отчество уже в отдельных переменных.
        fatherName = fioBuild.substring(fioBuild.lastIndexOf(" "));
        fioBuild.delete(fioBuild.lastIndexOf(" "), fio.length());

        firstName = fioBuild.substring(fioBuild.lastIndexOf(" "));
        fioBuild.delete(fioBuild.lastIndexOf(" "), fio.length());

        System.out.println("Фамилия: " + fioBuild);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + fatherName);
    }
}