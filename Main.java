// Conteúdo do arquivo Main.java

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Camaro";
        carro1.marca = "Chevrolet";
        carro1.motor = "V8";
        carro1.preco = 280000.00;
        carro1.ano = 2002;

        Carro carro2 = new Carro("Lamborghini Aventador", "Lamborghini", "V12", 28000000.00, 2011);

        System.out.println("--- Detalhes do Carro 1 ---");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Motor: " + carro1.motor);
        System.out.println("Preço: R$" + String.format("%.2f", carro1.preco));
        System.out.println("Ano: " + carro1.ano);
        System.out.println();

        System.out.println("--- Detalhes do Carro 2 ---");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Motor: " + carro2.motor);
        System.out.println("Preço: R$" + String.format("%.2f", carro2.preco));
        System.out.println("Ano: " + carro2.ano);
    }
}

// Apenas remova "public" daqui se quiser manter no mesmo arquivo
class Carro { // Note que 'public' foi removido
    public String nome;
    public String marca;
    public String motor;
    public double preco;
    public int ano;

    public Carro() {
    }

    public Carro(String nome, String marca, String motor, double preco, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.motor = motor;
        this.preco = preco;
        this.ano = ano;
    }
}
