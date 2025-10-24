public class CoffeeMachine {
    private int coffee = 200;
    private int water = 500;

    public void serveCoffee(){
        if(coffee <= 10 || water <= 50){
            System.out.println("O nível da água ou do café está baixo, reabasteça a máquina.");
            return;
        }

        coffee -= 10;
        water -= 50;
        System.out.println("Servindo café...");
    }

    public void refillCoffee(int amountCoffee){
        if(coffee == 200){
            System.out.println("A capacidade de café da máquina está no máximo.");
            return;
        }

        if(amountCoffee <= 0){
            System.out.println("Entrada inválida! Informe um número maior que 0 para reabastecer.");
            return;
        }

        if((coffee + amountCoffee) > 200){
            coffee = 200;
            System.out.println("Ultrapassou o limite de café da máquina. Máquina reabastecida com sucesso (máximo).");
            return;
        }

        coffee += amountCoffee;
        System.out.println("Máquina reabastecida com sucesso.");
    }

    public void refillWater(int amountWater){
        if(water == 500){
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }

        if(amountWater <= 0){
            System.out.println("Entrada inválida! Informe um número maior que 0 para reabastecer.");
            return;
        }

        if((water + amountWater) > 500){
            water = 500;
            System.out.println("Ultrapassou o limite de água na máquina. Máquina reabastecida com sucesso (máximo).");
            return;
        }

        water += amountWater;
        System.out.println("Máquina reabastecida com sucesso.");
    }

    public void getStatus(){
        System.out.println("Nível de café na máquina: " + coffee + "g.");
        System.out.println("Nível de água na máquina: " + water + "ml.");
    }

    public int getCoffee() { return coffee; }

    public int getWater() { return water; }
}
