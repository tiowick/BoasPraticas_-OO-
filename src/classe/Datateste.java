package classe;

public class Datateste {
    public static void main(String[] args) {
        Data d1 = new Data(); //vai ser padrão 01/01/1970 la no construtor
        d1.ano = 2022; // pode ser modificada
        var d2 = new Data(22,06,1999);
        //d2.dia = 22;
        //d2.mes = 06;
        //d2.ano = 1999;

        String dataFormatadad1 = d1.obterDataFormatada();

        System.out.println(dataFormatadad1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}
