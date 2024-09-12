import java.util.Scanner;

public class Main {
    private double saldo = 100.0;

    public static void main(String[] args) {
        String nameOwner = "Samuel Perez";
        String typeAccount = "Ahorro";
        byte option = 0;
        Scanner into = new Scanner(System.in);

        Main mainInstance = new Main();
        System.out.println(mainInstance.divider());
        System.out.println("dueño de la cuenta: " + nameOwner);
        System.out.println("tipo de cuenta: " + typeAccount);
        System.out.println("saldo actual: " + mainInstance.saldo);

        Main mainInstance2 = new Main();
        System.out.println(mainInstance2.divider());
        System.out.println("\n");
        String menu = """
                ***Elija una opción ***
                1 - consultar saldo
                2 - retiros
                3 - depósitos
                9 - salir
                """;

        while (option != 9) {
            System.out.println(menu);
            option = into.nextByte();

            switch (option) {
                case 1:
                    System.out.println(mainInstance2.totalSaldo());
                    break;
                case 2:
                    System.out.println("¿Cuanto dinero quiere retirar de su cuenta?");
                    double quitBalance = into.nextByte();
                    if (quitBalance > mainInstance.saldo){
                        System.out.println("saldo insuficiente");
                    }
                    mainInstance.saldo = mainInstance.saldo - quitBalance;
                    System.out.println(mainInstance.saldo);
                    break;
                case 3:
                    System.out.println("¿Cuanto dinero quiere depositar de su cuenta?");
                    double addBalance = into.nextDouble();
                    if (addBalance<0){
                        System.out.println("cantidad incorrecta");
                    }
                    mainInstance.saldo = mainInstance.saldo + addBalance;
                    System.out.println("saldo actual: " + mainInstance.saldo);
                    break;
                    case 9:
                        System.out.println("fue un gusto atenderle");
                default:
                    System.out.println("por favor, elija otra opción");
            }
        }
    }
    public String divider() {
        return "*********************";
    }

    public String totalSaldo() {
        return "tu saldo actual es de: " + saldo + "\n";
    }
}