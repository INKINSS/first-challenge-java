public class Main {
    public static void main(String[] args) {
        String nameOwner = "Samuel Perez";
        String typeAccount = "Ahorro";
        double balance = 100.0;

        Main mainInstance = new Main();
        System.out.println(mainInstance.divider());
        System.out.println(nameOwner);
        System.out.println(typeAccount);
        System.out.println(balance);
    }
    public String divider() {
        return "*********************";
    }
}