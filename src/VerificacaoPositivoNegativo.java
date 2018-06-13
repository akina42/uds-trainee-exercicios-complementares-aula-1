import java.util.Scanner;

public class VerificacaoPositivoNegativo {

    public void recebeValorEntrada(){
        System.out.println("--------------------------------------------------");
        System.out.println("5. Escreva uma função para ler um valor, via Scanner, e alertar se é positivo ou negativo. " +
                "Considere o valor zero como positivo.");
        System.out.println("--------------------------------------------------");
        System.out.println("Digite um valor: ");
        Scanner scanner = new Scanner(System.in);
        Integer entradaNumero = 0;
        try{
            entradaNumero = scanner.nextInt();
            this.verificaImprimePositivoNegativo(entradaNumero);
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro no programa, verifique o valor de entrada digitado.");
        }
    }

    private void verificaImprimePositivoNegativo(Integer entradaNumero){
        if(entradaNumero < 0){
            System.out.println("O número " + " é negativo.");
        }
        else{
            System.out.println("O número " + " é positivo.");
        }
    }
}
