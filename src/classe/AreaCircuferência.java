package classe;

public class AreaCircuferência {
    double raio;
    static final double PI = 3.14;

    AreaCircuferência(double raioInicial){
        //PI = 3.14;
        raio = raioInicial;
    }

    double area () {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio){
        return PI * Math.pow(raio, 2);
    }
}
