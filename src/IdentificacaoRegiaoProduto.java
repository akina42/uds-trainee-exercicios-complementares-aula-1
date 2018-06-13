import java.util.Scanner;

public class IdentificacaoRegiaoProduto {

    /*
    public enum OpcaoRegiao {
        SUL(1),
        NORTE(2),
        LESTE(3),
        OESTE(4),
        NORDESTE(5),
        SUDESTE(7),
        CENTROOESTE(10),
        NOROESTE(11);

        private int opcaoRegiao;

        OpcaoRegiao(int valorOpcao){
            opcaoRegiao = valorOpcao;
        }

        public int getOpcaoRegiao() {
            return opcaoRegiao;
        }
    }
    */

    public void recebeCodigoProduto(){
        System.out.println("--------------------------------------------------");
        System.out.println("6. Escreva uma função que leia o código de origem de um produto, via Scanner, " +
                "e imprima na tela a região de sua procedência conforme a tabela:");
        System.out.println("--------------------------------------------------");
        System.out.println("Digite o código de origem do produto: ");
        Scanner scanner = new Scanner(System.in);
        Integer entradaNumero = 0;
        try{
            entradaNumero = scanner.nextInt();
            String nomeRegiao = this.identificaCodigoRegiao(entradaNumero);
            System.out.println("A região de procedência do produto é: " + nomeRegiao + ".");
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro no programa, verifique o valor de entrada digitado.");
        }
    }


    private String identificaCodigoRegiao(Integer entradaNumero){
        String nomeRegiao = "";
        switch (entradaNumero){
            case 1:
                nomeRegiao = "Sul";
                break;
            case 2:
                nomeRegiao = "Norte";
                break;
            case 3:
                nomeRegiao = "Leste";
                break;
            case 4:
                nomeRegiao = "Oeste";
                break;
            case 5:
                nomeRegiao = "Nordeste";
                break;
            case 6:
                nomeRegiao = "Nordeste";
                break;
            case 7:
                nomeRegiao = "Sudeste";
                break;
            case 8:
                nomeRegiao = "Sudeste";
                break;
            case 9:
                nomeRegiao = "Sudeste";
                break;
            case 10:
                nomeRegiao = "Centro-Oeste";
                break;
            case 11:
                nomeRegiao = "Noroeste";
                break;
            default:
                nomeRegiao = "Importado";
                break;
        }
        return nomeRegiao;
    }


}
