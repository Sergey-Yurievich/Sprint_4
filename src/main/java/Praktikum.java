public class Praktikum {

    public static void main(String[] args) {

        String controlName = "Иван Пупкин";

        Account account = new Account(controlName);

        boolean check = account.checkNameToEmboss();

        System.out.println(check);
    }
}
