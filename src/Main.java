public class Main {
    public static void main (String[] args){

        System.out.println("##################################################");
        System.out.println("AULA 1 - RESPOSTAS DOS EXERCÍCIOS COMPLEMENTARES");
        System.out.println("##################################################");

        VerificacaoParImpar verificacaoParImpar = new VerificacaoParImpar();
        verificacaoParImpar.recebeNumeroEntrada();

        VerificacaoNumeroInteiro verificacaoNumeroInteiro = new VerificacaoNumeroInteiro();
        verificacaoNumeroInteiro.recebeDadosEntrada();

        VerificacaoPositivoNegativo verificacaoPositivoNegativo = new VerificacaoPositivoNegativo();
        verificacaoPositivoNegativo.recebeValorEntrada();

        IdentificacaoRegiaoProduto identificacaoRegiaoProduto = new IdentificacaoRegiaoProduto();
        identificacaoRegiaoProduto.recebeCodigoProduto();
    }
}
