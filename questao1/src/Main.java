import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amortizacao = 0.0;
        double saldoDevedor = 0.0;
        double totalPagoJuros = 0.0;
        double totalPagoPrestacoes = 0.0;
        double totalAmortizado = 0.0;
        double jurosMensal = 0.0;
        double prestacao = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();
        System.out.println("Taxa de juros do empréstimo:");
        double taxaJuros = scanner.nextDouble() / 100;
        System.out.println("Digite o tempo para pagamento:");
        int tempoPagamento = scanner.nextInt();

        scanner.close();

        amortizacao = valorEmprestimo / tempoPagamento;
        saldoDevedor = valorEmprestimo;
        System.out.println("Valor fixo da amortização: R$ " + String.format("%.2f",amortizacao));
        System.out.println("Saldo devedor total: R$ " + String.format("%.2f",saldoDevedor) + " com juros de " + String.format("%.2f",(taxaJuros * 100)) + "% ao mês");

        for(int i=1; i <= tempoPagamento; i++) {
            jurosMensal = saldoDevedor * taxaJuros;
            prestacao = jurosMensal + amortizacao;
            saldoDevedor -= amortizacao;
            totalPagoJuros += jurosMensal;
            totalPagoPrestacoes += prestacao;
            totalAmortizado += amortizacao;

            System.out.println("Parcela " + i + " | Juros: R$ " + String.format("%.2f", jurosMensal)
                    + " | Prestação: R$ " + String.format("%.2f",prestacao) + " | Saldo devedor: R$ " + String.format("%.2f", saldoDevedor));
        }

        System.out.println("Total: Prestação R$ " + String.format("%.2f",totalPagoPrestacoes)
                + ", Juros R$ " + String.format("%.2f", totalPagoJuros) +
                ", Amortização R$ " + String.format("%.2f",totalAmortizado));
    }
}
