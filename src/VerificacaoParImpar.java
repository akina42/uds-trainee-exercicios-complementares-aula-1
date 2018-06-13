import java.util.Scanner;

public class VerificacaoParImpar {

    public void recebeNumeroEntrada(){
        System.out.println("--------------------------------------------------");
        System.out.println("3. Escreva uma função que receba um número, via Scanner, e imprima se o número é par ou impar.");
        System.out.println("--------------------------------------------------");
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        Integer entradaNumero = 0;
        try{
            entradaNumero = scanner.nextInt();
            this.identificaImprimeParOuImpar(entradaNumero);
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro no programa, verifique o valor de entrada digitado.");
        }

    }

    private void identificaImprimeParOuImpar(int entradaNumero){
        if ((entradaNumero % 2) == 0){
            System.out.println("O número " + entradaNumero + " é par!");
        }
        else{
            System.out.println("O número " + entradaNumero + " é ímpar!");
        }

    }
}
