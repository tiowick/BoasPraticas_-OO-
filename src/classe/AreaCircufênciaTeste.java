package classe;

public class AreaCircufênciaTeste {
    public static void main(String[] args) {

        AreaCircuferência a1 = new AreaCircuferência(10);
        a1.raio = 10;
        //a1.pi = 10;
        //AreaCircuferência a2 = new AreaCircuferência(5); // jeito 1
        //a2.raio = 100;
        //a2.pi = 5;

        //AreaCircuferência.PI = 3.1415; //acessando pi diretamente da classe

        System.out.println(a1.area());

        //AreaCircuferência.PI = 0.1; // valor d pi não associado a instância
        // irá retornar outro valor
        System.out.println(a1.area()); // pertence a instância
        System.out.println(AreaCircuferência.area(100)); // jeito 2 pertence a classe
        System.out.println(AreaCircuferência.PI);
        System.out.println(Math.PI);
        
    }
}
