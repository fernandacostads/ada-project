import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperatura = 0.0;
        double temperaturaResultante = 0.0;
        String aux = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura: ");
        temperatura = scanner.nextDouble();
        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        char unidadeDeOrigem = scanner.next().charAt(0);
        unidadeDeOrigem = Character.toUpperCase(unidadeDeOrigem);
        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        char unidadeDeDestino = scanner.next().charAt(0);
        unidadeDeDestino = Character.toUpperCase(unidadeDeDestino);

        switch (unidadeDeOrigem) {
            case 'C':
                switch (unidadeDeDestino) {
                    case 'C':
                        temperaturaResultante = temperatura;
                        aux = String.format("%.2f C = %.2f C", temperatura, temperaturaResultante);
                        break;
                    case 'K':
                        temperaturaResultante = temperatura + 273.15;
                        aux = String.format("%.2f C = %.2f K", temperatura, temperaturaResultante);
                        break;
                    case 'F':
                        temperaturaResultante = (temperatura * 9 / 5) + 32;
                        aux = String.format("%.2f C = %.2f F", temperatura, temperaturaResultante);
                        break;
                    default:
                        aux = "Unidade de destino inválida!";
                }
                break;
            case 'K':
                switch (unidadeDeDestino) {
                    case 'C':
                        temperaturaResultante = temperatura - 273.15;
                        aux = String.format("%.2f K = %.2f C", temperatura, temperaturaResultante);
                        break;
                    case 'K':
                        temperaturaResultante = temperatura;
                        aux = String.format("%.2f K = %.2f K", temperatura, temperaturaResultante);
                        break;
                    case 'F':
                        temperaturaResultante = (temperatura - 273.15) * 9 / 5 + 32;
                        aux = String.format("%.2f K = %.2f F", temperatura, temperaturaResultante);
                        break;
                    default:
                        aux = "Unidade de destino inválida!";
                }
                break;
            case 'F':
                switch (unidadeDeDestino) {
                    case 'C':
                        temperaturaResultante = (temperatura - 32) * 5 / 9;
                        aux = String.format("%.2f F = %.2f C", temperatura, temperaturaResultante);
                        break;
                    case 'K':
                        temperaturaResultante = (temperatura - 32) * 5 / 9 + 273.15;
                        aux = String.format("%.2f F = %.2f K", temperatura, temperaturaResultante);
                        break;
                    case 'F':
                        temperaturaResultante = temperatura;
                        aux = String.format("%.2f F = %.2f F", temperatura, temperaturaResultante);
                        break;
                    default:
                        aux = "Unidade de destino inválida!";
                }
                break;
            default:
                aux = "Unidade de origem inválida!";
        }

        System.out.println(aux);

        scanner.close();
    }
}
