package classe;

public class Me_desafio {
    // acessando um menbro de instância
    int a = 3;
    static int b = 4; // acessando pq é estático
    public static void main(String[] args) {
        Me_desafio p = new Me_desafio();
        System.out.println(p.a);

        System.out.println(b);

    }
}
