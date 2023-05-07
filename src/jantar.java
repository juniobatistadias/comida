public class jantar {
    public static void main(String[] args) {
        comida c1 = new comida("arroz",0.223);
        comida c2 = new comida ("feijao", 0.300);
        pessoa p = new pessoa ("joao", 99.8);

        System.out.println(p.apresentar());
        p.comer(c1);
        System.out.println(p.apresentar());
        p.comer(c2);
        System.out.println(p.apresentar());




    }
}