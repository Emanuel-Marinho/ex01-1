public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "João";
        pessoa1.anoNascimento = 1992;
        pessoa1.altura = 1.77;
        pessoa1.peso = 88.5;

        pessoa1.mostrarTudo();

        System.out.println("\n\n\n");

        System.out.println("Imc de " + pessoa1.nome + " é de " + String.format("%.2f", pessoa1.calcularIMC()));
        System.out.println("Quantidade de água " + String.format("%.2f",pessoa1.calcularQuantidadeAguaDiaria()) + " litros por dia");
        System.out.println("Idade de " + pessoa1.calcularIdade() + " anos");
    }
}
