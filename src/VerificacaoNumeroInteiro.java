import java.util.Scanner;

public class VerificacaoNumeroInteiro {
    public void recebeDadosEntrada(){
        System.out.println("--------------------------------------------------");
        System.out.println("4. Escreva uma função que receba um parâmetro e informe se o mesmo é ou não um número inteiro.");
        System.out.println("--------------------------------------------------");
        System.out.println("Digite um valor: ");
        Scanner scanner = new Scanner(System.in);
        String entradaQualquerTipo = "";
        entradaQualquerTipo = scanner.next();
        Boolean auxNumeroInteiro = this.verificaNumeroInteiro(entradaQualquerTipo);
        if(auxNumeroInteiro){
            System.out.println("O valor digitado " + entradaQualquerTipo + " é um número inteiro!");
        }
        else{
            System.out.println("O valor digitado " + entradaQualquerTipo + " não é um número inteiro.");
        }

    }

    private Boolean verificaNumeroInteiro(String entradaQualquerTipo){
        try{
            Integer.parseInt(entradaQualquerTipo);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


}
