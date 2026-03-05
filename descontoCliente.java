import java.util.Scanner;
public class descontoCliente {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso mercado! Aqui, clientes com compra acima de 200 reais recebem 15% de desconto!");

        System.out.println("Digite o valor da compra: ");
        
        double compra = entrada.nextDouble();

        if (compra >= 200) {
            double desconto = compra * 0.15;
            double valorFinal = compra - desconto;

            System.out.println("Você é um cliente premium! Recebeu " + desconto + " reais de desconto. ");
            System.out.println("Você terá de pagar " + valorFinal + "reais.");

        }

        else {
            System.out.println("Sua compra não excedeu 200 reais, logo, você terá que pagar " + compra + " reais.");
        }

        entrada.close();
    }


    
}
