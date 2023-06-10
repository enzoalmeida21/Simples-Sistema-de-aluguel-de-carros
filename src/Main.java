import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] carros= {"BMW X6", "VOLVO X-60", "Tesla Model-T", "Honda CRV"};
        Boolean executar = true;

        while (executar) {
            System.out.println("Escolha qual carro você gostaria de alugar:");
            System.out.println("1. " + carros[0]);
            System.out.println("2. " + carros[1]);
            System.out.println("3. " + carros[2]);
            System.out.println("4. " + carros[3]);
            System.out.println("0. Sair");

            System.out.println("Escolha sua Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Parabens pela sua escolha, dirija-se a unidade mais proxima para receber o seu veículo. O veículo escolhido foi " + carros[0]);
                    break;
                case 2:
                    System.out.println("Parabens pela sua escolha, dirija-se a unidade mais proxima para receber o seu veículo. O veículo escolhido foi " + carros[1]);
                    break;
                case 3:
                    System.out.println("Parabens pela sua escolha, dirija-se a unidade mais proxima para receber o seu veículo. O veículo escolhido foi " + carros[2]);
                    break;
                case 4:
                    System.out.println("Parabens pela sua escolha, dirija-se a unidade mais proxima para receber o seu veículo. O veículo escolhido foi " + carros[3]);
                    break;
                case 0:
                    System.out.println("Não foi hoje :( , mas espero que você alugue em breve um de nossos veículos");
                    executar = false;
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente!");

            }
        }
    }
}