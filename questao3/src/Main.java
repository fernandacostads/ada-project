import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int linha = 1;

        desenharTriangulo(n);
        System.out.println();
        desenharTrianguloInvertido(n);

        scanner.close();
    }

    public static void desenharTriangulo(int n) {
        int linhas = Math.min(n, 5);

        for (int i = 1; i <= linhas; i++) {
            for (int j = linhas - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void desenharTrianguloInvertido(int n) {
        int linhas = Math.min(n, 5); // só testando

        for (int i = linhas; i > 0; i--) {
            for (int j = linhas - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
