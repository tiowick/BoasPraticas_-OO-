package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {
        // sem passar nenhum parâmetro
    }
    /*
    Produto( String nomeInicial) {
        nome = nomeInicial;
    }
     */
    Produto( String nomeInicial, double precoInicial) {  //double descontoInicial){  //passando os tres parâmetros
        nome = nomeInicial;
        preco = precoInicial;
        //desconto = descontoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);

    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
