public class Main {
    public static void main(String[] args) throws Exception {
        Gerente gerente1 = new Gerente("Leonardo", 1600, "Computação");
        System.out.println(gerente1.toString());

        Vendedor vendedor1 = new Vendedor("João", 1600, 650);
        System.out.println(vendedor1.toString());
    }
}
