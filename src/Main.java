import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        int option;

        do{
            System.out.println("=== Coffee Machine ===");
            System.out.println("1 - Servir café");
            System.out.println("2 - Recarregar água");
            System.out.println("3 - Recarregar café");
            System.out.println("4 - Verificar nível da água e do café");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            option = scanner.nextInt();

            switch(option){
                case 1 -> coffeeMachine.serveCoffee();
                case 2 -> {
                    System.out.println("Informe quanto de água para reabastecer (ml): ");
                    int amountWater = scanner.nextInt();
                    coffeeMachine.refillWater(amountWater);
                }
                case 3 -> {
                    System.out.println("Informe quanto de café para reabastecer (gramas): ");
                    int amountCoffee = scanner.nextInt();
                    coffeeMachine.refillCoffee(amountCoffee);
                }
                case 4 -> coffeeMachine.getStatus();
                case 0 -> {
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida");
            }
        } while (true);
    }
}
