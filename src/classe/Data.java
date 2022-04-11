package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data()  {       //construtor padrão
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", this.dia, mes, ano);
    }
    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }

}
// se não informar, esse será o valor padrão ()
// byte, short, int, long -> 0
// float, double -> 0.0
// bolean -> false
// char -> ' \u0000'

// Objetos -> null (não aponta pra nenhum lugar da memória)