public class Main {
    public static void main(String[] args) {
        Account rakib = new Account("Rakib", 500);
        System.out.println(rakib.getAccount_number());
        System.out.println(rakib.withdraw(200));
        System.out.println(rakib.withdraw(400));
        rakib.displayAccount();
    }
}