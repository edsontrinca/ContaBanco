import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner dadosBacarios = new Scanner(System.in);
        System.out.println(" Informe sua Conta: ");
        Integer conta = dadosBacarios.nextInt();
        System.out.println(" Informe sua Agencia: ");
        String agencia = dadosBacarios.next();
        System.out.println(" Informe o Nome do Cliente: ");
        String nomeCliente = dadosBacarios.next();
        System.out.println(" Informe o valor do Deposito: ");
        BigDecimal saldoDaConta = dadosBacarios.nextBigDecimal();
        System.out.println( " Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldoDaConta + " já está disponível para saque. " );


    }
}
